package zdoctor.stevenuniverse.entities.living;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import zdoctor.lazymodder.easy.interfaces.IRenderLiving;
import zdoctor.stevenuniverse.renderers.living.RenderSapphire;

public class EntitySapphire extends EntityMob implements IRenderLiving {

	public EntitySapphire(World s) {
		super(s);
		this.isImmuneToFire = true;
	}

	@Override
	protected void initEntityAI() {
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(6, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(2, new EntityAIAttackMelee(this, 1.0D, false));
		this.tasks.addTask(4, new EntityAIMoveThroughVillage(this, 1.0D, false));
		this.tasks.addTask(7, new EntityAIWatchClosest(this, EntitySapphire.class, 8.0F));
		this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityZombie.class, 8.0F));
		this.tasks.addTask(7, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityZombie.class, true, true));
		// TODO make runy help saphire
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(1.0D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(5D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(200.0D);
	}

	/**
	 * Called frequently so the entity can update its state every tick as
	 * required. For example, zombies and skeletons use this to react to
	 * sunlight and start to burn.
	 */
	public void onLivingUpdate() {
		super.onLivingUpdate();

		int i = MathHelper.floor(this.posX);
		int j = MathHelper.floor(this.posZ);

		for (i = 0; i < 4; ++i) {
			j = MathHelper.floor(this.posX + (double) ((float) (i % 2 * 2 - 1) * 0.25F));
			int k = MathHelper.floor(this.posY);
			int l = MathHelper.floor(this.posZ + (double) ((float) (i / 2 % 2 * 2 - 1) * 0.25F));

			BlockPos pos = new BlockPos(j, k, l);
			if (this.world.getBlockState(pos).isFullBlock() && Blocks.SNOW_LAYER.canPlaceBlockAt(this.world, pos)) {
				this.world.setBlockState(pos, Blocks.SNOW_LAYER.getDefaultState());
			}
		}
	}

	@Override
	public Class<? extends RenderLiving> getLivingRenderer() {
		return RenderSapphire.class;
	}

}
