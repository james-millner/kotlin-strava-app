package test.kotlin.strava

import org.apache.commons.io.IOUtils
import org.springframework.mock.web.MockMultipartFile
import org.springframework.util.ResourceUtils
import org.springframework.web.multipart.MultipartFile
import java.io.FileInputStream
import java.nio.charset.StandardCharsets

fun getResource(resource: String): String {
    val file = ResourceUtils.getFile(resource)
    val inputStream = FileInputStream(file)
    return IOUtils.toString(inputStream, StandardCharsets.UTF_8.name())
}