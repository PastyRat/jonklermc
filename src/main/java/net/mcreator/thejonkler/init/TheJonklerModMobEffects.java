
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thejonkler.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.thejonkler.potion.SusMobEffect;
import net.mcreator.thejonkler.TheJonklerMod;

public class TheJonklerModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, TheJonklerMod.MODID);
	public static final RegistryObject<MobEffect> SUS = REGISTRY.register("sus", () -> new SusMobEffect());
}
