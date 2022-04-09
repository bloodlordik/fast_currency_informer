object Dependencies {
    val coreKtx by lazy { "androidx.core:core-ktx:${Version.androidCore}" }
    val appCompat by lazy { "androidx.appcompat:appcompat:${Version.appcompat}" }
    val material by lazy { "com.google.android.material:material:${Version.material}" }
    val constraintlayout by lazy { "androidx.constraintlayout:constraintlayout:${Version.constraintLayout}" }
    val junit by lazy { "junit:junit:${Version.junit}" }
    val androidJunit by lazy { "androidx.test.ext:junit:${Version.androidJunit}" }
    val espresso by lazy { "androidx.test.espresso:espresso-core:${Version.espressoCore}" }
}