package zdoctor.stevenuniverse.renderers.living;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import zdoctor.lazymodder.builtin.helpers.TextureLocation.EntityTextureLocation;
import zdoctor.stevenuniverse.ModMain;
import zdoctor.stevenuniverse.client.entity.living.models.ModelRose;

public class RenderRose extends RenderLiving {
	public static final ResourceLocation TEXTURE = new EntityTextureLocation(ModMain.MODID, "rosequartz");

	public RenderRose(RenderManager renderManager) {
		super(renderManager, new ModelRose(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity parEntity) {
		return TEXTURE;
	}

}
