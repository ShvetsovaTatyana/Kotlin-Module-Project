package screens

import MenuItem
import data.DataBase
import screens.base.BaseMenuScreen

class ArchiveScreen(private val archiveTitle: String) : BaseMenuScreen() {

    override fun updateMenuItems() {
        menuItems.clear()
        menuItems.add(MenuItem.CreateItem("Создать заметку"))
        menuItems.addAll(
            DataBase.getNotes(archiveTitle).map { note -> MenuItem.NoteItem(note) }
        )
        menuItems.add(MenuItem.BackItem("Назад"))
    }

    override fun processInput(number: Int) {
        when (menuItems[number]) {
            is MenuItem.CreateItem -> {
                Navigation.navigateTo(
                    CreateNoteScreen(archiveTitle)
                )
            }

            is MenuItem.NoteItem -> {
                Navigation.navigateTo(
                    NoteScreen(note = (menuItems[number] as MenuItem.NoteItem).note)
                )
            }

            is MenuItem.BackItem -> {
                Navigation.back()
            }

            else -> {}
        }
    }
}
