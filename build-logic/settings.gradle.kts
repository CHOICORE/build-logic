rootProject.name = "build-logic"

pluginManagement {
    this.repositories {
        this.mavenCentral()
        this.gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    this.repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)


    @Suppress("UnstableApiUsage")
    this.repositories {
        this.mavenCentral()
        this.gradlePluginPortal()
    }

    this.versionCatalogs {
        this.create("libs") {
            this.from(files("../gradle/libs.versions.toml"))
        }
    }
}

