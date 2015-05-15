name := "$name;format="lower,hyphen"$"

version := "$version$"

scalaVersion := "$scalaVersion$"

scalacOptions := Seq(
  "-unchecked", "-deprecation", 
  "-encoding", "utf8", 
  "-Xelide-below", annotation.elidable.ALL.toString
)

persistLauncher := true

libraryDependencies ++= Seq(
  "io.github.widok" %%% "widok" % "$widokVersion$"
)
