import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable
import style.MyStyle

fun main() {
    renderComposable(rootElementId = "root") {
        Style(MyStyle)
        Div({
            classes(MyStyle.content)
        }) {
            tips()
        }
    }
}

@Composable
fun tips() {
    Div({
        classes(MyStyle.tips)
    }) {
        Text("该页面使用 Compose(Kotlin) 搭建")
    }
}

