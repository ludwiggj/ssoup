organization := "org.filippodeluca.ssoup"

name := "ssoup"

version := "1.0-SNAPSHOT"

scalaVersion := "2.12.3"

licenses := Seq("Apache License, Version 2.0" -> new URL("http://www.apache.org/licenses/LICENSE-2.0.html"))

libraryDependencies ++= Seq(
  "org.jsoup" % "jsoup" % "1.7.2",
  "org.specs2" %% "specs2-core" % "4.0.0" % "test",
  "org.mockito" % "mockito-all" % "1.9.0" % "test"
)

autoCompilerPlugins := true

scalacOptions in Test ++= Seq("-Yrangepos")

publishTo := Some(Resolver.file("file", new File(Path.userHome.absolutePath + "/.m2/repository")))

publishArtifact in Test := false

// Maven central cannot allow other repos.  We're ok here because the artifacts we
// we use externally are *optional* dependencies.
pomIncludeRepository := { x => false }

pomExtra := (
  <licenses>
    <license>
      <name>Apache License, Version 2.0</name>
      <url>http://www.apache.org/licenses/LICENSE-2.0.html</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
    <scm>
      <url>git@github.com:filosganga/scala-wurfl.git</url>
      <connection>scm:git:git@github.com:filosganga/scala-wurfl.git</connection>
    </scm>
    <developers>
      <developer>
        <id>filosganga</id>
        <name>Filippo De Luca</name>
        <url>http://filippodeluca.com</url>
      </developer>
    </developers>)