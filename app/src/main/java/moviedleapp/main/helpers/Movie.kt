package moviedleapp.main.helpers

data class Movie(
    private val id: Int = 1,
    private val title: String = "UNKNOWN",
    private val type: String = "UNKNOWN",
    private val genre: String = "UNKNOWN",
    private val director: String = "UNKNOWN",
    private val rank: String = "UNKNOWN",
    private val releaseYear: String = "UNKNOWN"
) {
   fun getTitle(): String {
        return title
    }
}