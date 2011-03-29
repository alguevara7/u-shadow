import sbt._

class Plugins(info: ProjectInfo) extends PluginDefinition(info) {
  val appenginePlugin = "net.stbbs.yasushi" % "sbt-appengine-plugin" % "2.1"
  lazy val eclipsePlugin = "de.element34" % "sbt-eclipsify" % "0.7.0"
}

