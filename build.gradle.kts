plugins {
    id("java")
    id("application")
}

group = "com.supergamer"
version = "1.0"

repositories {
    mavenCentral()
}


dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

java{
    toolchain{
        languageVersion = JavaLanguageVersion.of(17);
    }
}

tasks.test {
    useJUnitPlatform()
}

application{
    mainClass.set("com.supergamer.Main")
}