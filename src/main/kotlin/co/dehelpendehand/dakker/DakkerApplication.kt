package co.dehelpendehand.dakker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DakkerApplication

fun main(args: Array<String>) {
	runApplication<DakkerApplication>(*args)
}
