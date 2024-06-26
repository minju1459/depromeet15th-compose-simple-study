plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
    id ("kotlin-parcelize")
}

android {
    namespace = "com.example.composestudy"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.composestudy"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    // Core KTX
    implementation("androidx.core:core-ktx:1.13.1")

    // Lifecycle components
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.1")

    // Activity Compose
    implementation("androidx.activity:activity-compose:1.9.0")

    // Compose BOM (Bill of Materials)
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))

    // Compose UI
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")

    // Compose Material3
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.material3:material3:1.3.0-beta02")

    // Testing dependencies
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    // Orbit library
    implementation("org.orbit-mvi:orbit-core:4.3.2")
    implementation("org.orbit-mvi:orbit-viewmodel:4.3.2")
    implementation("org.orbit-mvi:orbit-compose:4.3.2")
    testImplementation("org.orbit-mvi:orbit-test:4.3.2")

    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    // Coil Compose
    implementation("io.coil-kt:coil-compose:2.1.0")

    // Timber
    implementation("com.jakewharton.timber:timber:5.0.1")

    // Hilt
    implementation("com.google.dagger:hilt-android:2.46.1")
    androidTestImplementation("com.google.dagger:hilt-android-testing:2.40.5")
    kaptAndroidTest("com.google.dagger:hilt-android-compiler:2.46.1")
    kapt("com.google.dagger:hilt-android-compiler:2.46.1")

    implementation ("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.1")
}
