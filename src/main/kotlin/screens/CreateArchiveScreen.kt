package screens

import Navigation
import data.DataBase
import screens.base.BaseScreen

class CreateArchiveScreen : BaseScreen() {
    override fun showScreen() {
        println("Введите название архива")
        var title = scanner.nextLine()
        while (title.isEmpty()) {
            println("Название архива не может быть пустым. Введите еще раз")
            title = scanner.nextLine()
        }
        DataBase.createArchive(title)
        Navigation.back()
    }
}
