
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thejonkler.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.thejonkler.client.renderer.JonklermonsterRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TheJonklerModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TheJonklerModEntities.JONKLERMONSTER.get(), JonklermonsterRenderer::new);
	}
}
