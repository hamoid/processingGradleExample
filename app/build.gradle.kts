plugins {
    application
}

repositories {
    mavenCentral()
    maven {
        url = uri("https://jitpack.io")
    }
}

dependencies {
    implementation("com.github.micycle1:processing-core-4:4.0.1")
}

application {
    mainClass.set("demo.App")
}
