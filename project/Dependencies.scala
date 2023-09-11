import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.17" % Test
  lazy val scalaCheck =
    "org.scalatestplus" %% "scalacheck-1-17" % "3.2.16.0" % Test

  lazy val catsCore = "org.typelevel" %% "cats-core" % "2.9.0"
  lazy val mockito = "org.scalatestplus" %% "mockito-4-11" % "3.2.16.0" % Test
}
