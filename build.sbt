name := """228189_tutorial"""
organization := "PWR"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.4"

libraryDependencies += guice

//herokuProcessTypes in Compile := Map(
//  "web" -> "target/universal/stage/bin/my-app -Dhttp.port=$PORT",
//  "worker" -> "java -jar target/universal/stage/lib/my-worker.jar"
//)