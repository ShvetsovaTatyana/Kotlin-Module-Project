
fun main() {
    var currentScreen = Navigation.currentScreen
    while (currentScreen != null) {
        currentScreen.showMenu()
        currentScreen = Navigation.currentScreen
    }
}
