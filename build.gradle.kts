plugins {
    java
    id("com.gradleup.shadow") version "9.0.0"
}

group = "io.github.ludovicoflaviano"
version = "1.0.0"

description = "Personal settings GUI for Paper 1.21.11"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.21.11-R0.1-SNAPSHOT")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}

tasks {
    compileJava {
        options.encoding = "UTF-8"
        options.release.set(21)
    }
    jar { archiveClassifier.set("plain") }
    shadowJar { archiveClassifier.set("") }
    build { dependsOn(shadowJar) }
}
