
package net.mcreator.thejonkler.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.thejonkler.procedures.StillwaterMobplayerCollidesBlockProcedure;
import net.mcreator.thejonkler.init.TheJonklerModFluids;

public class StillwaterBlock extends LiquidBlock {
	public StillwaterBlock() {
		super(() -> TheJonklerModFluids.STILLWATER.get(), BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		StillwaterMobplayerCollidesBlockProcedure.execute(world, entity);
	}
}
