package plugins

import org.gradle.api.Project

class AndroidLibraryGradlePlugin : BaseAndroidGradlePlugin() {
    override fun apply(target: Project) {
        // Apply the most important plugin "com.android.library" before others
        target.configureAndroidLibraryPlugins()
        super.apply(target)
    }
}

internal fun Project.configureAndroidLibraryPlugins() {
    plugins.apply("com.android.library")
}