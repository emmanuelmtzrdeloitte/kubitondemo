plugins {
    kotlin("jvm") version "1.9.24"
}

group = "org.granjamartinez"
version = "0.0.1"

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}

kotlin {
    jvmToolchain(8)
}

dependencies {
    testImplementation("io.appium:java-client:9.4.0")
    testImplementation("org.testng:testng:7.11.0")
    testImplementation(kotlin("test"))
}

tasks.test {
    maxParallelForks = 1
    useTestNG()
}