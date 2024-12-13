
package net.mcreator.thejonkler.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.thejonkler.init.TheJonklerModItems;
import net.mcreator.thejonkler.init.TheJonklerModFluids;
import net.mcreator.thejonkler.init.TheJonklerModFluidTypes;
import net.mcreator.thejonkler.init.TheJonklerModBlocks;

public abstract class StillwaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> TheJonklerModFluidTypes.STILLWATER_TYPE.get(), () -> TheJonklerModFluids.STILLWATER.get(), () -> TheJonklerModFluids.FLOWING_STILLWATER.get())
			.explosionResistance(100f).tickRate(50).bucket(() -> TheJonklerModItems.STILLWATER_BUCKET.get()).block(() -> (LiquidBlock) TheJonklerModBlocks.STILLWATER.get());

	private StillwaterFluid() {
		super(PROPERTIES);
	}

	public static class Source extends StillwaterFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends StillwaterFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
