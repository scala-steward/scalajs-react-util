name := "scalajs-react-util"

ThisBuild / scalaVersion := "2.12.6"
ThisBuild / organization := "io.github.nafg.scalajs-react-util"

def addScalajsReactModule(name: String) = libraryDependencies += "com.github.japgolly.scalajs-react" %%% name % "1.3.1"

publish / skip := true

lazy val core =
  project
    .enablePlugins(ScalaJSBundlerPlugin)
    .settings(
      moduleName := "core",
      addScalajsReactModule("extra")
    )

lazy val editor =
  project
    .enablePlugins(ScalaJSBundlerPlugin)
    .dependsOn(core)
    .settings(
      addScalajsReactModule("ext-monocle-cats"),
    )
