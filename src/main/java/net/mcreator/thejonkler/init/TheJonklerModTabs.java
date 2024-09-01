
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thejonkler.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.thejonkler.TheJonklerMod;

public class TheJonklerModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheJonklerMod.MODID);
	public static final RegistryObject<CreativeModeTab> JONKLERMOD = REGISTRY.register("jonklermod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_jonkler.jonklermod")).icon(() -> new ItemStack(TheJonklerModItems.JONKLER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TheJonklerModItems.JONKLE_RSWORD.get());
				tabData.accept(TheJonklerModItems.SIGMASWORD.get());
				tabData.accept(TheJonklerModItems.EVIL_JONKLERSWORD.get());
				tabData.accept(TheJonklerModItems.WATERMELON_CAT_HELMET.get());
				tabData.accept(TheJonklerModItems.GOON_BOW.get());
				tabData.accept(TheJonklerModItems.BUSTER.get());
				tabData.accept(TheJonklerModItems.GOON.get());
				tabData.accept(TheJonklerModItems.SIGMA.get());
				tabData.accept(TheJonklerModItems.JONKLER.get());
				tabData.accept(TheJonklerModItems.JONKLERMONSTER_SPAWN_EGG.get());
				tabData.accept(TheJonklerModItems.ANGUS_HAMMER.get());
				tabData.accept(TheJonklerModItems.GOON_INFUSED_SWORD.get());
			}).withSearchBar().build());
}
