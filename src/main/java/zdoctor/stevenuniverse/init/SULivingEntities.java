package zdoctor.stevenuniverse.init;

import zdoctor.lazymodder.easy.entity.living.EasyEntityLiving;
import zdoctor.stevenuniverse.entities.living.EntityAmethyst;
import zdoctor.stevenuniverse.entities.living.EntityGarnet;
import zdoctor.stevenuniverse.entities.living.EntityLapisLazuli;
import zdoctor.stevenuniverse.entities.living.EntityMalachite;
import zdoctor.stevenuniverse.entities.living.EntityOpal;
import zdoctor.stevenuniverse.entities.living.EntityPearl;
import zdoctor.stevenuniverse.entities.living.EntityPeridot;
import zdoctor.stevenuniverse.entities.living.EntityRose;
import zdoctor.stevenuniverse.entities.living.EntityRuby;
import zdoctor.stevenuniverse.entities.living.EntitySapphire;
import zdoctor.stevenuniverse.entities.living.EntitySteven;

public class SULivingEntities {
	public static void preInit() {
		new EasyEntityLiving("Amethyst", EntityAmethyst.class, 0, 0);
		new EasyEntityLiving("Garnet", EntityGarnet.class, 0, 0);
		new EasyEntityLiving("LapisLazuli", EntityLapisLazuli.class, 0, 0);
		new EasyEntityLiving("Malachite", EntityMalachite.class, 0, 0);
		new EasyEntityLiving("Opal", EntityOpal.class, 0, 0);
		new EasyEntityLiving("Pearl", EntityPearl.class, 0, 0);
		new EasyEntityLiving("Peridot", EntityPeridot.class, 0, 0);
		new EasyEntityLiving("Rose", EntityRose.class, 0, 0);
		new EasyEntityLiving("Ruby", EntityRuby.class, 0, 0);
		new EasyEntityLiving("Sapphire", EntitySapphire.class, 0, 0);
		new EasyEntityLiving("Steven", EntitySteven.class, 0, 0);
	}
}
