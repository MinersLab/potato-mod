package minerslab.potatomod.common.item

import minerslab.potatomod.util.rainbow
import net.minecraft.client.resources.language.I18n
import net.minecraft.network.chat.Component
import net.minecraft.network.chat.MutableComponent
import net.minecraft.network.chat.Style
import net.minecraft.world.item.Item
import net.minecraft.world.item.ItemStack

class RainbowPotatoItem(properties: Properties) : Item(properties) {

    override fun getName(stack: ItemStack): MutableComponent =
        Component.literal(I18n.get(getDescriptionId(stack)).rainbow(90)).withStyle(Style.EMPTY.withBold(true))

}