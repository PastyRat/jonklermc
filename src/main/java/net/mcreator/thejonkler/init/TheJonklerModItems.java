
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thejonkler.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.thejonkler.item.WatermelonCatItem;
import net.mcreator.thejonkler.item.SigmaswordItem;
import net.mcreator.thejonkler.item.SigmaItem;
import net.mcreator.thejonkler.item.JonklerItem;
import net.mcreator.thejonkler.item.JONKLERswordItem;
import net.mcreator.thejonkler.item.GoonItem;
import net.mcreator.thejonkler.item.GoonBowItem;
import net.mcreator.thejonkler.item.EviljonklerItem;
import net.mcreator.thejonkler.item.EvilJonklerswordItem;
import net.mcreator.thejonkler.TheJonklerMod;

public class TheJonklerModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheJonklerMod.MODID);
	public static final RegistryObject<Item> JONKLER = REGISTRY.register("jonkler", () -> new JonklerItem());
	public static final RegistryObject<Item> JONKLE_RSWORD = REGISTRY.register("jonkle_rsword", () -> new JONKLERswordItem());
	public static final RegistryObject<Item> SIGMASWORD = REGISTRY.register("sigmasword", () -> new SigmaswordItem());
	public static final RegistryObject<Item> EVIL_JONKLERSWORD = REGISTRY.register("evil_jonklersword", () -> new EvilJonklerswordItem());
	public static final RegistryObject<Item> SIGMA = REGISTRY.register("sigma", () -> new SigmaItem());
	public static final RegistryObject<Item> WATERMELON_CAT_HELMET = REGISTRY.register("watermelon_cat_helmet", () -> new WatermelonCatItem.Helmet());
	public static final RegistryObject<Item> EVILJONKLER = REGISTRY.register("eviljonkler", () -> new EviljonklerItem());
	public static final RegistryObject<Item> GOON_BOW = REGISTRY.register("goon_bow", () -> new GoonBowItem());
	public static final RegistryObject<Item> GOON = REGISTRY.register("goon", () -> new GoonItem());
	public static final RegistryObject<Item> JONKLERMONSTER_SPAWN_EGG = REGISTRY.register("jonklermonster_spawn_egg", () -> new ForgeSpawnEggItem(TheJonklerModEntities.JONKLERMONSTER, -15634158, -6219583, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}
