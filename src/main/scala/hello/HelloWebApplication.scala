package hello

import org.springframework.boot.SpringApplication
/**
 * This object bootstraps Spring Boot web application.
 * Via Gradle: gradle bootRun
 */
object HelloWebApplication {

	def main(args: Array[String]) {
	   SpringApplication.run(classOf[HelloConfig]);
	}
}