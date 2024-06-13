// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application").version("8.4.2").apply(false)
    id("com.android.library").version("8.4.2").apply(false)
    kotlin("android").version("1.9.0").apply(false)
    id("io.gitlab.arturbosch.detekt").version("1.23.1").apply(false)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.layout.buildDirectory)
}