class Run(contents: MutableList<Tile>) : Set(contents) {
    private val colour: Colour

    init {
        for (i in 1 until contents.size) {
            if (contents[i].value != contents[i - 1].value + 1) {
                throw IllegalArgumentException("Runs must have consecutive elements")
            } else if (contents[i].colour != contents[i - 1].colour) {
                throw IllegalArgumentException("Runs must all be of the same colour")
            }
        }
        colour = contents[0].colour
    }

}