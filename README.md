# Hilt Sample

Android Dagger Hilt Example

## Tech

- [Navigation Component](https://developer.android.com/guide/navigation) - Single Activity, four fragments.
- [Dagger Hilt](https://github.com/google/dagger) - Dependency Inject (alpha library)


<img src="https://github.com/lhoyong/DaggerHiltSample/blob/master/art/image.png"/>


### Dagger Hilt Gradle Setting

[root project](https://github.com/lhoyong/DaggerHiltSample/blob/master/build.gradle) gradle

~~~~groovy
 dependencies {
    classpath 'com.google.dagger:hilt-android-gradle-plugin:2.28-alpha'
 }
 
 allprojects {
    maven {
       url "https://androidx.dev/snapshots/builds/6543454/artifacts/repository/"
    }
 }
 ~~~~
 
 [app module](https://github.com/lhoyong/DaggerHiltSample/blob/master/app/build.gradle) gradle
 ~~~~groovy
 apply plugin: 'dagger.hilt.android.plugin'
 
 dependencies {
    implementation "com.google.dagger:hilt-android:2.28-alpha"
    kapt "com.google.dagger:hilt-android-compiler:2.28-alpha"

    implementation 'androidx.hilt:hilt-common:1.0.0-SNAPSHOT'
    implementation 'androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-SNAPSHOT'
    kapt 'androidx.hilt:hilt-compiler:1.0.0-SNAPSHOT'
 }
 ~~~~
 
 ## Reference
  - [AABrain Dagger Android Hilt](https://aakira.app/blog/2020/05/dagger-hilt/)
  - [Exploring Dagger-Hilt and what’s main differences from Dagger-Android](https://proandroiddev.com/exploring-dagger-hilt-and-whats-main-differences-with-dagger-android-c8c54cd92f18)
