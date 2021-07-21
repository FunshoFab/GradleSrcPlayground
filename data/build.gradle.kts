import deps.LibraryDependencies.AndroidX
import deps.LibraryDependencies.Test

plugins {
    id("com.funshofab.library")
}

dependencies {
    implementAll(AndroidX.components)
    testImplementation(Test.junit)
}