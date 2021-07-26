import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TileTest {
    private val tile: Tile = Tile(1, Colour.Red)

    @Test
    fun testGetValue(){
        assertEquals(1, tile.value)
    }

    @Test
    fun testColour(){
        assertEquals(Colour.Red, tile.colour)
    }
}