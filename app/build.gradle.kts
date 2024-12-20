plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.final_project_test"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.final_project_test"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // Retrofit for network requests
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

    // Gson for JSON parsing
    implementation ("com.google.code.gson:gson:2.8.9")

    // OkHttp for network calls
    implementation ("com.squareup.okhttp3:okhttp:4.10.0")

    // exp4j 依賴
    implementation ("net.objecthunter:exp4j:0.4.8")
}