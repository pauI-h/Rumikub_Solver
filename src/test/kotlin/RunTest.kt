import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertNotNull

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RunTest {
    private val blueOne = Tile(1, Colour.Blue)
    private val blueTwo = Tile(2, Colour.Blue)
    private val blueThree = Tile(3, Colour.Blue)
    private val blueFour = Tile(4, Colour.Blue)
    private val yellowThree = Tile(3, Colour.Yellow)

    @Test
    fun testValid() {
        val tiles = mutableListOf(blueOne, blueTwo, blueThree)
        assertNotNull(Run(tiles))
    }

    @Test
    fun testTooShort() {
        val tiles = mutableListOf(blueOne, blueTwo)
        assertThrows<IllegalArgumentException>(
            "Sets must have size of at least 3"
        ) { Run(tiles) }
    }

    @Test
    fun testNonConsecutive() {
        val tiles = mutableListOf(blueOne, blueTwo, blueFour)
        assertThrows<IllegalArgumentException>(
            "Runs must have consecutive elements"
        ) { Run(tiles) }
    }

    @Test
    fun testWrongColour() {
        val tiles = mutableListOf(blueOne, blueTwo, yellowThree)
        assertThrows<IllegalArgumentException>("Runs must all be of the same colour")
        { Run(tiles) }
    }
}