
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thejonkler.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.thejonkler.item.SigmaswordItem;
import net.mcreator.thejonkler.item.SigmaItem;
import net.mcreator.thejonkler.item.JonklerItem;
import net.mcreator.thejonkler.item.JONKLERswordItem;
import net.mcreator.thejonkler.item.EvilJonklerswordItem;
import net.mcreator.thejonkler.TheJonklerMod;

public class TheJonklerModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheJonklerMod.MODID);
	public static final RegistryObject<Item> JONKLER = REGISTRY.register("jonkler", () -> new JonklerItem());
	public static final RegistryObject<Item> JONKLE_RSWORD = REGISTRY.register("jonkle_rsword", () -> new JONKLERswordItem());
	public static final RegistryObject<Item> SIGMASWORD = REGISTRY.register("sigmasword", () -> new SigmaswordItem());
	public static final RegistryObject<Item> EVIL_JONKLERSWORD = REGISTRY.register("evil_jonklersword", () -> new EvilJonklerswordItem());
	public static final RegistryObject<Item> SIGMA = REGISTRY.register("sigma", () -> new SigmaItem());
	// Start of user code block custom items
	// End of user code block custom items
}
