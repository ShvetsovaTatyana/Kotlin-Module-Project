package screens

import MenuItem
import Navigation
import data.DataBase
import screens.base.BaseMenuScreen

class ArchiveListScreen : BaseMenuScreen() {

    override fun updateMenuItems() {
        menuItems.clear()
        menuItems.add(MenuItem.CreateItem("Создать архив"))
        menuItems.addAll(
            DataBase.getArchives().map { archiveTitle -> MenuItem.ArchiveItem(archiveTitle) }
        )
        menuItems.add(MenuItem.BackItem("Выход"))
    }

    override fun processInput(number: Int) {
        when (menuItems[number]) {
            is MenuItem.CreateItem -> {
                Navigation.navigateTo(
                    CreateArchiveScreen()
                )
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
