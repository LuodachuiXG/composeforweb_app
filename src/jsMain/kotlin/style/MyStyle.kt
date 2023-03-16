package style

import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.*
import kotlin.time.Duration.Companion.seconds

object MyColor {
    const val PRIMARY = "#2979ff"
    const val PRIMARY_DARK = "#2b85e4"
    const val PRIMARY_DISABLED = "#a0cfff"
    const val PRIMARY_LIGHT = "#ecf5ff"

    const val ERROR = "#fa3534"
    const val ERROR_DARK = "#dd6161"
    const val ERROR_DISABLED = "#fab6b6"
    const val ERROR_LIGHT = "#fef0f0"

    const val WARNING = "#ff9900"
    const val WARNING_DARK = "#f29100"
    const val WARNING_DISABLED = "#fcbd71"
    const val WARNING_LIGHT = "#fdf6ec"

    const val SUCCESS = "#19be6b"
    const val SUCCESS_DARK = "#18b566"
    const val SUCCESS_DISABLED = "#71d5a1"
    const val SUCCESS_LIGHT = "#dbf1e1"

    const val INFO = "#909399"
    const val INFO_DARK = "#82848a"
    const val INFO_DISABLED = "#c8c9cc"
    const val INFO_LIGHT = "#f4f4f5"

    const val CONTENT = "#606266"
    const val TITLE = "#303133"
}

object MyStyle : StyleSheet() {
    init {
        "*" style {
            margin(0.px)
            padding(0.px)
            property("user-select", "none")
            property("-moz-user-select", "none")
            property("-ms-user-select", "none")
            property("-webkit-user-select", "none")
        }

        "body, html, #root" style {
            width(100.percent)
            height(100.percent)
        }
    }

    val content by style {
        fontFamily("PingHei", "PingFang SC", "Helvetica Neue",
            "Work Sans", "Hiragino Sans GB", "Microsoft YaHei", "SimSun", "sans-serif")
    }

    val appDiv by style {
        padding(10.px)
    }

    @OptIn(ExperimentalComposeWebApi::class)
    val appCard by style {
        backgroundColor(Color.white)
        width(16.cssRem)
        borderRadius(20.px)
        overflow("hidden")
        display(DisplayStyle.InlineBlock)
        marginLeft(1.cssRem)
        marginBottom(1.cssRem)
        transitions {
            defaultTimingFunction(AnimationTimingFunction.EaseOut)
            defaultDuration(.3.s)
            properties("all")
        }

        animation("flipInx") {
            duration = listOf(1.s)
        }
        property("-o-animation", "flipInx")
        property("-webkit-animation", "flipInx")
        property("-moz-animation-duration", "1s")
        property("-o-animation-duration", "1s")
        property("-webkit-animation-duration", "1s")
        property("-moz-border-radius", 20.px)
        property("-webkit-border-radius", 20.px)
        property("box-shadow", "rgba(149, 157, 165, 0.2) 0 8px 24px")
        property("vertical-align", "top")

        self + hover style {
            property("box-shadow", "rgba(50, 50, 93, 0.25) 0 50px 100px -20px, rgba(0, 0, 0, 0.3) 0 30px 60px -30px")
            transform {
                translateY((-6).px)
            }
        }
    }

    val appImgDiv by style {
        position(Position.Relative)
    }

    val appImg by style {
        width(100.percent)
        property("object-fit", "cover")
        property("-webkit-user-drag", "none")
    }

    val appInfoDiv by style {
        backgroundColor(Color(MyColor.INFO_LIGHT))
        padding(1.cssRem)
    }

    val appInfoTitle by style {
        fontSize(1.1.em)
        fontWeight("bold")
        color(Color(MyColor.TITLE))
        marginBottom(10.px)
        property("user-select", "none")
    }

    val appInfo by style {
        color(Color(MyColor.CONTENT))
        marginBottom(2.px)
    }
}