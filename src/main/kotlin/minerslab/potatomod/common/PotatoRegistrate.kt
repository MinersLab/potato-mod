package minerslab.potatomod.common

import com.tterrag.registrate.Registrate
import com.tterrag.registrate.util.nullness.NonNullFunction
import net.minecraft.world.item.Item
import net.neoforged.bus.api.IEventBus

open class PotatoRegistrate(modid: String) : Registrate(modid) {

    companion object Utils {
        @JvmField
        val ITEM = NonNullFunction<Item.Properties, Item> { Item(it) }
    }

    fun registerRegistrate(eventBus: IEventBus) {
        registerEventListeners(eventBus)
    }

}