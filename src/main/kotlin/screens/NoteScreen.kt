package screens

import MenuItem
import Navigation
import data.Note

class NoteScreen(private val note: Note): BaseScreen(
    menuItems = arrayListOf(MenuItem.ShowNoteContent(), MenuItem.BackItem("Назад"))
) {
    override fun processInput(number: Int) {
        when (menuItems[number]) {
            is MenuItem.ShowNoteContent -> {
                println(note.content)
            }
            is MenuItem.BackItem -> {
                Navigation.back()
            }
            else -> {}
        }
    }
}
