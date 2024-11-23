package minerslab.potatomod.data.item

import net.minecraft.world.effect.MobEffectInstance
import net.minecraft.world.effect.MobEffects
import net.minecraft.world.food.FoodProperties

object ModFoods {

    @JvmField
    val FRIES: FoodProperties = FoodProperties.Builder()
        .saturationModifier(0.15f)
        .alwaysEdible()
        .fast()
        .build()

    @JvmField
    val RAINBOW_POTATO: FoodProperties = FoodProperties.Builder()
        .saturationModifier(0.4f)
        .nutrition(4)
        .effect({ MobEffectInstance(MobEffects.LUCK, 20 * 20, 1, false, false, false) }, 1F)
        .alwaysEdible()
        .fast()
        .build()

}