package minerslab.potatomod

import minerslab.potatomod.client.ClientProxy
import minerslab.potatomod.common.CommonProxy
import minerslab.potatomod.common.PotatoRegistrate
import net.neoforged.fml.common.Mod
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import thedarkcolour.kotlinforforge.neoforge.KotlinModLoadingContext
import thedarkcolour.kotlinforforge.neoforge.forge.runForDist

@Mod(PotatoMod.ID)
object PotatoMod {

    const val ID = "potatomod"

    @JvmField
    val LOGGER: Logger = LogManager.getLogger(ID)

    private val context = KotlinModLoadingContext.get()

    @JvmField
    val REGISTRATE = PotatoRegistrate(ID).apply { registerRegistrate(context.getKEventBus()) }

    val proxy = runForDist({ ClientProxy(context) }, { CommonProxy(context) })

    init {
        proxy.init()
    }

}