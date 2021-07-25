import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class HurryingWalkerTest{
    @Test
    fun testWalk(){
        val human = HurryingWalker(8)
        val expected = "I'm in a hurry, so my speed is equal to 8 km/h"
        assertEquals(expected, human.walk())
    }
}