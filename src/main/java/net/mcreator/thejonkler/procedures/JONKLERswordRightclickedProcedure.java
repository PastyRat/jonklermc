package net.mcreator.thejonkler.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.LargeFireball;
import net.minecraft.world.entity.projectile.AbstractHurtingProjectile;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;

public class JONKLERswordRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 50, 1));
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getFireball(Level level, double ax, double ay, double az) {
					AbstractHurtingProjectile entityToSpawn = new LargeFireball(EntityType.FIREBALL, level);
					entityToSpawn.xPower = ax;
					entityToSpawn.yPower = ay;
					entityToSpawn.zPower = az;
					return entityToSpawn;
				}
			}.getFireball(projectileLevel, 1, 0, 0);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot(0, 0, 0, 100, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getFireball(Level level, double ax, double ay, double az) {
					AbstractHurtingProjectile entityToSpawn = new LargeFireball(EntityType.FIREBALL, level);
					entityToSpawn.xPower = ax;
					entityToSpawn.yPower = ay;
					entityToSpawn.zPower = az;
					return entityToSpawn;
				}
			}.getFireball(projectileLevel, 0, 0, 1);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot(0, 0, 0, 100, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getFireball(Level level, double ax, double ay, double az) {
					AbstractHurtingProjectile entityToSpawn = new LargeFireball(EntityType.FIREBALL, level);
					entityToSpawn.xPower = ax;
					entityToSpawn.yPower = ay;
					entityToSpawn.zPower = az;
					return entityToSpawn;
				}
			}.getFireball(projectileLevel, 0, 0, (-1));
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot(0, 0, 0, 100, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getFireball(Level level, double ax, double ay, double az) {
					AbstractHurtingProjectile entityToSpawn = new LargeFireball(EntityType.FIREBALL, level);
					entityToSpawn.xPower = ax;
					entityToSpawn.yPower = ay;
					entityToSpawn.zPower = az;
					return entityToSpawn;
				}
			}.getFireball(projectileLevel, (-1), 0, 0);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot(0, 0, 0, 100, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
	}
}
