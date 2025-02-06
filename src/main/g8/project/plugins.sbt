addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.18.1")
addSbtPlugin("org.scalablytyped.converter" % "sbt-converter" % "1.0.0-beta44")
// To make the DOM available
libraryDependencies += "org.scala-js" %% "scalajs-env-jsdom-nodejs" % "1.0.0"