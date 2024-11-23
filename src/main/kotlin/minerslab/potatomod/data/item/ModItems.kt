package minerslab.potatomod.data.item

import com.tterrag.registrate.util.entry.ItemEntry
import com.tterrag.registrate.util.nullness.NonNullFunction
import minerslab.potatomod.PotatoMod.REGISTRATE
import minerslab.potatomod.common.PotatoRegistrate.Utils.ITEM
import minerslab.potatomod.common.item.RainbowPotatoItem
import net.minecraft.world.item.Item

object ModItems {

    @JvmField
    val FRIES: ItemEntry<Item> = REGISTRATE.item("fries", ITEM)
        .properties { it.food(ModFoods.FRIES) }
        .register()

    @JvmField
    val RAINBOW_POTATO: ItemEntry<RainbowPotatoItem> = REGISTRATE.item("rainbow_potato", NonNullFunction { RainbowPotatoItem(it) })
        .properties { it.food(ModFoods.RAINBOW_POTATO) }
        .register()

    fun init() {
    }

}