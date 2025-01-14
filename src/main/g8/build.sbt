// give the user a nice default project!
ThisBuild / organization := "$organizationName$"
ThisBuild / scalaVersion := "3.5.2"

enablePlugins(ScalaJSPlugin)

lazy val root = (project in file(".")).
  settings(
    name := "$name$",
    version := "$version$",
    // This is an application with a main method
    scalaJSUseMainModuleInitializer := true,
    libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.8.0",
    // To make the DOM available
    jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv(),
    // For testing
    libraryDependencies += "com.lihaoyi" %%% "utest" % "0.8.5" % Test,
    testFrameworks += new TestFramework("utest.runner.Framework")
  )