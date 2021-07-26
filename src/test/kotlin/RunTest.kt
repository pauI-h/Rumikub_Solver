import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertNotNull

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RunTest {
    private val blueOne = Tile(1, Colour.Blue)
    private val blueTwo = Tile(2, Colour.Blue)
    private val blueThree = Tile(3, Colour.Blue)

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
}