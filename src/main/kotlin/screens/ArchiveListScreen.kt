package screens

import MenuItem
import Navigation
import data.DataBase

private fun getMenuItems(archives: List<String>): List<MenuItem> {
    val menuItems: ArrayList<MenuItem> = arrayListOf()
    menuItems.add(MenuItem.CreateItem("Создать архив"))
    menuItems.addAll(
        archives.map { archiveTitle -> MenuItem.ArchiveItem(archiveTitle) }
    )
    menuItems.add(MenuItem.BackItem("Выход"))
    return menuItems
}

class ArchiveListScreen: BaseScreen(
    menuItems = getMenuItems(DataBase.getArchives())
) {
    override fun processInput(number: Int) {
        when (menuItems[number]) {
            is MenuItem.CreateItem -> {
                println("Создаем архив")
            }
            is MenuItem.ArchiveItem -> {
                Navigation.navigateTo(
                    ArchiveScreen(archiveTitle = menuItems[number].title)
                )
            }
            is MenuItem.BackItem -> {
                Navigation.back()
            }
            else -> {}
        }
    }
}
