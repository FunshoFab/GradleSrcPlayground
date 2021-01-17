package plugins

import org.gradle.api.Plugin
import org.gradle.api.Project

open class BaseAndroidGradlePlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.configureKotlinAndroidPlugins()
    }
}

internal fun Project.configureKotlinAndroidPlugins() {
    plugins.apply("kotlin-android")
    plugins.apply("kotlin-kapt")
}
