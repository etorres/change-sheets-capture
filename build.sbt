ThisBuild / organization := "es.eriktorr"
ThisBuild / version := "1.0.0"
ThisBuild / idePackagePrefix := Some("es.eriktorr.sheets")
Global / excludeLintKeys += idePackagePrefix

ThisBuild / scalaVersion := "2.13.10"

Global / cancelable := true
Global / fork := true
Global / onChangedBuildSource := ReloadOnSourceChanges

lazy val root =
  (project in file("."))
    .settings(
      name := "change-sheets-capture",
      libraryDependencies ++= Seq("com.disneystreaming.smithy4s" %%% "smithy4s-aws" % "0.16.8")
    )
    .enablePlugins(LambdaJSPlugin)
