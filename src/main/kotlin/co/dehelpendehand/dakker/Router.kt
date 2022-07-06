package co.dehelpendehand.dakker

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.coRouter

@Configuration
class Router {

  @Bean
  fun routes() = coRouter {
      GET("/generate-qr", ::generateQRCode)
  }
}
