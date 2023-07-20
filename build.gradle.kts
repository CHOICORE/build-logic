val libs: VersionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")

plugins {
    //id("me.choicore.conventions.base-java")
    id("me.choicore.conventions.base-kotlin")
}

group = "me.choicore.conventions"
version = "0.0.1"
