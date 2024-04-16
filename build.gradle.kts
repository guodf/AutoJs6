// Top-level build file where you can add configuration options common to all sub-projects/modules.

// @Hint by SuperMonster003 on Aug 16, 2023.
//  !  Blocks "buildscript" and "plugins" have been moved to "settings.gradle.kts".

extra.apply {
    set("configurationName", "default")
}

allprojects {
    repositories {
        maven("https://mirrors.cloud.tencent.com/nexus/repository/maven-public")
        maven("https://repo.huaweicloud.com/repository/maven/")
        maven("https://maven.aliyun.com/nexus/content/repositories/central")
        maven("https://maven.aliyun.com/nexus/content/repository/google")
        maven("https://maven.aliyun.com/nexus/content/repository/gradle-plugin")
        maven("https://maven.aliyun.com/nexus/content/repository/jcenter")

        maven("https://maven.aliyun.com/repository/public")
        maven("https://maven.aliyun.com/repositories/central")
        maven("https://maven.aliyun.com/repository/google")
        maven("https://maven.aliyun.com/repository/gradle-plugin")
        maven("https://maven.aliyun.com/repository/jcenter")
        maven("https://maven.aliyun.com/repository/public")
        mavenCentral()
        google()
        maven("https://jitpack.io")
        gradlePluginPortal()
    }
}

tasks {
    register<Delete>("clean").configure {
        // @Legacy delete(rootProject.buildDir)
        delete(rootProject.layout.buildDirectory)
    }
}