package style

import org.jetbrains.compose.web.css.*

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
}

object MyStyle : StyleSheet() {
    val content by style {
        fontFamily("PingHei", "PingFang SC", "Helvetica Neue",
            "Work Sans", "Hiragino Sans GB", "Microsoft YaHei", "SimSun", "sans-serif")
        color(Color.red)
    }

    val tips by style {
        background(MyColor.WARNING_LIGHT)
    }
}