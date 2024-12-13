
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
	public static final RegistryObject<SoundEvent> WHYSOSERIOUS = REGISTRY.register("whysoserious", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_jonkler", "whysoserious")));
	public static final RegistryObject<SoundEvent> LOW_TAPER_FADE = REGISTRY.register("low_taper_fade", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_jonkler", "low_taper_fade")));
	public static final RegistryObject<SoundEvent> DRAGGING = REGISTRY.register("dragging", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_jonkler", "dragging")));
	public static final RegistryObject<SoundEvent> DRAGGING_FADE = REGISTRY.register("dragging_fade", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_jonkler", "dragging_fade")));
	public static final RegistryObject<SoundEvent> MASSIVE = REGISTRY.register("massive", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_jonkler", "massive")));
	public static final RegistryObject<SoundEvent> PORTAL = REGISTRY.register("portal", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_jonkler", "portal")));
	public static final RegistryObject<SoundEvent> LOWTAPERFADEE = REGISTRY.register("lowtaperfadee", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_jonkler", "lowtaperfadee")));
	public static final RegistryObject<SoundEvent> FREEMAN = REGISTRY.register("freeman", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_jonkler", "freeman")));
	public static final RegistryObject<SoundEvent> CONVENIENT = REGISTRY.register("convenient", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_jonkler", "convenient")));
	public static final RegistryObject<SoundEvent> CONSEQUENSES = REGISTRY.register("consequenses", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_jonkler", "consequenses")));
}
