
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thejonkler.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.thejonkler.TheJonklerMod;

public class TheJonklerModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TheJonklerMod.MODID);
	public static final RegistryObject<SoundEvent> JONKLERLAUGH = REGISTRY.register("jonklerlaugh", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_jonkler", "jonklerlaugh")));
	public static final RegistryObject<SoundEvent> SUS = REGISTRY.register("sus", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_jonkler", "sus")));
	public static final RegistryObject<SoundEvent> SIGMA = REGISTRY.register("sigma", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_jonkler", "sigma")));
	public static final RegistryObject<SoundEvent> SIGMANEW = REGISTRY.register("sigmanew", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_jonkler", "sigmanew")));
}
