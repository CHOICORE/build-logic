dependencyResolutionManagement {
    this.versionCatalogs {
        this.create("libs") {
            this.from(files("../gradle/libs.versions.toml"))
        }
    }
}

rootProject.name = "build-logic"