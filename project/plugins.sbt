addSbtPlugin("org.scala-js"           % "sbt-scalajs"                % "1.19.0")
addSbtPlugin("ch.epfl.scala"          % s"sbt-scalajs-bundler"       % "0.21.1")
addSbtPlugin("com.github.sbt"         % "sbt-ci-release"             % "1.11.1")
addSbtPlugin("io.github.nafg.mergify" % "sbt-mergify-github-actions" % "0.9.0")
libraryDependencies += "io.github.nafg.scalac-options" %% "scalac-options" % "0.3.0"

ThisBuild / libraryDependencySchemes += "org.scala-lang.modules" %% "scala-xml" % VersionScheme.Always
