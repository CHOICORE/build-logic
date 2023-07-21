package me.choicore.conventions.bases

val libs: VersionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")

plugins {
    id("me.choicore.conventions.bases.base")
    java
}

java {
    /**
     * Gets the project wide toolchain requirements that will be used for tasks requiring a tool from the toolchain (e.g. JavaCompile).
     */
    toolchain {
        languageVersion.set(JavaLanguageVersion.of("${libs.findVersion("jdk").get()}"))
    }
    /**
     * Adds a task sourcesJar that will package the Java sources of the main SourceSet in a JAR with classifier sources.
     */
    withSourcesJar()
    /**
     * Adds a task javadocJar that will package the output of the javadoc task in a JAR with classifier javadoc.
     */
    withJavadocJar()
}
