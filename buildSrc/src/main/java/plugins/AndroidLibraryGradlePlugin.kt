package plugins

import deps.GradlePluginsConfig.androidLibrary
import org.gradle.api.Project

class AndroidLibraryGradlePlugin : BaseAndroidGradlePlugin() {
    override fun apply(target: Project) {
        target.addLibraryPlugin()
        target.addAndroidBlock()
        super.apply(target)
    }
}

internal fun Project.addLibraryPlugin() {
    plugins.apply(androidLibrary)
}