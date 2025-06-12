plugins {
    id("java")
}

group = "org.kobiton"
version = "0.0.1"

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}

dependencies {
    testImplementation("io.appium:java-client:8.6.0")
    testImplementation("org.testng:testng:7.5.1")
}

tasks.test {
    useTestNG()
}