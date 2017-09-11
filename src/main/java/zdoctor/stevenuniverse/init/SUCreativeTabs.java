package zdoctor.stevenuniverse.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class SUCreativeTabs {

	public static final CreativeTabs tabSU = new CreativeTabs("tabSU") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(SUItems.cookieCat);
		}
	};

//	public static void preInit() {
//
//		tabSU = new CreativeTabs("tabSU") {
//
//			@Override
//			public ItemStack getTabIconItem() {
//				return new ItemStack(SUItems.cookieCat);
//			}
//		};
//	}
}