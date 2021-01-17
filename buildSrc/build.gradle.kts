plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
    jcenter()
}

object Plugin {
    object Version {
        const val GRADLE = "7.0.0-alpha04"
        const val KOTLIN_GRADLE = "1.4.21"
    }

    const val GRADLE = "com.android.tools.build:gradle:${Version.GRADLE}"
    const val KOTLIN_GRADLE = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.KOTLIN_GRADLE}"
}

dependencies {
    implementation(Plugin.GRADLE)
    implementation(Plugin.KOTLIN_GRADLE)
    /* Depend on the default Gradle API's since we want to build a custom plugin */
    implementation(gradleApi())
    implementation(localGroovy())
}
