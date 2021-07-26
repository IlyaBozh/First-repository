import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class HurryingWalkerTest{
    @Test
    fun walkTest(){
        val speed = 8
        val human = HurryingWalker(speed)
        val expected = "I'm in a hurry, so my speed is equal to 8 km/h"
        assertEquals(expected, human.walk())
    }
}