package deps

import org.gradle.api.JavaVersion

object AndroidConfig {
    const val compileSdkVersion = 30
    const val minSdkVersion = 21
    const val targetSdkVersion = 30
    const val versionCode = 1
    const val versionName = "1.0.0"
    const val applicationId = "com.funshofab.gradlesrcplayground"
    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
}

object JavaConfig {
    val javaVersion = JavaVersion.VERSION_1_8
}

object GradlePluginsConfig {
    const val kotlin = "kotlin"
    const val kotlinKapt = "kotlin-kapt"
    const val kotlinAndroid = "kotlin-android"
    const val androidLibrary = "com.android.library"
    const val androidApplication = "com.android.application"
}