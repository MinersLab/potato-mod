package minerslab.potatomod.util

import net.neoforged.fml.ModList

fun isModLoaded(id: String) = ModList.get().isLoaded(id)