package zdoctor.stevenuniverse.world;

import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModWorld {

	public static void mainRegistry(){
		initialiseWorldGen();
}
	public static void initialiseWorldGen (){
		registerWorldGen (new StevenUniverse_Ore(), 1);
	}
	public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProbability){
		GameRegistry.registerWorldGenerator(worldGenClass, weightedProbability);
	}
}