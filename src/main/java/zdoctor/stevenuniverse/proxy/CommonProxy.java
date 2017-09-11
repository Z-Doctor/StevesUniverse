package zdoctor.stevenuniverse.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import zdoctor.stevenuniverse.init.SUCreativeTabs;
import zdoctor.stevenuniverse.init.SUItems;
import zdoctor.stevenuniverse.init.SULivingEntities;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
//		SUCreativeTabs.preInit();
		SUItems.preInitItems();
		SULivingEntities.preInit();
	}

	public void init(FMLInitializationEvent e) {

	}

	public void postInit(FMLPostInitializationEvent e) {

	}

}
