package zdoctor.stevenuniverse.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import zdoctor.lazymodder.builtin.helpers.PotionHelper;
import zdoctor.stevenuniverse.init.SUItems;

public class MalachiteGem extends SUItem {
	public MalachiteGem() {
		super("MalachiteGem");
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		for (int counter = 1; counter <= 1; counter++) {
			playerIn.inventory.addItemStackToInventory(new ItemStack(SUItems.malachite_hydro, 1));
			playerIn.inventory.addItemStackToInventory(new ItemStack(SUItems.lapis_wings, 1));
			playerIn.inventory.addItemStackToInventory(new ItemStack(SUItems.jasper_crashhelmet, 1));

		}
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}

	@Override
	public boolean hasEffect(ItemStack itemstack) {
		return true;
	}

	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5) {
		super.onUpdate(stack, world, entity, par4, par5);
		EntityPlayer player = (EntityPlayer) entity;
		ItemStack equipped = player.inventory.getItemStack();
		if (equipped == stack) {
			player.addPotionEffect(new PotionEffect(PotionHelper.HEALTH_BOOST, 1000, 9));
		}
	}
}