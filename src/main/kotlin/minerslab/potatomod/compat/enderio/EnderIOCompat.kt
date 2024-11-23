package minerslab.potatomod.compat.enderio

import com.enderio.base.api.capacitor.CapacitorData
import com.enderio.base.common.init.EIODataComponents
import com.enderio.base.common.item.capacitors.CapacitorItem
import com.tterrag.registrate.util.entry.ItemEntry
import com.tterrag.registrate.util.nullness.NonNullFunction
import minerslab.potatomod.PotatoMod.REGISTRATE

object EnderIOCompat {

    @JvmField
    var POTATO_CAPACITOR_ITEM: ItemEntry<CapacitorItem>? = null

    fun init() {
        POTATO_CAPACITOR_ITEM = REGISTRATE.item("potato_capacitor", NonNullFunction { CapacitorItem(it) })
            .properties {
                it.component(EIODataComponents.CAPACITOR_DATA, CapacitorData.simple(0.5F))
            }
            .register()
    }

}