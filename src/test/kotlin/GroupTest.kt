import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertNotNull

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GroupTest {
    private val blueOne = Tile(1, Colour.Blue)
    private val redOne = Tile(1, Colour.Red)
    private val blackOne = Tile(1, Colour.Black)
    private val blackTwo = Tile(2, Colour.Black)
    private val yellowOne = Tile(1, Colour.Yellow)

    @Test
    fun testValid(){
        val tiles = mutableListOf(blueOne, redOne, blackOne)
        assertNotNull(Group(tiles))
    }

    @Test
    fun testDifferentNumbers() {
        val tiles = mutableListOf(blueOne, redOne, blackTwo)
        assertThrows<IllegalArgumentException>(
            "Tiles in a group must all have the same value"
        ) { Group(tiles) }
    }

    @Test
    fun testTooLong() {
        val tiles = mutableListOf(blueOne, redOne, blackOne, yellowOne, blueOne)
        assertThrows <IllegalArgumentException> ("Groups cannot be larger than 4 tiles") {
            Group(tiles)
        }
    }
}