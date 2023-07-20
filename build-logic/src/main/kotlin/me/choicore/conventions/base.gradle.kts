package me.choicore.conventions

plugins {
    base
}

if (project != rootProject) {
    project.group = rootProject.group
    project.version = rootProject.version
}
