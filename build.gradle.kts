plugins {
    kotlin("jvm") version "2.0.21"
}

group = "org.granjamartinez"
version = "0.0.1"

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    implementation("io.appium:java-client:9.4.0")
    implementation("org.testng:testng:7.11.0")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}