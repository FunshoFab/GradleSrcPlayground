package plugins

import org.gradle.api.Plugin
import org.gradle.api.Project

open class KotlinModuleGradlePlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.configureKotlin()
    }
}

internal fun Project.configureKotlin() {
    plugins.apply("kotlin")
}
