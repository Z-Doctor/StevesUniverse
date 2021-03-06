package zdoctor.stevenuniverse.client.entity.living.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSteven extends ModelBase
{
	 //fields
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Torso;
    ModelRenderer Arm1;
    ModelRenderer Arm2;
    ModelRenderer Head;
    ModelRenderer Pupil1;
    ModelRenderer Eye1;
    ModelRenderer Stomach;
    ModelRenderer Eyebrow1;
    ModelRenderer Hair1;
    ModelRenderer Pupil2;
    ModelRenderer Eye2;
    ModelRenderer Hair2;
    ModelRenderer Cheeks;
    ModelRenderer Nose;
    ModelRenderer Eyebrow2;
    ModelRenderer Hair3;
    ModelRenderer Hair4;
    ModelRenderer Hair5;
    ModelRenderer Hair6;
    ModelRenderer Hair7;
    ModelRenderer Hair8;
    ModelRenderer Hair9;
    ModelRenderer Hair10;
    ModelRenderer Hair11;
    ModelRenderer Hair12;
    ModelRenderer Hair13;
    ModelRenderer Hair14;
  
  public ModelSteven()
  {
    textureWidth = 512;
    textureHeight = 512;
    
      Leg1 = new ModelRenderer(this, 67, 18);
      Leg1.addBox(0F, 0F, 0F, 4, 8, 4);
      Leg1.setRotationPoint(-4.5F, 16F, -3F);
      Leg1.setTextureSize(512, 512);
      Leg1.mirror = true;
      setRotation(Leg1, 0F, 0F, 0F);
      Leg2 = new ModelRenderer(this, 67, 18);
      Leg2.addBox(0F, 0F, 0F, 4, 8, 4);
      Leg2.setRotationPoint(0.5F, 16F, -3F);
      Leg2.setTextureSize(512, 512);
      Leg2.mirror = true;
      setRotation(Leg2, 0F, 0F, 0F);
      Torso = new ModelRenderer(this, 66, 47);
      Torso.addBox(0F, 0F, 0F, 9, 11, 4);
      Torso.setRotationPoint(-4.5F, 5F, -3F);
      Torso.setTextureSize(512, 512);
      Torso.mirror = true;
      setRotation(Torso, 0F, 0F, 0F);
      Arm1 = new ModelRenderer(this, 43, 47);
      Arm1.addBox(0F, 0F, 0F, 3, 11, 4);
      Arm1.setRotationPoint(-7.5F, 5F, -3F);
      Arm1.setTextureSize(512, 512);
      Arm1.mirror = true;
      setRotation(Arm1, 0F, 0F, 0F);
      Arm2 = new ModelRenderer(this, 43, 47);
      Arm2.addBox(0F, 0F, 0F, 3, 11, 4);
      Arm2.setRotationPoint(4.5F, 5F, -3F);
      Arm2.setTextureSize(512, 512);
      Arm2.mirror = true;
      setRotation(Arm2, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 80, 0);
      Head.addBox(0F, 0F, 0F, 8, 8, 8);
      Head.setRotationPoint(-4F, -3F, -5F);
      Head.setTextureSize(512, 512);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Pupil1 = new ModelRenderer(this, 64, 9);
      Pupil1.addBox(0F, 0F, 0F, 1, 1, 1);
      Pupil1.setRotationPoint(-2.3F, 0.5F, -5.2F);
      Pupil1.setTextureSize(512, 512);
      Pupil1.mirror = true;
      setRotation(Pupil1, 0F, 0F, 0F);
      Eye1 = new ModelRenderer(this, 0, 0);
      Eye1.addBox(0F, 0F, 0F, 2, 2, 1);
      Eye1.setRotationPoint(-3F, 0F, -5.1F);
      Eye1.setTextureSize(512, 512);
      Eye1.mirror = true;
      setRotation(Eye1, 0F, 0F, 0F);
      Stomach = new ModelRenderer(this, 93, 61);
      Stomach.addBox(0F, 0F, 0F, 8, 7, 1);
      Stomach.setRotationPoint(-4F, 7F, -3.5F);
      Stomach.setTextureSize(512, 512);
      Stomach.mirror = true;
      setRotation(Stomach, 0F, 0F, 0F);
      Eyebrow1 = new ModelRenderer(this, 108, 22);
      Eyebrow1.addBox(0F, 0F, 0F, 2, 1, 1);
      Eyebrow1.setRotationPoint(-3F, -1.3F, -4.6F);
      Eyebrow1.setTextureSize(512, 512);
      Eyebrow1.mirror = true;
      setRotation(Eyebrow1, -0.7853982F, 0F, 0F);
      Hair1 = new ModelRenderer(this, 0, 100);
      Hair1.addBox(0F, 0F, 0F, 2, 1, 2);
      Hair1.setRotationPoint(-1F, -3.5F, -5.5F);
      Hair1.setTextureSize(512, 512);
      Hair1.mirror = true;
      setRotation(Hair1, 0F, 0F, 0F);
      Pupil2 = new ModelRenderer(this, 64, 9);
      Pupil2.addBox(0F, 0F, 0F, 1, 1, 1);
      Pupil2.setRotationPoint(1.3F, 0.5F, -5.2F);
      Pupil2.setTextureSize(512, 512);
      Pupil2.mirror = true;
      setRotation(Pupil2, 0F, 0F, 0F);
      Eye2 = new ModelRenderer(this, 0, 0);
      Eye2.addBox(0F, 0F, 0F, 2, 2, 1);
      Eye2.setRotationPoint(1F, 0F, -5.1F);
      Eye2.setTextureSize(512, 512);
      Eye2.mirror = true;
      setRotation(Eye2, 0F, 0F, 0F);
      Hair2 = new ModelRenderer(this, 0, 100);
      Hair2.addBox(0F, 0F, 0F, 2, 2, 2);
      Hair2.setRotationPoint(-4.5F, -3.5F, -5.5F);
      Hair2.setTextureSize(512, 512);
      Hair2.mirror = true;
      setRotation(Hair2, 0F, 0F, 0F);
      Cheeks = new ModelRenderer(this, 124, 33);
      Cheeks.addBox(0F, 0F, 0F, 9, 3, 1);
      Cheeks.setRotationPoint(-4.5F, 2F, -5.5F);
      Cheeks.setTextureSize(512, 512);
      Cheeks.mirror = true;
      setRotation(Cheeks, 0F, 0F, 0F);
      Nose = new ModelRenderer(this, 131, 42);
      Nose.addBox(0F, 0F, 0F, 1, 2, 1);
      Nose.setRotationPoint(-0.5F, 1F, -5.3F);
      Nose.setTextureSize(512, 512);
      Nose.mirror = true;
      setRotation(Nose, 0F, 0F, 0F);
      Eyebrow2 = new ModelRenderer(this, 108, 22);
      Eyebrow2.addBox(0F, 0F, 0F, 2, 1, 1);
      Eyebrow2.setRotationPoint(1F, -1.3F, -4.6F);
      Eyebrow2.setTextureSize(512, 512);
      Eyebrow2.mirror = true;
      setRotation(Eyebrow2, -0.7853982F, 0F, 0F);
      Hair3 = new ModelRenderer(this, 0, 100);
      Hair3.addBox(0F, 0F, 0F, 2, 2, 2);
      Hair3.setRotationPoint(2.5F, -3.5F, 1.5F);
      Hair3.setTextureSize(512, 512);
      Hair3.mirror = true;
      setRotation(Hair3, 0F, 0F, 0F);
      Hair4 = new ModelRenderer(this, 0, 100);
      Hair4.addBox(0F, 0F, 0F, 2, 2, 2);
      Hair4.setRotationPoint(-4.5F, -3.5F, 1.5F);
      Hair4.setTextureSize(512, 512);
      Hair4.mirror = true;
      setRotation(Hair4, 0F, 0F, 0F);
      Hair5 = new ModelRenderer(this, 0, 100);
      Hair5.addBox(0F, 0F, 0F, 2, 2, 2);
      Hair5.setRotationPoint(-4.5F, 3.5F, 1.5F);
      Hair5.setTextureSize(512, 512);
      Hair5.mirror = true;
      setRotation(Hair5, 0F, 0F, 0F);
      Hair6 = new ModelRenderer(this, 0, 100);
      Hair6.addBox(0F, 0F, 0F, 2, 2, 2);
      Hair6.setRotationPoint(2.5F, 3.5F, 1.5F);
      Hair6.setTextureSize(512, 512);
      Hair6.mirror = true;
      setRotation(Hair6, 0F, 0F, 0F);
      Hair7 = new ModelRenderer(this, 0, 100);
      Hair7.addBox(0F, 0F, 0F, 2, 2, 2);
      Hair7.setRotationPoint(2.5F, 0F, 1.5F);
      Hair7.setTextureSize(512, 512);
      Hair7.mirror = true;
      setRotation(Hair7, 0F, 0F, 0F);
      Hair8 = new ModelRenderer(this, 0, 100);
      Hair8.addBox(0F, 0F, 0F, 2, 2, 2);
      Hair8.setRotationPoint(-1F, -3.5F, 1.5F);
      Hair8.setTextureSize(512, 512);
      Hair8.mirror = true;
      setRotation(Hair8, 0F, 0F, 0F);
      Hair9 = new ModelRenderer(this, 0, 100);
      Hair9.addBox(0F, 0F, 0F, 2, 2, 2);
      Hair9.setRotationPoint(-1F, 3.5F, 1.5F);
      Hair9.setTextureSize(512, 512);
      Hair9.mirror = true;
      setRotation(Hair9, 0F, 0F, 0F);
      Hair10 = new ModelRenderer(this, 0, 100);
      Hair10.addBox(0F, 0F, 0F, 2, 2, 2);
      Hair10.setRotationPoint(2.5F, -3.5F, -2F);
      Hair10.setTextureSize(512, 512);
      Hair10.mirror = true;
      setRotation(Hair10, 0F, 0F, 0F);
      Hair11 = new ModelRenderer(this, 0, 100);
      Hair11.addBox(0F, 0F, 0F, 2, 2, 2);
      Hair11.setRotationPoint(-4.5F, 0F, 1.5F);
      Hair11.setTextureSize(512, 512);
      Hair11.mirror = true;
      setRotation(Hair11, 0F, 0F, 0F);
      Hair12 = new ModelRenderer(this, 0, 100);
      Hair12.addBox(0F, 0F, 0F, 2, 2, 2);
      Hair12.setRotationPoint(2.5F, -3.5F, -2F);
      Hair12.setTextureSize(512, 512);
      Hair12.mirror = true;
      setRotation(Hair12, 0F, 0F, 0F);
      Hair13 = new ModelRenderer(this, 0, 100);
      Hair13.addBox(0F, 0F, 0F, 2, 2, 2);
      Hair13.setRotationPoint(2.5F, -3.5F, -5.5F);
      Hair13.setTextureSize(512, 512);
      Hair13.mirror = true;
      setRotation(Hair13, 0F, 0F, 0F);
      Hair14 = new ModelRenderer(this, 0, 100);
      Hair14.addBox(0F, 0F, 0F, 2, 2, 2);
      Hair14.setRotationPoint(-4.5F, -3.5F, -2F);
      Hair14.setTextureSize(512, 512);
      Hair14.mirror = true;
      setRotation(Hair14, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Leg1.render(f5);
    Leg2.render(f5);
    Torso.render(f5);
    Arm1.render(f5);
    Arm2.render(f5);
    Head.render(f5);
    Pupil1.render(f5);
    Eye1.render(f5);
    Stomach.render(f5);
    Eyebrow1.render(f5);
    Hair1.render(f5);
    Pupil2.render(f5);
    Eye2.render(f5);
    Hair2.render(f5);
    Cheeks.render(f5);
    Nose.render(f5);
    Eyebrow2.render(f5);
    Hair3.render(f5);
    Hair4.render(f5);
    Hair5.render(f5);
    Hair6.render(f5);
    Hair7.render(f5);
    Hair8.render(f5);
    Hair9.render(f5);
    Hair10.render(f5);
    Hair11.render(f5);
    Hair12.render(f5);
    Hair13.render(f5);
    Hair14.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}
