package plugins

import com.android.build.gradle.BaseExtension
import com.android.build.gradle.LibraryExtension
import deps.AndroidConfig
import deps.BuildTypeDebug
import deps.BuildTypeRelease
import deps.JavaConfig
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

internal fun Project.addAndroidBlock() = this.extensions.getByType<BaseExtension>().run {
    compileSdkVersion(AndroidConfig.compileSdkVersion)
    defaultConfig {
        if (this@run !is LibraryExtension)
            applicationId = AndroidConfig.applicationId

        minSdk = AndroidConfig.minSdkVersion
        targetSdk = AndroidConfig.targetSdkVersion
        versionCode = AndroidConfig.versionCode
        versionName = AndroidConfig.versionName
        testInstrumentationRunner = AndroidConfig.testInstrumentationRunner
    }

    buildTypes {
        getByName(BuildTypeDebug.name) {
            isMinifyEnabled = BuildTypeDebug.isMinifyEnabled
            isTestCoverageEnabled = BuildTypeDebug.isTestCoverageEnabled
        }

        getByName(BuildTypeRelease.name) {
            isMinifyEnabled = BuildTypeRelease.isMinifyEnabled
            isTestCoverageEnabled = BuildTypeRelease.isTestCoverageEnabled
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaConfig.javaVersion
        targetCompatibility = JavaConfig.javaVersion
    }

    project.tasks.withType(KotlinCompile::class.java).configureEach {
        kotlinOptions {
            jvmTarget = JavaConfig.javaVersion.toString()
        }
    }
}