rootProject.name = "kotlin-spring-plugin-convention"


pluginManagement {

    repositories {
        mavenCentral()
    }
}

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    this.repositories {
        mavenCentral()
    }
}

include("build-logic")
