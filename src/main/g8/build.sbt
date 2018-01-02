
lazy val `$name$` = (project in file("."))
  .settings(
	libraryDependencies += "com.github.dnvriend" %% "sam-annotations" % "1.0.9",
    libraryDependencies += "com.github.dnvriend" %% "sam-lambda" % "1.0.9",
    libraryDependencies += "com.amazonaws" % "aws-lambda-java-core" % "1.2.0",
    libraryDependencies += "com.amazonaws" % "aws-java-sdk-sns" % "1.11.255",
    libraryDependencies += "com.gu" %% "scanamo" % "1.0.0-M3",
    resolvers += Resolver.bintrayRepo("dnvriend", "maven"),
    scalaVersion := "2.12.4",
    description := "simple sam component with sns topics",
    samStage := "$stage$",
    organization := "$organization$"
  )