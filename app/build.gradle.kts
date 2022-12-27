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
    implementation("com.github.micycle1:processing-core-4:4.1.1")
    // Add dependencies from https://mvnrepository.com/
///    implementation("com.google.code.gson:gson:2.10")

    // Add dependencies from `../lib/` folder
//    implementation(
//        files(
//            "../lib/oscP5.jar",
//            "../lib/toxiclibscore.jar"
//        )
//    )
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
        vendor.set(JvmVendorSpec.ADOPTIUM)
    }
}


application {
    mainClass.set("demo.App")
}

// example of copying a `config` folder when building
//distributions {
//    main {
//        contents {
//            into("config") {
//                from("config")
//            }
//        }
//  }
//}

