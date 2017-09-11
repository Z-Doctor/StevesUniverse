package zdoctor.stevenuniverse.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import zdoctor.stevenuniverse.init.SUBlocks;

public class StevenUniverse_Ore implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case -1:
			generateNether(random, chunkX * 16, chunkZ * 16, world);
		break;
		case 0:
			generateOverworld(random, chunkX * 16, chunkZ * 16, world);
			break;
		case 1:
			generateEnd(random, chunkX * 16, chunkZ * 16, world);
			break;
		}
		

	}
	
	private void addOre(Block block, Block blockspawn, Random random, World world, int posX, int posZ, int minY, int maxY, int minVien, int maxVien, int spawnChance){
	for(int i = 0; i < spawnChance; i++){
		int defaultChunkSize = 16;
		
		int xPos = posX + random.nextInt (defaultChunkSize);
		int yPos = minY + random.nextInt (maxY - minY);
		int zPos = posZ + random.nextInt (defaultChunkSize);
		
		new WorldGenMinable(block, (minVien + random.nextInt(maxVien - minVien)), blockspawn).generate(world, random, xPos, yPos, zPos);
	}
	}
		
	private void generateNether(Random random, int chunkX, int chunkZ, World world) {
		// TODO Auto-generated method stub
		
	}
	

	private void generateOverworld(Random random, int chunkX, int chunkZ, World world) {
		addOre(SUBlocks.amethyst_ore, Blocks.lapis_ore, random, world, chunkX, chunkZ,5, 100, 10, 20, 10);
		addOre(SUBlocks.pearl_ore, Blocks.lapis_ore, random, world, chunkX, chunkZ, 5, 100, 10, 20, 10);
		addOre(SUBlocks.rose_ore, Blocks.lapis_ore, random, world, chunkX, chunkZ, 5, 100, 10, 20, 10);
		addOre(SUBlocks.peridot_ore, Blocks.lapis_ore, random, world, chunkX, chunkZ, 5, 100, 10, 20, 10);
		addOre(SUBlocks.jasper_ore, Blocks.lapis_ore, random, world, chunkX, chunkZ, 5, 100, 10, 20, 10);
		addOre(SUBlocks.ruby_ore, Blocks.lapis_ore, random, world, chunkX, chunkZ, 5, 100, 10, 20, 10);
		addOre(SUBlocks.sapphire_block, Blocks.lapis_ore, random, world, chunkX, chunkZ, 5, 100, 10, 20, 10);
		
	}

	private void generateEnd(Random random, int chunkX, int chunkZ, World world) {
		// TODO Auto-generated method stub
		
	}

}
