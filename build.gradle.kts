plugins {
    kotlin("jvm") version "1.3.72"
}

group = "com.joyousjake.gradebook"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    testImplementation("org.spekframework.spek2:spek-dsl-jvm:2.0.9")
    testImplementation("org.junit.jupiter:junit-jupiter:5.6.2")
    testRuntimeOnly("org.spekframework.spek2:spek-runner-junit5:2.0.9")

    testRuntimeOnly("org.jetbrains.kotlin:kotlin-reflect:1.3.72")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    test {
        useJUnitPlatform {
            includeEngines("spek2")
        }
    }
}