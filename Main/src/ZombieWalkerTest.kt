import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ZombieWalkerTest{
    @Test
    fun walkTest() {
        val speed = 1
        val human = ZombieWalker(speed)
        val expected = "And by the way, I'm a zombie, so I'll chase you with 1 km/h"
        assertEquals(expected, human.walk())
    }
}