import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TileTest {
    private val tile: Tile

    init {
        tile = Tile(1)
    }

    @Test
    fun testGetValue(){
        assertEquals(1, tile.value)
    }
}