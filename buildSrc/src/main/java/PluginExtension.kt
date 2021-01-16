import org.gradle.api.Project

internal fun Project.configureDefaultPlugins() {
    plugins.apply("com.android.application")
    plugins.apply("kotlin-android")
}