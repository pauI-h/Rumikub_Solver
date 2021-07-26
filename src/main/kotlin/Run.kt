class Run(contents: MutableList<Tile>) : Set(contents) {
    private val colour: Colour

    init {
        this.contents = this.contents.sortedWith(compareBy { it.value })
        for (i in 1 until contents.size) {
            if (contents[i].value != contents[i - 1].value + 1) {
                throw IllegalArgumentException("Runs must have consecutive elements")
            }
        }
        colour = contents[0].colour
    }

}