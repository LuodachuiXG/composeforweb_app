import androidx.compose.runtime.Composable
import kotlinx.browser.document
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable
import pojo.App
import style.MyStyle

fun main() {
    val apps = listOf(
        App(
            name = "Halo 移动管理程序",
            imgUrl = "https://ldc-1251523367.cos.ap-beijing.myqcloud.com/luodachui/halo.png"
        )
    )

    renderComposable(rootElementId = "root") {
        Style(MyStyle)
        Div({classes(MyStyle.content)}) {
            apps(apps)
        }
    }
}


/**
 * App 卡片集合
 */
@Composable
fun apps(apps: List<App>) {
    Div({
        classes(MyStyle.appDiv)
    }) {
        for (app in apps) {
            appCard(app)
        }
    }
}

/**
 * App 卡片
 */
@Composable
fun appCard(app: App) {
    Div({classes(MyStyle.appCard)}) {
        Div({classes(MyStyle.appImgDiv)}) {
            Img(src = app.imgUrl, alt = app.name) {
                classes(MyStyle.appImg)
            }
        }

        Div({classes(MyStyle.appInfoDiv)}) {
            Div({classes(MyStyle.appInfoTitle)}) {
                Text(app.name)
            }
            Div({classes(MyStyle.appInfo)}) {
                Text("版本：${app.version}")
            }
            Div({classes(MyStyle.appInfo)}) {
                Text("平台：${app.platform}")
            }
            Div({classes(MyStyle.appInfo)}) {
                Text("更新：${app.updateDate.toDateString()}")
            }
        }

    }
}

