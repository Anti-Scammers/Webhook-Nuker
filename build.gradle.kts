plugins {
    kotlin("jvm") version "1.9.0"
    application
}

group = "me.trolman.ai"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("club.minnced:discord-webhooks:0.8.4")
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}