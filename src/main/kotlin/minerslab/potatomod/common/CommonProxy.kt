package minerslab.potatomod.common

import minerslab.potatomod.PotatoMod
import minerslab.potatomod.PotatoMod.LOGGER
import minerslab.potatomod.compat.enderio.EnderIOCompat
import minerslab.potatomod.data.item.ModItems
import minerslab.potatomod.util.isModLoaded
import net.neoforged.bus.api.SubscribeEvent
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent
import thedarkcolour.kotlinforforge.neoforge.KotlinModLoadingContext

@Suppress("unused")
open class CommonProxy(protected val context: KotlinModLoadingContext) {

    fun init() {
        LOGGER.info("${PotatoMod.ID} is initializing!")
        ModItems.init()
        if (isModLoaded("enderio_base"))
            EnderIOCompat.init()
    }

    @SubscribeEvent
    fun onCommonSetup(event: FMLCommonSetupEvent) {
        LOGGER.info("$context $event")
    }

}
