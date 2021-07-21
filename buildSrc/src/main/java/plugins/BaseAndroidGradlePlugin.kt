package plugins

import deps.GradlePluginsConfig.kotlinAndroid
import deps.GradlePluginsConfig.kotlinKapt
import org.gradle.api.Plugin
import org.gradle.api.Project

open class BaseAndroidGradlePlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.configureKotlinAndroidPlugins()
    }
}

internal fun Project.configureKotlinAndroidPlugins() {
    plugins.apply(kotlinAndroid)
    plugins.apply(kotlinKapt)
}
