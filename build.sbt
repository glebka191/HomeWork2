import _root_.sbt.Keys._

name := "HomeWork2"

version := "0.1"

scalaVersion := "2.11.12"

scalacOptions := List(
  "-encoding",
  "utf8",
  "-feature",
  "-unchecked",
  "-deprecation",
  "-target:jvm-1.8",
  "-language:_"
)

libraryDependencies += "org.scalatest"  %% "scalatest"    % "3.2.0" % "test"
libraryDependencies += "org.mockito"    % "mockito-core"  % "3.0.0" % "test"
libraryDependencies += "org.scala-lang" % "scala-reflect" % "2.13.3"