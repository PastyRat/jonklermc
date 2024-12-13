
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thejonkler.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.thejonkler.fluid.types.StillwaterFluidType;
import net.mcreator.thejonkler.TheJonklerMod;

public class TheJonklerModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, TheJonklerMod.MODID);
	public static final RegistryObject<FluidType> STILLWATER_TYPE = REGISTRY.register("stillwater", () -> new StillwaterFluidType());
}
