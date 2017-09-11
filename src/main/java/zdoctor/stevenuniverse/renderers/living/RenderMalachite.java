package zdoctor.stevenuniverse.renderers.living;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import zdoctor.lazymodder.builtin.helpers.TextureLocation.EntityTextureLocation;
import zdoctor.stevenuniverse.ModMain;
import zdoctor.stevenuniverse.client.entity.living.models.ModelMalachite;

public class RenderMalachite extends RenderLiving {
	public static final ResourceLocation TEXTURE = new EntityTextureLocation(ModMain.MODID, "malachite");

	public RenderMalachite(RenderManager renderManager) {
		super(renderManager, new ModelMalachite(), 0.5F);
	}

	@Override
	protected void preRenderCallback(EntityLivingBase entity, float f) {
		GL11.glScalef(7.0F, 7.0F, 7.0F);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return TEXTURE;
	}

}