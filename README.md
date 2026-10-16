# FilmFlix Android APK

A native Android wrapper for the FilmFlix web app: https://filmbd.pages.dev

The APK is a WebView shell tuned for streaming — full-screen video, popup/new-tab
handling, in-app file chooser, cookie-based login (third-party cookies enabled for
embedded players), downloads handed to the system DownloadManager, and an offline
retry screen.

## Get the APK

1. Push to `main` (or run **Actions → Build APK → Run workflow**).
2. Open the finished run and download the **FilmFlix-APK** artifact.
3. Unzip and install on the phone: `FilmFlix-v1.0.0-debug.apk`
   (allow "install unknown apps" for your file manager).

## Build locally

Requires JDK 17 and the Android SDK (platform 34, build-tools 34.0.0):

```bash
./gradlew assembleDebug
# app/build/outputs/apk/debug/app-debug.apk
```

## Change the site URL

Edit `app/src/main/res/values/strings.xml` → `site_url`, then rebuild.
App id / package: `com.filmflix.hub`.

## Release build for Play Store

`assembleRelease` is unsigned. Create a keystore, add it under
`android { signingConfigs { release { ... } } }` in `app/build.gradle.kts`,
then run `./gradlew bundleRelease` for an `.aab`.
