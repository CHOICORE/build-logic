val libs: VersionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")
val jdk = libs.findVersion("jdk").get()

plugins {
    id("java-with-junit-convention")
    id("me.choicore.conventions.bases.base-kotlin")
}
