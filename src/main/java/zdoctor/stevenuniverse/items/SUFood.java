package zdoctor.stevenuniverse.items;

import zdoctor.lazymodder.easy.items.EasyFood;
import zdoctor.stevenuniverse.init.SUCreativeTabs;

public class SUFood extends EasyFood {
	public SUFood(String name, int amount) {
		this(name, amount, 0.6F);
	}

	public SUFood(String name, int amount, float saturation) {
		this(name, amount, saturation, false);
	}

	public SUFood(String name, int amount, boolean isWolfFood) {
		this(name, amount, 0.6F, isWolfFood);
	}
	
	public SUFood(String name, int amount, float saturation, boolean isWolfFood) {
		super(name, amount, saturation, isWolfFood);
		setCreativeTab(SUCreativeTabs.tabSU);
	}

}