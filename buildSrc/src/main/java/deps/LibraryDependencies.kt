package deps

interface Library {
    val components: List<String>
}

object LibraryDependencies {
    object AndroidX : Library {
        object Version {
            const val CORE_KTX = "1.3.2"
            const val APP_COMPAT = "1.2.0"
        }

        const val CORE_KTX = "androidx.core:core-ktx:${Version.CORE_KTX}"
        const val APP_COMPAT = "androidx.appcompat:appcompat:${Version.APP_COMPAT}"

        override val components: List<String> =
            listOf(CORE_KTX, APP_COMPAT)
    }

    object View : Library {
        object Version {
            const val MATERIAL = "1.2.1"
            const val CONSTRAINT_LAYOUT = "2.0.4"
        }

        const val MATERIAL = "com.google.android.material:material:${Version.MATERIAL}"
        const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${Version.CONSTRAINT_LAYOUT}"

        override val components: List<String> =
            listOf(MATERIAL, CONSTRAINT_LAYOUT)
    }

    object Test {
        object Version {
            const val JUNIT = "4.13.1"
        }

        const val JUNIT = "junit:junit:${Version.JUNIT}"
    }
}