package data

object DataBase {
    private val dataBase: MutableMap<String, ArrayList<Note>> = mutableMapOf()

    fun getArchives(): List<String> {
        return dataBase.keys.toList()
    }

    fun getNotes(archive: String): List<Note> {
        return dataBase[archive] ?: listOf()
    }

    fun createArchive(title: String) {
        dataBase[title] = arrayListOf()
    }

    fun addNote(note: Note, archiveTitle: String) {
        dataBase[archiveTitle]?.add(note)
    }
}
