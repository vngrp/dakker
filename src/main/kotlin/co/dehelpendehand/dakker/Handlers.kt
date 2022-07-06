package co.dehelpendehand.dakker

import io.github.g0dkar.qrcode.QRCode
import org.springframework.core.io.ByteArrayResource
import org.springframework.http.MediaType.IMAGE_PNG_VALUE
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.bodyValueAndAwait
import java.io.ByteArrayOutputStream

suspend fun generateQRCode(request: ServerRequest): ServerResponse {
  val imageOut = ByteArrayOutputStream()

  QRCode("mailto:mel@dakker.com").render().writeImage(imageOut)

  return ServerResponse
    .ok()
    .bodyValueAndAwait(ByteArrayResource(imageOut.toByteArray(), IMAGE_PNG_VALUE))
}
