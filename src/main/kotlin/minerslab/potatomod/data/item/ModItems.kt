package minerslab.potatomod.data.item

import com.tterrag.registrate.util.entry.ItemEntry
import minerslab.potatomod.PotatoMod.REGISTRATE
import minerslab.potatomod.common.PotatoRegistrate.Utils.ITEM
import net.minecraft.world.food.Foods
import net.minecraft.world.item.Item

object ModItems {

    @JvmField
    val FRIES: ItemEntry<Item> = REGISTRATE.item("fries", ITEM)
        .properties { it.food(ModFoods.FRIES) }
        .register()

    fun init() {
        Foods.POTATO
    }

}