package zdoctor.stevenuniverse;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zdoctor.stevenuniverse.init.SUBlocks;
import zdoctor.stevenuniverse.init.SUItems;

public class CraftingManager {

	public static void mainRegistry(){
		addCraftingRec();
		addSmeltingRec();
}
	
	public static void addCraftingRec(){
	//Shaped
		GameRegistry.addRecipe(new ItemStack(SUBlocks.pearl_block, 1), new Object[]{"XXX","XXX","XXX", 'X', SUItems.pearl});
		GameRegistry.addRecipe(new ItemStack(SUBlocks.ruby_block, 1), new Object[]{"XXX","XXX","XXX", 'X', SUItems.ruby});
		GameRegistry.addRecipe(new ItemStack(SUBlocks.rose_block, 1), new Object[]{"XXX","XXX","XXX", 'X', SUItems.rose});
		GameRegistry.addRecipe(new ItemStack(SUBlocks.sapphire_block, 1), new Object[]{"XXX","XXX","XXX", 'X', SUItems.sapphire});
		GameRegistry.addRecipe(new ItemStack(SUBlocks.peridot_block, 1), new Object[]{"XXX","XXX","XXX", 'X', SUItems.peridot});
		GameRegistry.addRecipe(new ItemStack(SUBlocks.jasper_block, 1), new Object[]{"XXX","XXX","XXX", 'X', SUItems.jasper});
		GameRegistry.addRecipe(new ItemStack(SUBlocks.opal_block, 1), new Object[]{"XXX","XXX","XXX", 'X', SUItems.opal});
		GameRegistry.addRecipe(new ItemStack(SUBlocks.garnet_block, 1), new Object[]{"XXX","XXX","XXX", 'X', SUItems.garnet});
		GameRegistry.addRecipe(new ItemStack(SUBlocks.sugilite_block, 1), new Object[]{"XXX","XXX","XXX", 'X', SUItems.sugilite});
		GameRegistry.addRecipe(new ItemStack(SUBlocks.sardonyx_block, 1), new Object[]{"XXX","XXX","XXX", 'X', SUItems.sardonyx});
		GameRegistry.addRecipe(new ItemStack(SUBlocks.alexandrite_block, 1), new Object[]{"XXX","XXX","XXX", 'X', SUItems.alexandrite});
		GameRegistry.addRecipe(new ItemStack(SUBlocks.rainbow_block, 1), new Object[]{"XXX","XXX","XXX", 'X', SUItems.rainbow});
		GameRegistry.addRecipe(new ItemStack(SUBlocks.malachite_block, 1), new Object[]{"XXX","XXX","XXX", 'X', SUItems.malachite});
		GameRegistry.addRecipe(new ItemStack(SUBlocks.amethyst_block, 1), new Object[]{"XXX","XXX","XXX", 'X', SUItems.amethyst});
		GameRegistry.addRecipe(new ItemStack(SUItems.amethystHeart, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', SUItems.amethyst});
		GameRegistry.addRecipe(new ItemStack(SUItems.pearlGem, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', SUItems.pearl});
		GameRegistry.addRecipe(new ItemStack(SUItems.peridotGem, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', SUItems.peridot});
		GameRegistry.addRecipe(new ItemStack(SUItems.jasperGem, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', SUItems.jasper});
		GameRegistry.addRecipe(new ItemStack(SUItems.ruby_heart, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', SUItems.ruby});
		GameRegistry.addRecipe(new ItemStack(SUItems.sapphire_heart, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', SUItems.sapphire});
		GameRegistry.addRecipe(new ItemStack(SUItems.lapisGem, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', new ItemStack(Items.dye, 1, 4)});
		GameRegistry.addRecipe(new ItemStack(SUItems.rose_heart, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', SUItems.rose});
//		GameRegistry.addRecipe(new ItemStack(ModItems.garnet_heart, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', ModItems.garnet});
//		GameRegistry.addRecipe(new ItemStack(ModItems.opal_heart, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', ModItems.opal});
//		GameRegistry.addRecipe(new ItemStack(ModItems.sugilite_heart, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', ModItems.sugilite});
//		GameRegistry.addRecipe(new ItemStack(ModItems.sardonyx_heart, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', ModItems.sardonyx});
//		GameRegistry.addRecipe(new ItemStack(ModItems.alexandrite_heart, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', ModItems.alexandrite});
//		GameRegistry.addRecipe(new ItemStack(ModItems.rainbow_heart, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', ModItems.rainbow});
//		GameRegistry.addRecipe(new ItemStack(ModItems.malachite_heart, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', ModItems.malachite});
		GameRegistry.addRecipe(new ItemStack(SUItems.cookieCat, 4), new Object[]{"0C0","MIM","0C0", 'C', Items.cookie, 'M', Items.milk_bucket, 'I', Blocks.ice});
		GameRegistry.addRecipe(new ItemStack(SUItems.togetherBreakfast, 1), new Object[]{"EAE","WMW","WMW", 'E', Items.egg, 'M', Items.milk_bucket, 'W', Items.wheat, 'A', Items.apple});
		GameRegistry.addRecipe(new ItemStack(SUItems.dogNut, 3), new Object[]{"CCC","PPP","CCC", 'C', Items.cake, 'P', Items.cooked_porkchop});
		GameRegistry.addRecipe(new ItemStack(SUItems.fryBits, 8), new Object[]{"0M0","BBB","PPP", 'M', Items.milk_bucket, 'B', Items.baked_potato, 'P', Items.paper});
		GameRegistry.addRecipe(new ItemStack(SUItems.chips, 4), new Object[]{"SBS","PBP","PPP", 'S', Items.sugar, 'B', Items.baked_potato, 'P', Items.paper});
		GameRegistry.addRecipe(new ItemStack(SUItems.durianJuice, 8), new Object[]{"PSP","PAP","PWP", 'S', Items.sugar, 'A', Items.apple, 'P', Items.paper, 'W', Items.water_bucket});
		GameRegistry.addRecipe(new ItemStack(SUItems.whipItUp, 2), new Object[]{"SSS","SMS","SSS", 'S', Items.sugar, 'M', Items.milk_bucket});
		GameRegistry.addRecipe(new ItemStack(SUItems.bagel, 4), new Object[]{"0B0","EPM","0B0", 'B', Items.bread, 'E', Items.egg, 'P', Items.cooked_porkchop, 'M', Items.milk_bucket});
		GameRegistry.addRecipe(new ItemStack(SUItems.creamedCorn, 2), new Object[]{"0W0","0W0","0M0", 'W', Items.wheat, 'M', Items.milk_bucket});

		GameRegistry.addShapelessRecipe(new ItemStack(SUItems.sardonyx, 1), SUItems.pearl, SUItems.garnet);
		GameRegistry.addShapelessRecipe(new ItemStack(SUItems.garnet, 1), SUItems.ruby, SUItems.sapphire);
		GameRegistry.addShapelessRecipe(new ItemStack(SUItems.sugilite, 1), SUItems.amethyst, SUItems.garnet);
		GameRegistry.addShapelessRecipe(new ItemStack(SUItems.opal, 1), SUItems.pearl, SUItems.amethyst);
		GameRegistry.addShapelessRecipe(new ItemStack(SUItems.alexandrite, 1), SUItems.pearl, SUItems.garnet, SUItems.amethyst);
		GameRegistry.addShapelessRecipe(new ItemStack(SUItems.rainbow, 1), SUItems.pearl, SUItems.rose);
		GameRegistry.addShapelessRecipe(new ItemStack(SUItems.malachite, 1), new ItemStack(Items.dye, 1, 4), SUItems.jasper);
	}
	public static void addSmeltingRec(){
		GameRegistry.addSmelting( SUBlocks.amethyst_ore, new ItemStack(SUItems.amethyst, 1), 20.0f);
		GameRegistry.addSmelting( SUBlocks.pearl_ore, new ItemStack(SUItems.pearl, 1), 20.0f);
		GameRegistry.addSmelting( SUBlocks.rose_ore, new ItemStack(SUItems.rose, 1), 20.0f);
		GameRegistry.addSmelting( SUBlocks.jasper_ore, new ItemStack(SUItems.jasper, 1), 20.0f);
		GameRegistry.addSmelting( SUBlocks.peridot_ore, new ItemStack(SUItems.peridot, 1), 20.0f);
		GameRegistry.addSmelting( SUBlocks.ruby_ore, new ItemStack(SUItems.ruby, 1), 20.0f);
		GameRegistry.addSmelting( SUBlocks.sapphire_ore, new ItemStack(SUItems.sapphire, 1), 20.0f);
		
		
}
}