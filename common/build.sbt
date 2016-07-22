lazy val commonSettings = Seq(
  organization := "net.psforever",
  version := "1.0",
  scalaVersion := "2.11.7",
  scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8"),
  resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
  libraryDependencies := Seq(
    "org.specs2"                 %% "specs2-core"   % "3.8.3" % "test",
    "org.scodec"                 %% "scodec-core"   % "1.10.0",
    "net.java.dev.jna"            % "jna"           % "4.2.1"
  )
)

lazy val common = (project in file("common")).
  settings(commonSettings: _*).
  settings(
    name := "common"
  )
