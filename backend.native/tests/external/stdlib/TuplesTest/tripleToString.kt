import kotlin.test.*
import kotlin.test.assertTrue
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

val t = Triple(1, "a", 0.07)
fun box() {
    assertEquals("(1, a, 0.07)", t.toString())
}
