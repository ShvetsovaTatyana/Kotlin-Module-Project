package data

object DataBase {
    private val dataBase: MutableMap<String, ArrayList<Note>> = mutableMapOf()

    fun getArchives():List<String>{
        return dataBase.keys.toList()
    }

    // getNotes

    // createArchive

    // createNote
}
