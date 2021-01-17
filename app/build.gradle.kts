import deps.LibraryDependencies.AndroidX
import deps.LibraryDependencies.Test
import deps.LibraryDependencies.View
import deps.Modules

plugins {
    id("com.funshofab.android")
}

dependencies {
    implementation(project(Modules.DATA))
    implementation(project(Modules.DOMAIN))

    implementation(AndroidX.APP_COMPAT)
    implementAll(AndroidX.components)
    implementAll(View.components)
    testImplementation(Test.JUNIT)
}