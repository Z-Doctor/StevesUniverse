package zdoctor.stevenuniverse.renderers.living;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import zdoctor.lazymodder.builtin.helpers.TextureLocation.EntityTextureLocation;
import zdoctor.stevenuniverse.ModMain;
import zdoctor.stevenuniverse.client.entity.living.models.ModelGarnet;

public class RenderGarnet extends RenderLiving {
	public static final ResourceLocation TEXTURE = new EntityTextureLocation(ModMain.MODID, "garnet");

	public RenderGarnet(RenderManager renderManager) {
		super(renderManager, new ModelGarnet(), 0.5F);
	}

	@Override
	protected void preRenderCallback(EntityLivingBase entity, float f) {
		GL11.glScalef(1F, 1F, 1F);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return TEXTURE;
	}

}
