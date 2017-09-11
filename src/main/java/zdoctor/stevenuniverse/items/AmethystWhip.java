package zdoctor.stevenuniverse.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import zdoctor.lazymodder.easy.items.EasyItem;
import zdoctor.stevenuniverse.entities.EntityAmethystWhip;

public class AmethystWhip extends EasyItem {

	public AmethystWhip() {
		super("AmethystWhip");
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		EntityAmethystWhip whip = new EntityAmethystWhip(playerIn.world, playerIn);
		whip.setThrower(playerIn);
		if (!playerIn.world.isRemote) {
			playerIn.world.spawnEntity(whip);
		}
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}

}
