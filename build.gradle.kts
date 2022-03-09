plugins {
    kotlin("jvm") version "1.6.10"
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}


repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")


    compileOnly("org.spigotmc:spigot:1.18.1-R0.1-SNAPSHOT")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}