package screens

import Navigation
import data.DataBase
import data.Note
import screens.base.BaseScreen

class CreateNoteScreen(private val archiveTitle: String) : BaseScreen() {
    override fun showScreen() {
        println("Введите название заметки")
        var title = scanner.nextLine()
        while (title.isEmpty()) {
            println("Название заметки не может быть пустым. Введите еще раз")
            title = scanner.nextLine()
        }
        println("Введите текст заметки")
        var content = scanner.nextLine()
        while (content.isEmpty()) {
            println("Текст заметки не может быть пустым. Введите еще раз")
            content = scanner.nextLine()
        }
        DataBase.addNote(
            archiveTitle = archiveTitle,
            note = Note(title, content)
        )
        Navigation.back()
    }
}
