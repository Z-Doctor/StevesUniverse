package zdoctor.stevenuniverse.init;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import zdoctor.stevenuniverse.items.AlexandriteGem;
import zdoctor.stevenuniverse.items.AmethystGem;
import zdoctor.stevenuniverse.items.AmethystWhip;
import zdoctor.stevenuniverse.items.GarnetGauntlet;
import zdoctor.stevenuniverse.items.GarnetGem;
import zdoctor.stevenuniverse.items.JasperGem;
import zdoctor.stevenuniverse.items.LapisGem;
import zdoctor.stevenuniverse.items.MalachiteGem;
import zdoctor.stevenuniverse.items.OpalGem;
import zdoctor.stevenuniverse.items.PearlGem;
import zdoctor.stevenuniverse.items.PeridotGem;
import zdoctor.stevenuniverse.items.RainbowGem;
import zdoctor.stevenuniverse.items.RoseGem;
import zdoctor.stevenuniverse.items.RubyGem;
import zdoctor.stevenuniverse.items.SUFood;
import zdoctor.stevenuniverse.items.SapphireGem;
import zdoctor.stevenuniverse.items.SardonyxGem;
import zdoctor.stevenuniverse.items.SugiliteGem;

public class SUItems {
	
//	public static void MainRegistry(){
//		initItems();
//		regItems();
//	}
	
	public static Item alexandriteGem, amethystGem, amethystWhip, bagel, chips, cookieCat, creamedCorn, dogNut, 
	durianJuice, fryBits, garnetGauntlet, garnetGem, giantWoman, jasper, jasper_crashhelmet, jasperGem, lapisGem, lapis_hydro, lapis_wings,
	malachiteGem, malachite_hydro, opal_bow, opalGem, pearlGem, pearl_spear, peridot_claw, peridotGem, rainbowGem, roseGem, rose_sword, rose_shield, ruby_glove, rubyGem, 
	sapphire_glove, sapphireGem, sapphire_screech,
	sardonyxGem, sardonyx_hammer, sardonyx_heart, steven_ukulele, sugilite, sugilite_flail, sugiliteGem, togetherBreakfast, whipItUp;
	
	public static ToolMaterial Pearl = EnumHelper.addToolMaterial("Pearl", 3, 1000000, 16.0f, 5.0f, 1);
	public static ToolMaterial Amethyst = EnumHelper.addToolMaterial("Amethyst", 3, 1000000, 16.0f, 5.0f, 1);
	public static ToolMaterial Rose = EnumHelper.addToolMaterial("Rose", 3, 1000000, 16.0f, 5.0f, 1);
	public static ToolMaterial Quartz = EnumHelper.addToolMaterial("Quartz", 3, 1000000, 16.0f, 5.0f, 1);
	public static ToolMaterial Ruby = EnumHelper.addToolMaterial("Ruby", 3, 1000000, 16.0f, 10.5f, 1);
	
	public static void preInitItems(){

		// Food
		// TODO Missing texture
//		bagel = new SUFood("Bagel", 3, false);
		chips = new SUFood("Chips", 4, false);
		cookieCat = new SUFood("CookieCat", 10, false);
		creamedCorn = new SUFood("CreamedCorn", 5, false);
		// TODO Missing texture
//		dogNut = new SUFood("DogNut", 7, false);
		// TODO Missing texture
//		durianJuice = new SUFood("DurianJuice", 3, false);
		fryBits = new SUFood("FryBits", 4, false);
		togetherBreakfast = new SUFood("TogetherBreakfast", 20, false);
		whipItUp = new SUFood("WhipItUp", 6, false);
		
		// Gems
		alexandriteGem = new AlexandriteGem();
		amethystGem = new AmethystGem();
		garnetGem = new GarnetGem();
		jasperGem = new JasperGem();
		lapisGem = new LapisGem();
		peridotGem = new PeridotGem();
		malachiteGem = new MalachiteGem();
		rainbowGem = new RainbowGem();
		pearlGem = new PearlGem();
		opalGem = new OpalGem();
		roseGem = new RoseGem();
		rubyGem = new RubyGem();
		sardonyxGem = new SardonyxGem();
		sapphireGem = new SapphireGem();
		sugiliteGem = new SugiliteGem();
		
		// Items
		amethystWhip = new AmethystWhip();
		garnetGauntlet = new GarnetGauntlet();
		// TODO Missing Texture
//		giantWoman = new SUItem("GiantWoman");
		
//		jasper_crashhelmet = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":jasper_crashhelmet").setUnlocalizedName("jasper_crashhelmet");
//		lapis_wings = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":lapis_wings").setUnlocalizedName("lapis_wings");
//		malachite_hydro = new malachite_hydro(Pearl).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":malachite_hydro").setUnlocalizedName("malachite_hydro");
//		opal_bow = new opal_bow().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":opal_bow").setUnlocalizedName("opal_bow");
//		pearl_spear = new pearl_spear(Pearl).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":pearl_spear").setUnlocalizedName("pearl_spear");
//		peridot_claw = new peridot_claw().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":peridot_claw").setUnlocalizedName("peridot_claw");
//		rose_sword = new ItemSword(Rose).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":rose_sword").setUnlocalizedName("rose");
//		rose_shield = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":rose_shield").setUnlocalizedName("rose_shield");
//		ruby_glove = new ruby_glove(Ruby).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":ruby_glove").setUnlocalizedName("ruby_glove");
//		sapphire_screech = new Item().setTextureName(StevesUniverse.MODID + ":sonic").setUnlocalizedName("sapphire_screech");
//		sapphire_glove = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":sapphire_glove").setUnlocalizedName("sapphire_glove");
//		sardonyx_hammer = new sardonyx_hammer(Ruby).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":sardonyx_hammer").setUnlocalizedName("sardonyx_hammer");
//		steven_ukulele = new steven_ukulele().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":steven_ukulele").setUnlocalizedName("steven_ukulele");
//		sugilite_flail = new sugilite_flail(Ruby).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":sugilite_flail").setUnlocalizedName("sugilite_flail");
	}

}
