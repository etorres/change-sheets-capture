ThisBuild / version := "1.0.0"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "change-sheets-capture",
    idePackagePrefix := Some("es.eriktorr.sheets")
  )

enablePlugins(LambdaJSPlugin)
