import Dependencies._
import sbt.Keys.libraryDependencies

lazy val root = project
  .enablePlugins(ScalafmtPlugin)
  .in(file("."))
  .settings(
    name := "Scala Code Kata",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := projectScalaVersion,
    libraryDependencies += scalaTest % Test,
    libraryDependencies += mockito % Test
  )
val projectScalaVersion = "2.13.8"
