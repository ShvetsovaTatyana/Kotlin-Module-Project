package screens.base

import java.util.Scanner

abstract class BaseScreen {
    protected val scanner: Scanner = Scanner(System.`in`)

    abstract fun showScreen()
}
