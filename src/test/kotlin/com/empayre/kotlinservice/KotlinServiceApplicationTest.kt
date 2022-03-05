package dev.vality.kotlinservice

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@SpringBootTest(classes = [KotlinServiceApplication::class])
class KotlinServiceApplicationTest {

    @Test
    fun contextLoads() {
    }
}
