import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ZombieWalkerTest{
    @Test
    fun testWalk() {
        val human = ZombieWalker(1)
        val expected = "And by the way, I'm a zombie, so I'll chase you with 1 km/h"
        assertEquals(expected, human.walk())
    }
}