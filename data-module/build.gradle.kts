plugins {
    idea
    kotlin("jvm")
}
dependencies{
    val jacksonVersion = "2.14.2"
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:$jacksonVersion")
}

repositories{
    mavenCentral()
}

group = "com.example"