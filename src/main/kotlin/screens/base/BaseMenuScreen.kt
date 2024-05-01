package screens.base

import MenuItem

abstract class BaseMenuScreen : BaseScreen() {
    protected val menuItems: ArrayList<MenuItem> = arrayListOf()

    override fun showScreen() {
        updateMenuItems()
        showMenu()
    }

    private fun showMenu() {
        for (i in menuItems.indices) {
            println("$i. ${menuItems[i].title}")
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

    abstract fun updateMenuItems()

    abstract fun processInput(number: Int)
}
