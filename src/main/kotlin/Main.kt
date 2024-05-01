fun main() {
    var currentScreen = Navigation.currentScreen
    while (currentScreen != null) {
        currentScreen.showScreen()
        currentScreen = Navigation.currentScreen
    }
}
