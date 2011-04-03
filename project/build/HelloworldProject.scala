import sbt._
import de.element34.sbteclipsify._

class HelloworldProject(info: ProjectInfo) extends AppengineProject(info) with JRebel with Eclipsify {
	
	val junitJar = "junit" % "junit" % "4.8.1" % "test"
	val mockitoJar = "org.mockito" % "mockito-core" % "1.8.5" % "test"
	
	val gaeTestingJar = "com.google.appengine" % "appengine-testing" % "1.4.2"
	val gaeApiJar = "com.google.appengine" % "appengine-api-1.0-sdk" % "1.4.2"
	val gaeApiLabsJar = "com.google.appengine" % "appengine-api-labs" % "1.4.2"
	val gaeApiStubsJar = "com.google.appengine" % "appengine-api-stubs" % "1.4.2"
	
  val jodaTimeJar = "joda-time" % "joda-time" % "1.6.2"	
	val scalaTestJar = "org.scalatest" % "scalatest" % "1.3"
	val commonsLangJar = "commons-lang" % "commons-lang" % "2.5"
	val commonsIoJar = "commons-io" % "commons-io" % "2.0"
	val slf4jJar = "org.slf4j" % "slf4j-api" % "1.6.1"
	
	val nekohtmlJar = "nekohtml" % "nekohtml" % "1.9.6.2"
	
	val wicketJar = "org.apache.wicket" % "wicket" % "1.4.16"	
	val wicketSpringJar = "org.apache.wicket" % "wicket-spring" % "1.4.16"
	
	val springCoreJar = "org.springframework" % "spring-core" % "3.0.5.RELEASE"
	val springContextJar = "org.springframework" % "spring-context" % "3.0.5.RELEASE"
	
}


