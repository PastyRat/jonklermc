
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thejonkler.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.thejonkler.fluid.StillwaterFluid;
import net.mcreator.thejonkler.TheJonklerMod;

public class TheJonklerModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, TheJonklerMod.MODID);
	public static final RegistryObject<FlowingFluid> STILLWATER = REGISTRY.register("stillwater", () -> new StillwaterFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_STILLWATER = REGISTRY.register("flowing_stillwater", () -> new StillwaterFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(STILLWATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_STILLWATER.get(), RenderType.translucent());
		}
	}
}
