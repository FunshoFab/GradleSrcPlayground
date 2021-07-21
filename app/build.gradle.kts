import deps.LibraryDependencies.AndroidX
import deps.LibraryDependencies.Test
import deps.LibraryDependencies.View
import deps.Modules

plugins {
    id("com.funshofab.android")
}

dependencies {
    implementation(project(Modules.data))
    implementation(project(Modules.domain))

    implementAll(AndroidX.components)
    implementAll(View.components)
    testImplementation(Test.junit)
}