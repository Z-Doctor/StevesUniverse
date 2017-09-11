package zdoctor.stevenuniverse.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import zdoctor.lazymodder.builtin.helpers.PotionHelper;
import zdoctor.lazymodder.easy.items.EasyItem;
import zdoctor.stevenuniverse.init.SUCreativeTabs;
import zdoctor.stevenuniverse.init.SUItems;

public class SUItem extends EasyItem {
	public SUItem(String name) {
		this(name, 1);
	}

	public SUItem(String name, int subCount) {
		super(name, subCount);
		setCreativeTab(SUCreativeTabs.tabSU);
	}

}