package data

object DataBase {
    private val dataBase: MutableMap<String, ArrayList<Note>> = mutableMapOf(
        "Архив 1" to arrayListOf(
            Note("Заметка 1", "Текст заметки 1"),
            Note("Заметка 2", "Текст заметки 2")
        )
    )

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
