package zdoctor.stevenuniverse.renderers.living;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import zdoctor.lazymodder.builtin.helpers.TextureLocation.EntityTextureLocation;
import zdoctor.stevenuniverse.ModMain;
import zdoctor.stevenuniverse.client.entity.living.models.ModelAmethyst;

public class RenderAmethyst extends RenderLiving {
	public static final ResourceLocation TEXTURE = new EntityTextureLocation(ModMain.MODID, "amethyst");

	public RenderAmethyst(RenderManager renderManager) {
		super(renderManager, new ModelAmethyst(), 0.5f);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return TEXTURE;
	}

}