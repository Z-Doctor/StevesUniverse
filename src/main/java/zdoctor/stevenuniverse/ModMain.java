package zdoctor.stevenuniverse;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import zdoctor.stevenuniverse.proxy.CommonProxy;

@Mod(modid = ModMain.MODID, version = ModMain.VERSION, dependencies="required-after:lazymodder@[0.74,)")
public class ModMain {
	public static final String MODID = "stevenuniverse";
	public static final String VERSION = "0.1";
	
	@SidedProxy(clientSide = "zdoctor.stevenuniverse.proxy.ClientProxy", serverSide = "zdoctor.stevenuniverse.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@Instance
	public static ModMain mod = new ModMain();

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
			
}