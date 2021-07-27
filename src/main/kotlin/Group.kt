class Group(contents: MutableList<Tile>) : Set(contents) {
    private val value: Int
    private val colours = MutableList<Colour>(0) { Colour.Black }
    // Colour doesn't matter as none are made

    init {
        if (contents.size > 4) {
            throw IllegalArgumentException("Groups cannot be larger than 4 elements")
        }
        value = contents[0].value
        for (tile: Tile in contents) {
            if (tile.value != value) {
                throw IllegalArgumentException("Tiles in a group must all have the same value")
            } else if (tile.colour in colours) {
                throw IllegalArgumentException(
                    "Tiles in a group must all have the different colours"
                )
            } else {
                colours.add(tile.colour)
            }
        }
    }
}