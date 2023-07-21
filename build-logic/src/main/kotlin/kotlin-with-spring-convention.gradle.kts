val libs: VersionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")

plugins {
    id("spring-convention")
    id("me.choicore.conventions.bases.base-kotlin")
    kotlin("plugin.spring")

}
dependencies {

}