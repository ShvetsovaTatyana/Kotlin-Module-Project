import screens.ArchiveListScreen
import screens.BaseScreen
import java.util.Stack

object Navigation {
    private val screenStack: Stack<BaseScreen> = Stack()

    init {
        screenStack.add(ArchiveListScreen())
    }

    val currentScreen: BaseScreen?
        get() = if (screenStack.empty()) null else screenStack.last()

    fun navigateTo(screen: BaseScreen) {
        screenStack.add(screen)
    }

    fun back() {
        screenStack.pop()
    }
}
