package plugins

import com.android.build.gradle.BaseExtension
import com.android.build.gradle.LibraryExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

class AndroidAppGradlePlugin : BaseAndroidGradlePlugin() {
    override fun apply(target: Project) {
        // Apply the most important plugin "com.android.application" before others
        target.configureAndroidApplicationPlugins()
        target.configureAndroidConfig()
        super.apply(target)
    }
}

internal fun Project.configureAndroidApplicationPlugins() {
    plugins.apply("com.android.application")
}

internal fun Project.configureAndroidConfig() = this.extensions.getByType<BaseExtension>().run {
    compileSdkVersion(30)
    defaultConfig {
        if (this@run !is LibraryExtension)
            applicationId = "com.funshofab.gradlesrcplayground"

        minSdkVersion(21)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0.0"
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("debug") {
            isTestCoverageEnabled = true
        }

        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    project.tasks.withType(KotlinCompile::class.java).configureEach {
        kotlinOptions {
            jvmTarget = JavaVersion.VERSION_1_8.toString()
        }
    }
}