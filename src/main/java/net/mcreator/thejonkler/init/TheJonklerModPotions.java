
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thejonkler.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.thejonkler.TheJonklerMod;

public class TheJonklerModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, TheJonklerMod.MODID);
	public static final RegistryObject<Potion> SUSPOTION = REGISTRY.register("suspotion", () -> new Potion(new MobEffectInstance(TheJonklerModMobEffects.SUS.get(), 100, 0, false, true)));
}
