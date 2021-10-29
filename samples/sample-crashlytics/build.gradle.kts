/*
 * Copyright (c) 2021 Touchlab
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    extra.apply {
        val parentKermit = java.util.Properties().apply { load(java.io.StringReader(File("${projectDir.path}/../../gradle.properties").readText())) }.get("VERSION_NAME") as String
        set("KERMIT_VERSION", parentKermit)
    }
    dependencies {
        fun readParentKotlin():String = java.util.Properties().apply { load(java.io.StringReader(File("${projectDir.path}/../../gradle.properties").readText())) }.get("KOTLIN_VERSION") as String

        classpath("com.android.tools.build:gradle:7.0.1")
        classpath(kotlin("gradle-plugin", readParentKotlin()))
        classpath("com.google.gms:google-services:4.3.10")
        classpath("com.google.firebase:firebase-crashlytics-gradle:2.7.1")
    }
}
allprojects{
    repositories{
        mavenLocal()
        mavenCentral()
        google()
    }
}
