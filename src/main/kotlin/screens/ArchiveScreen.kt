package screens

import MenuItem
import data.DataBase
import data.Note

private fun getMenuItems(notes: List<Note>): List<MenuItem> {
    val menuItems: ArrayList<MenuItem> = arrayListOf()
    menuItems.add(MenuItem.CreateItem("Создать заметку"))
    menuItems.addAll(
        notes.map { note -> MenuItem.NoteItem(note) }
    )
    menuItems.add(MenuItem.BackItem("Назад"))
    return menuItems
}

class ArchiveScreen(archiveTitle: String): BaseScreen(
    menuItems = getMenuItems(DataBase.getNotes(archiveTitle))
) {
    override fun processInput(number: Int) {
        when (menuItems[number]) {
            is MenuItem.CreateItem -> {
                println("Создаем заметку")
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
