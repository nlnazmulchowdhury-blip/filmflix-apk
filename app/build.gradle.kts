plugins {
    id("com.android.application")
}

android {
    namespace = "com.filmflix.hub"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.filmflix.hub"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
