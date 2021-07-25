import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SadWalkerTest {
    @Test
    fun testWalk() {
        val human = SadWalker(4)
        val expected = "I am very sad, so my speed is equal to 4 km/h"
        assertEquals(expected, human.walk())
    }
}