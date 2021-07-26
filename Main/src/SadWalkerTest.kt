import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SadWalkerTest {
    @Test
    fun walkTest() {
        val speed = 4
        val human = SadWalker(speed)
        val expected = "I am very sad, so my speed is equal to 4 km/h"
        assertEquals(expected, human.walk())
    }
}