
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thejonkler.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.thejonkler.block.GoonblockBlock;
import net.mcreator.thejonkler.TheJonklerMod;

public class TheJonklerModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TheJonklerMod.MODID);
	public static final RegistryObject<Block> GOONBLOCK = REGISTRY.register("goonblock", () -> new GoonblockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
