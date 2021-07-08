plugins {
    kotlin("jvm") version "1.5.10"
    application
}

group = "de.dertev"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

application {
    mainClass.set("de.dertev.kalge.KAlgeKt")
}