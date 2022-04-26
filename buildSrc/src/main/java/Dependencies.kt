object Dependencies {
    val coreKtx by lazy { "androidx.core:core-ktx:${Version.androidCore}" }
    val appCompat by lazy { "androidx.appcompat:appcompat:${Version.appcompat}" }
    val material by lazy { "com.google.android.material:material:${Version.material}" }
    val constraintlayout by lazy { "androidx.constraintlayout:constraintlayout:${Version.constraintLayout}" }
    val junit by lazy { "junit:junit:${Version.junit}" }
    val androidJunit by lazy { "androidx.test.ext:junit:${Version.androidJunit}" }
    val espresso by lazy { "androidx.test.espresso:espresso-core:${Version.espressoCore}" }
    val navigationFragment by lazy { "androidx.navigation:navigation-fragment-ktx:${Version.navigationFragment}" }
    val navigationUi by lazy { "androidx.navigation:navigation-ui-ktx:${Version.navigationFragment}" }
    val fragmentKtx by lazy { "androidx.fragment:fragment-ktx:${Version.fragmentKtx}" }
    val viewbindingpropertydelegate by lazy { "com.github.kirich1409:viewbindingpropertydelegate:${Version.viewbindingpropertydelegate}"}
    val retrofit2 by lazy { "com.squareup.retrofit2:${Version.retrofit2}" }
    val okhttp by lazy { "com.squareup.okhttp3:okhttp:${Version.okHttp}" }
}