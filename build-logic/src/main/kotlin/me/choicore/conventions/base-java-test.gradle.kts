package me.choicore.conventions

val libs: VersionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")

plugins {
    id("me.choicore.conventions.base-java")
}

dependencies {
    testRuntimeOnly(libs.findLibrary("junit-jupiter-engine").get())
    testImplementation(libs.findBundle("junit").get())
}