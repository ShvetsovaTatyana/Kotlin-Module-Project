package screens

import java.util.Scanner

abstract class BaseScreen(protected val menuItems: List<String>) {
    private val scanner: Scanner = Scanner(System.`in`)

    fun showMenu() {
        for (i in 0 until menuItems.size) {
            println("$i. ${menuItems[i]}")
        }
        readInput()
    }

    private fun readInput() {
        val input = scanner.nextLine()
        try {
            val number = input.toInt()
            if (number > menuItems.size - 1) {
                println("Введите корректный номер пункта меню")
                showMenu()
            } else {
                processInput(number)
            }
        } catch (e: Throwable) {
            println("Введите цифру - номер пункта меню")
            showMenu()
        }
    }

    abstract fun processInput(number: Int)
}
