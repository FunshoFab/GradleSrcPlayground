package plugins

import com.android.build.gradle.BaseExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class AndroidLibraryGradlePlugin : BaseAndroidGradlePlugin() {
    override fun apply(target: Project) {
        // Apply the most important plugin "com.android.library" before others
        target.configureAndroidLibraryPlugin()
        target.configureAndroidLibraryConfig()
        super.apply(target)
    }
}

internal fun Project.configureAndroidLibraryPlugin() {
    plugins.apply("com.android.library")
}

internal fun Project.configureAndroidLibraryConfig() =
    this.extensions.getByType<BaseExtension>().run {
        compileSdkVersion(30)
        defaultConfig {
            minSdkVersion(21)
            targetSdkVersion(30)
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
    }