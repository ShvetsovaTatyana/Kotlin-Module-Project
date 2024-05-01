package screens

import MenuItem
import Navigation
import data.Note
import screens.base.BaseMenuScreen

class NoteScreen(private val note: Note) : BaseMenuScreen() {

    override fun updateMenuItems() {
        menuItems.clear()
        menuItems.add(MenuItem.ShowNoteContent())
        menuItems.add(MenuItem.BackItem("Назад"))
    }

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
