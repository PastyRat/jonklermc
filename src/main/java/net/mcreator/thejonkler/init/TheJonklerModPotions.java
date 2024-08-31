
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thejonkler.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.thejonkler.TheJonklerMod;

public class TheJonklerModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, TheJonklerMod.MODID);
	public static final RegistryObject<Potion> SUSPOTION = REGISTRY.register("suspotion",
			() -> new Potion(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 2000, 1, false, true), new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 2000, 5, false, true), new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 2000, 1, false, true),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2000, 10, false, true), new MobEffectInstance(MobEffects.DARKNESS, 500, 1, false, true)));
}
