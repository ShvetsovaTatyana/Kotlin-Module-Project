import data.Note

sealed class MenuItem(val title: String) {

    class CreateItem(title: String): MenuItem(title = title)

    class ArchiveItem(archiveTitle: String): MenuItem(title = archiveTitle)

    class NoteItem(val note: Note): MenuItem(title = note.title)

    class ShowNoteContent: MenuItem(title = "Показать заметку")

    class BackItem(title: String): MenuItem(title = title)

}
