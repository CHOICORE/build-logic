rootProject.name = "kotlin-spring-plugin-convention"

pluginManagement {
    includeBuild("build-logic")
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    this.repositories {
        mavenCentral()
    }
}

