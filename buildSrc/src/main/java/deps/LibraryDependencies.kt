package deps

interface Library {
    val components: List<String>
}

object LibraryDependencies {
    object AndroidX : Library {
        object Version {
            const val coreKtx = "1.3.2"
            const val appCompat = "1.2.0"
        }

        private const val coreKtx = "androidx.core:core-ktx:${Version.coreKtx}"
        private const val appCompat = "androidx.appcompat:appcompat:${Version.appCompat}"

        override val components: List<String> =
            listOf(coreKtx, appCompat)
    }

    object View : Library {
        object Version {
            const val material = "1.2.1"
            const val constraintLayout = "2.0.4"
        }

        private const val material = "com.google.android.material:material:${Version.material}"
        private const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Version.constraintLayout}"

        override val components: List<String> =
            listOf(material, constraintLayout)
    }

    object Test {
        object Version {
            const val junit = "4.13.1"
        }

        const val junit = "junit:junit:${Version.junit}"
    }
}