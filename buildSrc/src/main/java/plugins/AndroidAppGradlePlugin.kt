package plugins

import deps.GradlePluginsConfig.androidApplication
import org.gradle.api.Project

class AndroidAppGradlePlugin : BaseAndroidGradlePlugin() {
    override fun apply(target: Project) {
        target.addApplicationPlugin()
        target.addAndroidBlock()
        super.apply(target)
    }
}

internal fun Project.addApplicationPlugin() {
    plugins.apply(androidApplication)
}
