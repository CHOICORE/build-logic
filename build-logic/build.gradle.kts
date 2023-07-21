plugins {
    `kotlin-dsl`
}
repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.gradlePlugin.springBoot)
    implementation(libs.gradlePlugin.kotlin)
    implementation(libs.kotlin.reflect)
    implementation(libs.kotlin.allopen)
    implementation(libs.kotlin.noarg)
}
