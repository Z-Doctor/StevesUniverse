package zdoctor.stevenuniverse.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import zdoctor.stevenuniverse.init.SUItems;

public class RubyGem extends SUItem {
	public RubyGem() {
		super("RubyGem");
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		for (int counter = 1; counter <= 1; counter++) {
			if (playerIn.inventory.getCurrentItem().getCount() == 1) {
				playerIn.inventory.addItemStackToInventory(new ItemStack(SUItems.ruby_glove, 1));

			}
		}
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
}