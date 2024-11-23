package minerslab.potatomod.data.item

import net.minecraft.world.food.FoodProperties

object ModFoods {

    @JvmField
    val FRIES: FoodProperties = FoodProperties.Builder()
        .saturationModifier(0.15f)
        .alwaysEdible()
        .fast()
        .build()

}