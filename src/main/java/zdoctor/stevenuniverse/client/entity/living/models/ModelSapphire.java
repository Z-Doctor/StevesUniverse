
package zdoctor.stevenuniverse.client.entity.living.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSapphire extends ModelBase
{
	  //fields
	    ModelRenderer Head;
	    ModelRenderer Chest;
	    ModelRenderer TorsoTop;
	    ModelRenderer TorsoFront;
	    ModelRenderer TorsoBottom;
	    ModelRenderer TorsoRight;
	    ModelRenderer TorsoLeft;
	    ModelRenderer TorsoBack;
	    ModelRenderer Dress1;
	    ModelRenderer Dress2;
	    ModelRenderer Dress3;
	    ModelRenderer Dress4;
	    ModelRenderer ArmCover2;
	    ModelRenderer Arm2;
	    ModelRenderer Hair1;
	    ModelRenderer Hair2;
	    ModelRenderer Hair3;
	    ModelRenderer Hair4;
	    ModelRenderer Hair5;
	    ModelRenderer Hair6;
	    ModelRenderer AmCover1;
	    ModelRenderer Arm1;
	    ModelRenderer Hair7;
	    ModelRenderer Hair8;
	    ModelRenderer Hair9;
	    ModelRenderer Hair10;
	    ModelRenderer Hair11;
	    ModelRenderer Hair12;
	    ModelRenderer Hair13;
	    ModelRenderer Hair14;
	    ModelRenderer Hair15;
	    ModelRenderer Hair16;
	    ModelRenderer Hair17;
	  
	  public ModelSapphire()
	  {
	    textureWidth = 256;
	    textureHeight = 256;
	    
	      Head = new ModelRenderer(this, 0, 20);
	      Head.addBox(0F, 0F, 0F, 7, 7, 7);
	      Head.setRotationPoint(-3.5F, -3F, -3.5F);
	      Head.setTextureSize(256, 256);
	      Head.mirror = true;
	      setRotation(Head, 0F, 0F, 0F);
	      Chest = new ModelRenderer(this, 0, 40);
	      Chest.addBox(0F, 0F, 0F, 2, 2, 2);
	      Chest.setRotationPoint(-1F, 4F, -1F);
	      Chest.setTextureSize(256, 256);
	      Chest.mirror = true;
	      setRotation(Chest, 0F, 0F, 0F);
	      TorsoTop = new ModelRenderer(this, 27, 51);
	      TorsoTop.addBox(0F, 0F, 0F, 6, 1, 6);
	      TorsoTop.setRotationPoint(-3F, 6F, -3F);
	      TorsoTop.setTextureSize(256, 256);
	      TorsoTop.mirror = true;
	      setRotation(TorsoTop, 0F, 0F, 0F);
	      TorsoFront = new ModelRenderer(this, 31, 65);
	      TorsoFront.addBox(0F, 0F, 0F, 6, 5, 1);
	      TorsoFront.setRotationPoint(-3F, 6.5F, -3.5F);
	      TorsoFront.setTextureSize(256, 256);
	      TorsoFront.mirror = true;
	      setRotation(TorsoFront, 0F, 0F, 0F);
	      TorsoBottom = new ModelRenderer(this, 23, 78);
	      TorsoBottom.addBox(0F, 0F, 0F, 6, 1, 6);
	      TorsoBottom.setRotationPoint(-3F, 11F, -3F);
	      TorsoBottom.setTextureSize(256, 256);
	      TorsoBottom.mirror = true;
	      setRotation(TorsoBottom, 0F, 0F, 0F);
	      TorsoRight = new ModelRenderer(this, 51, 60);
	      TorsoRight.addBox(0F, 0F, 0F, 1, 5, 6);
	      TorsoRight.setRotationPoint(2.5F, 6.5F, -3F);
	      TorsoRight.setTextureSize(256, 256);
	      TorsoRight.mirror = true;
	      setRotation(TorsoRight, 0F, 0F, 0F);
	      TorsoLeft = new ModelRenderer(this, 8, 60);
	      TorsoLeft.addBox(0F, 0F, 0F, 1, 5, 6);
	      TorsoLeft.setRotationPoint(-3.5F, 6.5F, -3F);
	      TorsoLeft.setTextureSize(256, 256);
	      TorsoLeft.mirror = true;
	      setRotation(TorsoLeft, 0F, 0F, 0F);
	      TorsoBack = new ModelRenderer(this, 71, 64);
	      TorsoBack.addBox(0F, 0F, 0F, 6, 5, 1);
	      TorsoBack.setRotationPoint(-3F, 6.5F, 2.5F);
	      TorsoBack.setTextureSize(256, 256);
	      TorsoBack.mirror = true;
	      setRotation(TorsoBack, 0F, 0F, 0F);
	      Dress1 = new ModelRenderer(this, 0, 93);
	      Dress1.addBox(0F, 0F, 0F, 5, 2, 5);
	      Dress1.setRotationPoint(-2.5F, 12F, -2.5F);
	      Dress1.setTextureSize(256, 256);
	      Dress1.mirror = true;
	      setRotation(Dress1, 0F, 0F, 0F);
	      Dress2 = new ModelRenderer(this, 0, 107);
	      Dress2.addBox(0F, 0F, 0F, 6, 3, 6);
	      Dress2.setRotationPoint(-3F, 13.5F, -3F);
	      Dress2.setTextureSize(256, 256);
	      Dress2.mirror = true;
	      setRotation(Dress2, 0F, 0F, 0F);
	      Dress3 = new ModelRenderer(this, 0, 120);
	      Dress3.addBox(0F, 0F, 0F, 7, 4, 7);
	      Dress3.setRotationPoint(-3.5F, 15F, -3.5F);
	      Dress3.setTextureSize(256, 256);
	      Dress3.mirror = true;
	      setRotation(Dress3, 0F, 0F, 0F);
	      Dress4 = new ModelRenderer(this, 0, 138);
	      Dress4.addBox(0F, 0F, 0F, 8, 7, 8);
	      Dress4.setRotationPoint(-4F, 17.5F, -4F);
	      Dress4.setTextureSize(256, 256);
	      Dress4.mirror = true;
	      setRotation(Dress4, 0F, 0F, 0F);
	      ArmCover2 = new ModelRenderer(this, 94, 64);
	      ArmCover2.addBox(0F, 0F, 0F, 3, 3, 3);
	      ArmCover2.setRotationPoint(3.5F, 6F, -1.5F);
	      ArmCover2.setTextureSize(256, 256);
	      ArmCover2.mirror = true;
	      setRotation(ArmCover2, 0F, 0F, 0F);
	      Arm2 = new ModelRenderer(this, 99, 80);
	      Arm2.addBox(0F, 0F, 0F, 2, 9, 2);
	      Arm2.setRotationPoint(4F, 9F, -1F);
	      Arm2.setTextureSize(256, 256);
	      Arm2.mirror = true;
	      setRotation(Arm2, 0F, 0F, -0.1570796F);
	      Hair1 = new ModelRenderer(this, 38, 0);
	      Hair1.addBox(0F, 0F, 0F, 8, 3, 2);
	      Hair1.setRotationPoint(-4F, 16F, 4F);
	      Hair1.setTextureSize(256, 256);
	      Hair1.mirror = true;
	      setRotation(Hair1, 0F, 0F, 0F);
	      Hair2 = new ModelRenderer(this, 37, 0);
	      Hair2.addBox(0F, 0F, 0F, 7, 2, 2);
	      Hair2.setRotationPoint(-3.5F, 14F, 4F);
	      Hair2.setTextureSize(256, 256);
	      Hair2.mirror = true;
	      setRotation(Hair2, 0F, 0F, 0F);
	      Hair3 = new ModelRenderer(this, 40, 0);
	      Hair3.addBox(0F, 0F, 0F, 8, 4, 2);
	      Hair3.setRotationPoint(-4F, 10F, 4F);
	      Hair3.setTextureSize(256, 256);
	      Hair3.mirror = true;
	      setRotation(Hair3, 0F, 0F, 0F);
	      Hair4 = new ModelRenderer(this, 35, 0);
	      Hair4.addBox(0F, 0F, 0F, 7, 2, 2);
	      Hair4.setRotationPoint(-3.5F, 8F, 4F);
	      Hair4.setTextureSize(256, 256);
	      Hair4.mirror = true;
	      setRotation(Hair4, 0F, 0F, 0F);
	      Hair5 = new ModelRenderer(this, 39, 0);
	      Hair5.addBox(0F, 0F, 0F, 8, 3, 2);
	      Hair5.setRotationPoint(-4F, 5F, 4F);
	      Hair5.setTextureSize(256, 256);
	      Hair5.mirror = true;
	      setRotation(Hair5, 0F, 0F, 0F);
	      Hair6 = new ModelRenderer(this, 40, 0);
	      Hair6.addBox(0F, 0F, 0F, 7, 2, 2);
	      Hair6.setRotationPoint(-3.5F, 3F, 3F);
	      Hair6.setTextureSize(256, 256);
	      Hair6.mirror = true;
	      setRotation(Hair6, 0F, 0F, 0F);
	      AmCover1 = new ModelRenderer(this, 94, 64);
	      AmCover1.addBox(0F, 0F, 0F, 3, 3, 3);
	      AmCover1.setRotationPoint(-6.5F, 6F, -1.5F);
	      AmCover1.setTextureSize(256, 256);
	      AmCover1.mirror = true;
	      setRotation(AmCover1, 0F, 0F, 0F);
	      Arm1 = new ModelRenderer(this, 99, 80);
	      Arm1.addBox(0F, 0F, 0F, 2, 9, 2);
	      Arm1.setRotationPoint(-6F, 8.2F, -1F);
	      Arm1.setTextureSize(256, 256);
	      Arm1.mirror = true;
	      setRotation(Arm1, 0F, 0F, 0.1570796F);
	      Hair7 = new ModelRenderer(this, 37, 0);
	      Hair7.addBox(0F, 0F, 0F, 7, 6, 1);
	      Hair7.setRotationPoint(-3.5F, -3F, 3F);
	      Hair7.setTextureSize(256, 256);
	      Hair7.mirror = true;
	      setRotation(Hair7, 0F, 0F, 0F);
	      Hair8 = new ModelRenderer(this, 39, 0);
	      Hair8.addBox(0F, 0F, 0F, 8, 5, 4);
	      Hair8.setRotationPoint(-4F, -3F, -0.5F);
	      Hair8.setTextureSize(256, 256);
	      Hair8.mirror = true;
	      setRotation(Hair8, 0F, 0F, 0F);
	      Hair9 = new ModelRenderer(this, 35, 0);
	      Hair9.addBox(0F, 0F, 0F, 7, 1, 7);
	      Hair9.setRotationPoint(-3.5F, -3.5F, -3.5F);
	      Hair9.setTextureSize(256, 256);
	      Hair9.mirror = true;
	      setRotation(Hair9, 0F, 0F, 0F);
	      Hair10 = new ModelRenderer(this, 41, 0);
	      Hair10.addBox(0F, 0F, 0F, 7, 4, 1);
	      Hair10.setRotationPoint(-3.5F, -3F, -4F);
	      Hair10.setTextureSize(256, 256);
	      Hair10.mirror = true;
	      setRotation(Hair10, 0F, 0F, 0F);
	      Hair11 = new ModelRenderer(this, 36, 0);
	      Hair11.addBox(0F, 0F, 0F, 1, 1, 1);
	      Hair11.setRotationPoint(-3F, 0.1F, -4.5F);
	      Hair11.setTextureSize(256, 256);
	      Hair11.mirror = true;
	      setRotation(Hair11, 0F, 0F, 0.3839724F);
	      Hair12 = new ModelRenderer(this, 39, 0);
	      Hair12.addBox(0F, 0F, 0F, 7, 2, 1);
	      Hair12.setRotationPoint(-3.5F, -1.3F, -4.5F);
	      Hair12.setTextureSize(256, 256);
	      Hair12.mirror = true;
	      setRotation(Hair12, 0F, 0.0174533F, 0F);
	      Hair13 = new ModelRenderer(this, 36, 0);
	      Hair13.addBox(0F, 0F, 0F, 1, 1, 1);
	      Hair13.setRotationPoint(-1.5F, 0.1F, -4.166667F);
	      Hair13.setTextureSize(256, 256);
	      Hair13.mirror = true;
	      setRotation(Hair13, 0F, 0F, 0.3839724F);
	      Hair14 = new ModelRenderer(this, 36, 0);
	      Hair14.addBox(0F, 0F, 0F, 1, 1, 1);
	      Hair14.setRotationPoint(0F, 0.1F, -4.5F);
	      Hair14.setTextureSize(256, 256);
	      Hair14.mirror = true;
	      setRotation(Hair14, 0F, 0F, 0.3839724F);
	      Hair15 = new ModelRenderer(this, 36, 0);
	      Hair15.addBox(0F, 0F, 0F, 1, 1, 1);
	      Hair15.setRotationPoint(1.5F, 0.1F, -4.5F);
	      Hair15.setTextureSize(256, 256);
	      Hair15.mirror = true;
	      setRotation(Hair15, 0F, 0F, 0.3839724F);
	      Hair16 = new ModelRenderer(this, 33, 0);
	      Hair16.addBox(0F, 0F, 0F, 8, 2, 3);
	      Hair16.setRotationPoint(-4F, 2F, 0.5F);
	      Hair16.setTextureSize(256, 256);
	      Hair16.mirror = true;
	      setRotation(Hair16, 0F, 0F, 0F);
	      Hair17 = new ModelRenderer(this, 35, 0);
	      Hair17.addBox(0F, 0F, 0F, 8, 4, 3);
	      Hair17.setRotationPoint(-4F, -3F, -3.5F);
	      Hair17.setTextureSize(256, 256);
	      Hair17.mirror = true;
	      setRotation(Hair17, 0F, 0F, 0F);
	  }
	  
	  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	  {
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5);
	    Head.render(f5);
	    Chest.render(f5);
	    TorsoTop.render(f5);
	    TorsoFront.render(f5);
	    TorsoBottom.render(f5);
	    TorsoRight.render(f5);
	    TorsoLeft.render(f5);
	    TorsoBack.render(f5);
	    Dress1.render(f5);
	    Dress2.render(f5);
	    Dress3.render(f5);
	    Dress4.render(f5);
	    ArmCover2.render(f5);
	    Arm2.render(f5);
	    Hair1.render(f5);
	    Hair2.render(f5);
	    Hair3.render(f5);
	    Hair4.render(f5);
	    Hair5.render(f5);
	    Hair6.render(f5);
	    AmCover1.render(f5);
	    Arm1.render(f5);
	    Hair7.render(f5);
	    Hair8.render(f5);
	    Hair9.render(f5);
	    Hair10.render(f5);
	    Hair11.render(f5);
	    Hair12.render(f5);
	    Hair13.render(f5);
	    Hair14.render(f5);
	    Hair15.render(f5);
	    Hair16.render(f5);
	    Hair17.render(f5);
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