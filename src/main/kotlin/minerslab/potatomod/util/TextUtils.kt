package minerslab.potatomod.util

import net.minecraft.ChatFormatting
import kotlin.enums.enumEntries

val RAINBOW_COLORS = enumEntries<ChatFormatting>().filter { it.isColor }

fun String.rainbow(interval: Long = 40): String {
    val offset = (System.currentTimeMillis() / interval % RAINBOW_COLORS.size).toInt()
    var result = ""
    for ((index, character) in withIndex())
        result += RAINBOW_COLORS[(RAINBOW_COLORS.size - offset + index) % RAINBOW_COLORS.size].toString() + character
    return result
}

