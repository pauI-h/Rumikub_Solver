abstract class Set(contents: MutableList<Tile>) {
    protected var contents: List<Tile>

    init {
        if (contents.size >= 3) {
            this.contents = contents
        } else {
            throw IllegalArgumentException("Sets must have size of at least 3")
        }
        this.contents = this.contents.sortedWith(compareBy { it.value })
    }
}