package screens

import data.DataBase

class ArchiveListScreen: BaseScreen(
    menuItems = arrayListOf("Создать архив") + DataBase.getArchives() + "Выход"
) {
    override fun processInput(number: Int) {
        when (number) {
            0 -> println("Создаем архив")
            menuItems.size - 1 -> println("Выходим")
            else -> println("Выбрали архив ${menuItems[number]}")
        }
    }
}
