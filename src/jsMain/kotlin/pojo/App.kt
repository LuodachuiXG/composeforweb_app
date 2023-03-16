package pojo

import kotlin.js.Date

/**
 * App 程序信息
 */
data class App(
    // 程序名
    val name: String = "",
    // 程序图片地址
    val imgUrl: String = "",
    // 程序版本
    val version: String = "",
    // 运行平台
    val platform: String = "",
    // 更新时间
    val updateDate: Date = Date(),
    // 是否淘汰
    val isObsolete: Boolean = false,
    // 第一个按钮的地址
    val firstBtnUrl: String = "",
    // 第二个按钮的地址
    val secBtnUrl: String = "",
    // 第一个按钮的文字
    val firstBtnText: String = "阿里云盘",
    // 第二个按钮的文字
    val secBtnText: String = "本地下载",
    // 第一个按钮是否禁用
    val firstBtnDisable: Boolean = false,
    // 第二个按钮是否禁用
    val secBtnDisable: Boolean = false
)