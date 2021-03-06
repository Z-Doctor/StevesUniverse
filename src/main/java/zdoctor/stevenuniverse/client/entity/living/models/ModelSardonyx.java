package zdoctor.stevenuniverse.client.entity.living.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSardonyx extends ModelBase
{
	  //fields
	    ModelRenderer Gem;
	    ModelRenderer Head;
	    ModelRenderer Neck;
	    ModelRenderer Mouth;
	    ModelRenderer Nose;
	    ModelRenderer Nose_2;
	    ModelRenderer Shades_1;
	    ModelRenderer Shades_2;
	    ModelRenderer Shades_3;
	    ModelRenderer Shades_4;
	    ModelRenderer Shades_5;
	    ModelRenderer Shades_6;
	    ModelRenderer Shades_7;
	    ModelRenderer Chest_1;
	    ModelRenderer Chest_2;
	    ModelRenderer Chest_3;
	    ModelRenderer Chest_4;
	    ModelRenderer Chest_5;
	    ModelRenderer Chest_6;
	    ModelRenderer Chest_7;
	    ModelRenderer Chest_8;
	    ModelRenderer Chest_9;
	    ModelRenderer Chest_10;
	    ModelRenderer Waist_1;
	    ModelRenderer Waist_2;
	    ModelRenderer Waist_3;
	    ModelRenderer Waist_4;
	    ModelRenderer Waist_5;
	    ModelRenderer Waist_6;
	    ModelRenderer Leg_Left_1;
	    ModelRenderer Leg_Left_2;
	    ModelRenderer Leg_Left_3;
	    ModelRenderer Leg_Left_4;
	    ModelRenderer Leg_Left_5;
	    ModelRenderer Leg_Left_6;
	    ModelRenderer Leg_Left_7;
	    ModelRenderer Leg_Left_8;
	    ModelRenderer Leg_Left_9;
	    ModelRenderer Leg_Left_10;
	    ModelRenderer Bowtie_1;
	    ModelRenderer Bowtie_2;
	    ModelRenderer Bowtie_3;
	    ModelRenderer Hair_1;
	    ModelRenderer Hair_2;
	    ModelRenderer Hair_3;
	    ModelRenderer Hair_4;
	    ModelRenderer Hair_5;
	    ModelRenderer Hair_6;
	    ModelRenderer Hair_7;
	    ModelRenderer Hair_8;
	    ModelRenderer Hair_9;
	    ModelRenderer Hair_10;
	    ModelRenderer Hair_11;
	    ModelRenderer Arm_Left;
	    ModelRenderer Arm_Right;
	    ModelRenderer Arm_Left_2;
	    ModelRenderer Arm_RIght_2;
	    ModelRenderer Leg_Right_1;
	    ModelRenderer Leg_Right_2;
	    ModelRenderer Leg_Right_3;
	    ModelRenderer Leg_Right_4;
	    ModelRenderer Leg_Right_5;
	    ModelRenderer Leg_Right_6;
	    ModelRenderer Leg_Right_7;
	    ModelRenderer Leg_Right_8;
	    ModelRenderer Leg_Right_9;
	    ModelRenderer Leg_Right_10;
	    ModelRenderer Eye_Top_Right;
	    ModelRenderer Eyes_Top_Left;
	    ModelRenderer Eyes_Bottom_Right;
	    ModelRenderer Eyes_Bottom_Left_;
	  
	  public ModelSardonyx()
	  {
	    textureWidth = 256;
	    textureHeight = 256;
	    
	      Gem = new ModelRenderer(this, 10, 18);
	      Gem.addBox(-1F, -8.133333F, -4.2F, 2, 2, 1);
	      Gem.setRotationPoint(0F, -12F, 0F);
	      Gem.setTextureSize(256, 256);
	      Gem.mirror = true;
	      setRotation(Gem, 0F, 0F, 0F);
	      Head = new ModelRenderer(this, 2, 0);
	      Head.addBox(-4F, -10.06667F, -4F, 8, 9, 8);
	      Head.setRotationPoint(0F, -11F, 0F);
	      Head.setTextureSize(256, 256);
	      Head.mirror = true;
	      setRotation(Head, 0F, 0F, 0F);
	      Neck = new ModelRenderer(this, 21, 21);
	      Neck.addBox(-1.4F, -1F, -1.4F, 3, 5, 3);
	      Neck.setRotationPoint(0F, -11.33333F, 0F);
	      Neck.setTextureSize(256, 256);
	      Neck.mirror = true;
	      setRotation(Neck, 0F, 0F, 0F);
	      Mouth = new ModelRenderer(this, 39, 17);
	      Mouth.addBox(-1F, -0.4F, -0.4F, 2, 1, 1);
	      Mouth.setRotationPoint(0F, -13.4F, -3.5F);
	      Mouth.setTextureSize(256, 256);
	      Mouth.mirror = true;
	      setRotation(Mouth, 0.7807508F, 0F, 0F);
	      Nose = new ModelRenderer(this, 0, 24);
	      Nose.addBox(-1F, -2F, -2F, 2, 1, 3);
	      Nose.setRotationPoint(0F, -13.33333F, -4F);
	      Nose.setTextureSize(256, 256);
	      Nose.mirror = true;
	      setRotation(Nose, -0.1707017F, 0F, 0F);
	      Nose_2 = new ModelRenderer(this, 0, 24);
	      Nose_2.addBox(-1F, -1F, -2F, 2, 1, 3);
	      Nose_2.setRotationPoint(0F, -14.66667F, -4F);
	      Nose_2.setTextureSize(256, 256);
	      Nose_2.mirror = true;
	      setRotation(Nose_2, 0F, 0F, 0F);
	      Shades_1 = new ModelRenderer(this, 40, 24);
	      Shades_1.addBox(-1F, 0F, -0.2F, 2, 1, 1);
	      Shades_1.setRotationPoint(0F, -17F, -4.3F);
	      Shades_1.setTextureSize(256, 256);
	      Shades_1.mirror = true;
	      setRotation(Shades_1, 0F, 0F, 0F);
	      Shades_2 = new ModelRenderer(this, 54, 11);
	      Shades_2.addBox(2F, 1.8F, -0.4666667F, 2, 1, 1);
	      Shades_2.setRotationPoint(0F, -17F, -4.3F);
	      Shades_2.setTextureSize(256, 256);
	      Shades_2.mirror = true;
	      setRotation(Shades_2, 0F, 0F, 0F);
	      Shades_3 = new ModelRenderer(this, 40, 4);
	      Shades_3.addBox(-4F, -1F, -0.4666667F, 3, 3, 1);
	      Shades_3.setRotationPoint(0F, -17F, -4.3F);
	      Shades_3.setTextureSize(256, 256);
	      Shades_3.mirror = true;
	      setRotation(Shades_3, 0F, 0F, 0F);
	      Shades_4 = new ModelRenderer(this, 40, 11);
	      Shades_4.addBox(-4F, 1.733333F, -0.4666667F, 2, 1, 1);
	      Shades_4.setRotationPoint(0F, -17F, -4.3F);
	      Shades_4.setTextureSize(256, 256);
	      Shades_4.mirror = true;
	      setRotation(Shades_4, 0F, 0F, 0F);
	      Shades_5 = new ModelRenderer(this, 40, 0);
	      Shades_5.addBox(-4F, -1.666667F, -0.4666667F, 2, 1, 1);
	      Shades_5.setRotationPoint(0F, -17F, -4.3F);
	      Shades_5.setTextureSize(256, 256);
	      Shades_5.mirror = true;
	      setRotation(Shades_5, 0F, 0F, 0F);
	      Shades_6 = new ModelRenderer(this, 54, 0);
	      Shades_6.addBox(2F, -1.7F, -0.4666667F, 2, 1, 1);
	      Shades_6.setRotationPoint(0F, -17F, -4.3F);
	      Shades_6.setTextureSize(256, 256);
	      Shades_6.mirror = true;
	      setRotation(Shades_6, 0F, 0F, 0F);
	      Shades_7 = new ModelRenderer(this, 51, 4);
	      Shades_7.addBox(1F, -1F, -0.4666667F, 3, 3, 1);
	      Shades_7.setRotationPoint(0F, -17F, -4.3F);
	      Shades_7.setTextureSize(256, 256);
	      Shades_7.mirror = true;
	      setRotation(Shades_7, 0F, 0F, 0F);
	      Chest_1 = new ModelRenderer(this, 0, 32);
	      Chest_1.addBox(-3.4F, 0F, -3F, 7, 6, 5);
	      Chest_1.setRotationPoint(0F, -10F, 0F);
	      Chest_1.setTextureSize(256, 256);
	      Chest_1.mirror = true;
	      setRotation(Chest_1, 0F, 0F, 0F);
	      Chest_2 = new ModelRenderer(this, 62, 36);
	      Chest_2.addBox(-3.4F, 0F, 2.3F, 7, 6, 1);
	      Chest_2.setRotationPoint(0F, -10F, 0F);
	      Chest_2.setTextureSize(256, 256);
	      Chest_2.mirror = true;
	      setRotation(Chest_2, 0F, 0F, 0F);
	      Chest_3 = new ModelRenderer(this, 13, 48);
	      Chest_3.addBox(3.6F, 0F, -3F, 1, 4, 5);
	      Chest_3.setRotationPoint(0F, -9F, 0F);
	      Chest_3.setTextureSize(256, 256);
	      Chest_3.mirror = true;
	      setRotation(Chest_3, 0F, 0F, 0F);
	      Chest_4 = new ModelRenderer(this, 68, 51);
	      Chest_4.addBox(-4F, 0F, -2F, 4, 3, 4);
	      Chest_4.setRotationPoint(3.466667F, -9.6F, 0F);
	      Chest_4.setTextureSize(256, 256);
	      Chest_4.mirror = true;
	      setRotation(Chest_4, 0F, -160.000F, 24.781F);
	      Chest_5 = new ModelRenderer(this, 48, 51);
	      Chest_5.addBox(-4F, 0F, -2F, 4, 3, 4);
	      Chest_5.setRotationPoint(-3.4F, -9.6F, 0F);
	      Chest_5.setTextureSize(256, 256);
	      Chest_5.mirror = true;
	      setRotation(Chest_5, 0F, 0F, 0.3976046F);
	      Chest_6 = new ModelRenderer(this, 13, 48);
	      Chest_6.addBox(-4.4F, 1F, -3F, 1, 4, 5);
	      Chest_6.setRotationPoint(0F, -10F, 0F);
	      Chest_6.setTextureSize(256, 256);
	      Chest_6.mirror = true;
	      setRotation(Chest_6, 0F, 0F, 0F);
	      Chest_7 = new ModelRenderer(this, 0, 61);
	      Chest_7.addBox(-4.4F, 1F, -2.4F, 9, 5, 5);
	      Chest_7.setRotationPoint(0F, -10F, 0F);
	      Chest_7.setTextureSize(256, 256);
	      Chest_7.mirror = true;
	      setRotation(Chest_7, 0F, 0F, 0F);
	      Chest_8 = new ModelRenderer(this, 0, 61);
	      Chest_8.addBox(-4.4F, 0F, -2.4F, 1, 5, 5);
	      Chest_8.setRotationPoint(0F, -10F, 0F);
	      Chest_8.setTextureSize(256, 256);
	      Chest_8.mirror = true;
	      setRotation(Chest_8, 0F, 0F, 0F);
	      Chest_9 = new ModelRenderer(this, 32, 32);
	      Chest_9.addBox(-4.4F, 1F, -1.7F, 9, 4, 5);
	      Chest_9.setRotationPoint(0F, -10F, 0F);
	      Chest_9.setTextureSize(256, 256);
	      Chest_9.mirror = true;
	      setRotation(Chest_9, 0F, 0F, 0F);
	      Chest_10 = new ModelRenderer(this, 0, 61);
	      Chest_10.addBox(3.6F, 0F, -2.4F, 1, 5, 5);
	      Chest_10.setRotationPoint(0F, -10F, 0F);
	      Chest_10.setTextureSize(256, 256);
	      Chest_10.mirror = true;
	      setRotation(Chest_10, 0F, 0F, 0F);
	      Waist_1 = new ModelRenderer(this, 56, 12);
	      Waist_1.addBox(-2.4F, 0F, -2.2F, 5, 7, 1);
	      Waist_1.setRotationPoint(0F, -7F, 0F);
	      Waist_1.setTextureSize(256, 256);
	      Waist_1.mirror = true;
	      setRotation(Waist_1, 0F, 0F, 0F);
	      Waist_2 = new ModelRenderer(this, 56, 12);
	      Waist_2.addBox(0.3F, 0F, -2F, 2, 7, 4);
	      Waist_2.setRotationPoint(1F, -7F, 0F);
	      Waist_2.setTextureSize(256, 256);
	      Waist_2.mirror = true;
	      setRotation(Waist_2, 0F, 0F, 0F);
	      Waist_3 = new ModelRenderer(this, 56, 12);
	      Waist_3.addBox(-2.4F, 0F, 1.2F, 5, 7, 1);
	      Waist_3.setRotationPoint(0F, -7F, 0F);
	      Waist_3.setTextureSize(256, 256);
	      Waist_3.mirror = true;
	      setRotation(Waist_3, 0F, 0F, 0F);
	      Waist_4 = new ModelRenderer(this, 56, 12);
	      Waist_4.addBox(-2.1F, 0F, -2F, 4, 7, 4);
	      Waist_4.setRotationPoint(-1F, -7F, 0F);
	      Waist_4.setTextureSize(256, 256);
	      Waist_4.mirror = true;
	      setRotation(Waist_4, 0F, 0F, 0F);
	      Waist_5 = new ModelRenderer(this, 120, 65);
	      Waist_5.addBox(-1F, -1F, -2F, 7, 1, 5);
	      Waist_5.setRotationPoint(-2.4F, 1F, -0.4666667F);
	      Waist_5.setTextureSize(256, 256);
	      Waist_5.mirror = true;
	      setRotation(Waist_5, 0F, 0F, 0F);
	      Waist_6 = new ModelRenderer(this, 90, 66);
	      Waist_6.addBox(-2F, 0F, -2F, 9, 1, 5);
	      Waist_6.setRotationPoint(-2.4F, 1F, -0.4666667F);
	      Waist_6.setTextureSize(256, 256);
	      Waist_6.mirror = true;
	      setRotation(Waist_6, 0F, 0F, 0F);
	      Leg_Left_1 = new ModelRenderer(this, 18, 82);
	      Leg_Left_1.addBox(-2F, 0F, -2F, 4, 7, 5);
	      Leg_Left_1.setRotationPoint(-2.4F, 2F, -0.4666667F);
	      Leg_Left_1.setTextureSize(256, 256);
	      Leg_Left_1.mirror = true;
	      setRotation(Leg_Left_1, 0F, 0F, 0F);
	      Leg_Left_2 = new ModelRenderer(this, 18, 82);
	      Leg_Left_2.addBox(-2.533333F, 0F, -2F, 1, 6, 5);
	      Leg_Left_2.setRotationPoint(-2.4F, 2F, -0.4666667F);
	      Leg_Left_2.setTextureSize(256, 256);
	      Leg_Left_2.mirror = true;
	      setRotation(Leg_Left_2, 0F, 0F, 0F);
	      Leg_Left_3 = new ModelRenderer(this, 18, 82);
	      Leg_Left_3.addBox(-2F, 0F, 2.4F, 4, 6, 1);
	      Leg_Left_3.setRotationPoint(-2.4F, 2F, -0.4666667F);
	      Leg_Left_3.setTextureSize(256, 256);
	      Leg_Left_3.mirror = true;
	      setRotation(Leg_Left_3, 0F, 0F, 0F);
	      Leg_Left_4 = new ModelRenderer(this, 0, 76);
	      Leg_Left_4.addBox(-1.5F, 7F, -2F, 3, 15, 4);
	      Leg_Left_4.setRotationPoint(-2.4F, 2F, -0.4666667F);
	      Leg_Left_4.setTextureSize(256, 256);
	      Leg_Left_4.mirror = true;
	      setRotation(Leg_Left_4, 0F, 0F, 0F);
	      Leg_Left_5 = new ModelRenderer(this, 0, 76);
	      Leg_Left_5.addBox(-1.833333F, 7F, -2F, 1, 7, 4);
	      Leg_Left_5.setRotationPoint(-2.4F, 2F, -0.4666667F);
	      Leg_Left_5.setTextureSize(256, 256);
	      Leg_Left_5.mirror = true;
	      setRotation(Leg_Left_5, 0F, 0F, 0F);
	      Leg_Left_6 = new ModelRenderer(this, 0, 76);
	      Leg_Left_6.addBox(-1.433333F, 7F, 1.3F, 3, 7, 1);
	      Leg_Left_6.setRotationPoint(-2.4F, 2F, -0.4666667F);
	      Leg_Left_6.setTextureSize(256, 256);
	      Leg_Left_6.mirror = true;
	      setRotation(Leg_Left_6, 0F, 0F, 0F);
	      Leg_Left_7 = new ModelRenderer(this, 0, 76);
	      Leg_Left_7.addBox(0.9F, 7F, -2F, 1, 7, 4);
	      Leg_Left_7.setRotationPoint(-2.4F, 2F, -0.4666667F);
	      Leg_Left_7.setTextureSize(256, 256);
	      Leg_Left_7.mirror = true;
	      setRotation(Leg_Left_7, 0F, 0F, 0F);
	      Leg_Left_8 = new ModelRenderer(this, 92, 93);
	      Leg_Left_8.addBox(-1.5F, 21F, -6F, 3, 1, 4);
	      Leg_Left_8.setRotationPoint(-2.4F, 2F, -0.4666667F);
	      Leg_Left_8.setTextureSize(256, 256);
	      Leg_Left_8.mirror = true;
	      setRotation(Leg_Left_8, 0F, 0F, 0F);
	      Leg_Left_9 = new ModelRenderer(this, 93, 103);
	      Leg_Left_9.addBox(-1F, 21F, -6.4F, 2, 1, 1);
	      Leg_Left_9.setRotationPoint(-2.4F, 2F, -0.4666667F);
	      Leg_Left_9.setTextureSize(256, 256);
	      Leg_Left_9.mirror = true;
	      setRotation(Leg_Left_9, 0F, 0F, 0F);
	      Leg_Left_10 = new ModelRenderer(this, 93, 84);
	      Leg_Left_10.addBox(-1F, 20.9F, -4.4F, 2, 1, 1);
	      Leg_Left_10.setRotationPoint(-2.4F, 2F, -0.4666667F);
	      Leg_Left_10.setTextureSize(256, 256);
	      Leg_Left_10.mirror = true;
	      setRotation(Leg_Left_10, 0F, 0F, 0F);
	      Bowtie_1 = new ModelRenderer(this, 58, 24);
	      Bowtie_1.addBox(-1.066667F, -0.6F, -1F, 2, 1, 1);
	      Bowtie_1.setRotationPoint(0.1F, -8.3F, -2.266667F);
	      Bowtie_1.setTextureSize(256, 256);
	      Bowtie_1.mirror = true;
	      setRotation(Bowtie_1, 0F, 0F, 0F);
	      Bowtie_2 = new ModelRenderer(this, 58, 24);
	      Bowtie_2.addBox(-3.066667F, -1.4F, -1F, 2, 3, 1);
	      Bowtie_2.setRotationPoint(0.1F, -8.3F, -2.266667F);
	      Bowtie_2.setTextureSize(256, 256);
	      Bowtie_2.mirror = true;
	      setRotation(Bowtie_2, 0F, 0F, 0F);
	      Bowtie_3 = new ModelRenderer(this, 58, 24);
	      Bowtie_3.addBox(0.9333333F, -1.4F, -1F, 2, 3, 1);
	      Bowtie_3.setRotationPoint(0.1F, -8.3F, -2.266667F);
	      Bowtie_3.setTextureSize(256, 256);
	      Bowtie_3.mirror = true;
	      setRotation(Bowtie_3, 0F, 0F, 0F);
	      Hair_1 = new ModelRenderer(this, 84, 1);
	      Hair_1.addBox(4F, 0.2666667F, -1.4F, 4, 3, 9);
	      Hair_1.setRotationPoint(0F, -17.5F, -3.466667F);
	      Hair_1.setTextureSize(256, 256);
	      Hair_1.mirror = true;
	      setRotation(Hair_1, 0F, 0F, 0F);
	      Hair_2 = new ModelRenderer(this, 84, 1);
	      Hair_2.addBox(-1.6F, 0.3F, -1.4F, 2, 3, 9);
	      Hair_2.setRotationPoint(7.933333F, -14.7F, -3.466667F);
	      Hair_2.setTextureSize(256, 256);
	      Hair_2.mirror = true;
	      setRotation(Hair_2, 0F, 0F, 0.7746577F);
	      Hair_3 = new ModelRenderer(this, 84, 1);
	      Hair_3.addBox(-0.6F, 0.3F, -1.4F, 2, 3, 9);
	      Hair_3.setRotationPoint(-7.733333F, -14.9F, -3.466667F);
	      Hair_3.setTextureSize(256, 256);
	      Hair_3.mirror = true;
	      setRotation(Hair_3, 0F, 0F, -0.7648467F);
	      Hair_4 = new ModelRenderer(this, 84, 1);
	      Hair_4.addBox(-0.6F, 0.3F, -1.4F, 3, 10, 9);
	      Hair_4.setRotationPoint(7.6F, -16.7F, -3.466667F);
	      Hair_4.setTextureSize(256, 256);
	      Hair_4.mirror = true;
	      setRotation(Hair_4, 0F, 0F, 2.586595F);
	      Hair_5 = new ModelRenderer(this, 84, 1);
	      Hair_5.addBox(-2.6F, 0.3F, -1.4F, 3, 10, 9);
	      Hair_5.setRotationPoint(-7.8F, -16.8F, -3.466667F);
	      Hair_5.setTextureSize(256, 256);
	      Hair_5.mirror = true;
	      setRotation(Hair_5, 0F, 0F, -2.586599F);
	      Hair_6 = new ModelRenderer(this, 84, 1);
	      Hair_6.addBox(-2.6F, -8.3F, -1.4F, 5, 5, 9);
	      Hair_6.setRotationPoint(0F, -17.4F, -3.466667F);
	      Hair_6.setTextureSize(256, 256);
	      Hair_6.mirror = true;
	      setRotation(Hair_6, 0F, 0F, 0F);
	      Hair_7 = new ModelRenderer(this, 84, 1);
	      Hair_7.addBox(-3F, -8.6F, -0.4F, 6, 4, 8);
	      Hair_7.setRotationPoint(0F, -12.4F, -3.466667F);
	      Hair_7.setTextureSize(256, 256);
	      Hair_7.mirror = true;
	      setRotation(Hair_7, 0F, 0F, 0F);
	      Hair_8 = new ModelRenderer(this, 84, 1);
	      Hair_8.addBox(4F, -0.6F, -1.4F, 2, 6, 9);
	      Hair_8.setRotationPoint(0F, -17.5F, -3.466667F);
	      Hair_8.setTextureSize(256, 256);
	      Hair_8.mirror = true;
	      setRotation(Hair_8, 0F, 0F, 0F);
	      Hair_9 = new ModelRenderer(this, 84, 1);
	      Hair_9.addBox(-8F, 0.2666667F, -1.4F, 4, 3, 9);
	      Hair_9.setRotationPoint(0F, -17.5F, -3.466667F);
	      Hair_9.setTextureSize(256, 256);
	      Hair_9.mirror = true;
	      setRotation(Hair_9, 0F, 0F, 0F);
	      Hair_10 = new ModelRenderer(this, 84, 1);
	      Hair_10.addBox(-6F, -0.6F, -1.4F, 2, 6, 9);
	      Hair_10.setRotationPoint(0F, -17.5F, -3.466667F);
	      Hair_10.setTextureSize(256, 256);
	      Hair_10.mirror = true;
	      setRotation(Hair_10, 0F, 0F, 0F);
	      Hair_11 = new ModelRenderer(this, 84, 1);
	      Hair_11.addBox(-6F, -2.7F, -0.4F, 12, 8, 8);
	      Hair_11.setRotationPoint(0F, -17.4F, -3.466667F);
	      Hair_11.setTextureSize(256, 256);
	      Hair_11.mirror = true;
	      setRotation(Hair_11, 0F, 0F, 0F);
	      Arm_Left = new ModelRenderer(this, 49, 61);
	      Arm_Left.addBox(-1F, 0F, -1F, 2, 12, 2);
	      Arm_Left.setRotationPoint(-6F, -8F, 0F);
	      Arm_Left.setTextureSize(256, 256);
	      Arm_Left.mirror = true;
	      setRotation(Arm_Left, 0F, 0F, 0.3586602F);

	      Arm_Right = new ModelRenderer(this, 49, 61);
	      Arm_Right.addBox(-1F, 0F, -1F, 2, 12, 2);
	      Arm_Right.setRotationPoint(6F, -8F, 0F);
	      Arm_Right.setTextureSize(256, 256);
	      Arm_Right.mirror = true;
	      setRotation(Arm_Right, 0F, 0F, -0.35866024947643294F);

	      Arm_Left_2 = new ModelRenderer(this, 39, 61);
	      Arm_Left_2.addBox(-1F, 0F, -1F, 2, 12, 2);
	      Arm_Left_2.setRotationPoint(-2.4F, -2.933333F, 0F);
	      Arm_Left_2.setTextureSize(256, 256);
	      Arm_Left_2.mirror = true;
	      setRotation(Arm_Left_2, 0F, 0F, 0.7138222F);
	      Arm_RIght_2 = new ModelRenderer(this, 39, 61);
	      Arm_RIght_2.addBox(-1F, 0F, -1F, 2, 12, 2);
	      Arm_RIght_2.setRotationPoint(2.6F, -2.933333F, 0F);
	      Arm_RIght_2.setTextureSize(256, 256);
	      Arm_RIght_2.mirror = true;
	      setRotation(Arm_RIght_2, 0F, 0F, -0.7138167F);
	      Leg_Right_1 = new ModelRenderer(this, 18, 82);
	      Leg_Right_1.addBox(0.8F, 0F, -2F, 1, 6, 5);
	      Leg_Right_1.setRotationPoint(3.3F, 2F, -0.4666667F);
	      Leg_Right_1.setTextureSize(256, 256);
	      Leg_Right_1.mirror = true;
	      setRotation(Leg_Right_1, 0F, 0F, 0F);
	      Leg_Right_2 = new ModelRenderer(this, 0, 76);
	      Leg_Right_2.addBox(-2.166667F, 7F, 1.4F, 3, 7, 1);
	      Leg_Right_2.setRotationPoint(3.3F, 2F, -0.4666667F);
	      Leg_Right_2.setTextureSize(256, 256);
	      Leg_Right_2.mirror = true;
	      setRotation(Leg_Right_2, 0F, 0F, 0F);
	      Leg_Right_3 = new ModelRenderer(this, 18, 82);
	      Leg_Right_3.addBox(-2.733333F, 0F, 2.4F, 4, 6, 1);
	      Leg_Right_3.setRotationPoint(3.3F, 2F, -0.4666667F);
	      Leg_Right_3.setTextureSize(256, 256);
	      Leg_Right_3.mirror = true;
	      setRotation(Leg_Right_3, 0F, 0F, 0F);
	      Leg_Right_4 = new ModelRenderer(this, 18, 82);
	      Leg_Right_4.addBox(-2.733333F, 0F, -2F, 4, 7, 5);
	      Leg_Right_4.setRotationPoint(3.3F, 2F, -0.4666667F);
	      Leg_Right_4.setTextureSize(256, 256);
	      Leg_Right_4.mirror = true;
	      setRotation(Leg_Right_4, 0F, 0F, 0F);
	      Leg_Right_5 = new ModelRenderer(this, 0, 76);
	      Leg_Right_5.addBox(-2.2F, 7F, -2F, 3, 15, 4);
	      Leg_Right_5.setRotationPoint(3.3F, 2F, -0.4666667F);
	      Leg_Right_5.setTextureSize(256, 256);
	      Leg_Right_5.mirror = true;
	      setRotation(Leg_Right_5, 0F, 0F, 0F);
	      Leg_Right_6 = new ModelRenderer(this, 0, 76);
	      Leg_Right_6.addBox(3.1F, 7F, -2F, 1, 7, 4);
	      Leg_Right_6.setRotationPoint(-2.4F, 2F, -0.4666667F);
	      Leg_Right_6.setTextureSize(256, 256);
	      Leg_Right_6.mirror = true;
	      setRotation(Leg_Right_6, 0F, 0F, 0F);
	      Leg_Right_7 = new ModelRenderer(this, 0, 76);
	      Leg_Right_7.addBox(0.1333333F, 7F, -2F, 1, 7, 4);
	      Leg_Right_7.setRotationPoint(3.3F, 2F, -0.4666667F);
	      Leg_Right_7.setTextureSize(256, 256);
	      Leg_Right_7.mirror = true;
	      setRotation(Leg_Right_7, 0F, 0F, 0F);
	      Leg_Right_8 = new ModelRenderer(this, 93, 84);
	      Leg_Right_8.addBox(-1F, 20.9F, -4.4F, 2, 1, 1);
	      Leg_Right_8.setRotationPoint(2.6F, 2F, -0.4666667F);
	      Leg_Right_8.setTextureSize(256, 256);
	      Leg_Right_8.mirror = true;
	      setRotation(Leg_Right_8, 0F, 0F, 0F);
	      Leg_Right_9 = new ModelRenderer(this, 92, 93);
	      Leg_Right_9.addBox(3.5F, 21F, -6F, 3, 1, 4);
	      Leg_Right_9.setRotationPoint(-2.4F, 2F, -0.4666667F);
	      Leg_Right_9.setTextureSize(256, 256);
	      Leg_Right_9.mirror = true;
	      setRotation(Leg_Right_9, 0F, 0F, 0F);
	      Leg_Right_10 = new ModelRenderer(this, 93, 103);
	      Leg_Right_10.addBox(4F, 21F, -6.4F, 2, 1, 1);
	      Leg_Right_10.setRotationPoint(-2.4F, 2F, -0.4666667F);
	      Leg_Right_10.setTextureSize(256, 256);
	      Leg_Right_10.mirror = true;
	      setRotation(Leg_Right_10, 0F, 0F, 0F);
	      Eye_Top_Right = new ModelRenderer(this, 87, 33);
	      Eye_Top_Right.addBox(-1F, -0.3333333F, 0F, 2, 1, 1);
	      Eye_Top_Right.setRotationPoint(-2.466667F, -17.36667F, -4.8F);
	      Eye_Top_Right.setTextureSize(256, 256);
	      Eye_Top_Right.mirror = true;
	      setRotation(Eye_Top_Right, 0F, 0F, 0F);
	      Eyes_Top_Left = new ModelRenderer(this, 103, 33);
	      Eyes_Top_Left.addBox(-1F, -0.3333333F, 0F, 2, 1, 1);
	      Eyes_Top_Left.setRotationPoint(2.533333F, -17.36667F, -4.8F);
	      Eyes_Top_Left.setTextureSize(256, 256);
	      Eyes_Top_Left.mirror = true;
	      setRotation(Eyes_Top_Left, 0F, 0F, 0F);
	      Eyes_Bottom_Right = new ModelRenderer(this, 87, 33);
	      Eyes_Bottom_Right.addBox(-1F, -0.3333333F, 0F, 2, 1, 1);
	      Eyes_Bottom_Right.setRotationPoint(-2.466667F, -15.9F, -4.8F);
	      Eyes_Bottom_Right.setTextureSize(256, 256);
	      Eyes_Bottom_Right.mirror = true;
	      setRotation(Eyes_Bottom_Right, 0F, 0F, 0F);
	      Eyes_Bottom_Left_ = new ModelRenderer(this, 103, 33);
	      Eyes_Bottom_Left_.addBox(-1F, -0.3333333F, 0F, 2, 1, 1);
	      Eyes_Bottom_Left_.setRotationPoint(2.533333F, -15.9F, -4.8F);
	      Eyes_Bottom_Left_.setTextureSize(256, 256);
	      Eyes_Bottom_Left_.mirror = true;
	      setRotation(Eyes_Bottom_Left_, 0F, 0F, 0F);
	  }
	  
	  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	  {
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5);
	    Gem.render(f5);
	    Head.render(f5);
	    Neck.render(f5);
	    Mouth.render(f5);
	    Nose.render(f5);
	    Nose_2.render(f5);
	    Shades_1.render(f5);
	    Shades_2.render(f5);
	    Shades_3.render(f5);
	    Shades_4.render(f5);
	    Shades_5.render(f5);
	    Shades_6.render(f5);
	    Shades_7.render(f5);
	    Chest_1.render(f5);
	    Chest_2.render(f5);
	    Chest_3.render(f5);
	    Chest_4.render(f5);
	    Chest_5.render(f5);
	    Chest_6.render(f5);
	    Chest_7.render(f5);
	    Chest_8.render(f5);
	    Chest_9.render(f5);
	    Chest_10.render(f5);
	    Waist_1.render(f5);
	    Waist_2.render(f5);
	    Waist_3.render(f5);
	    Waist_4.render(f5);
	    Waist_5.render(f5);
	    Waist_6.render(f5);
	    Leg_Left_1.render(f5);
	    Leg_Left_2.render(f5);
	    Leg_Left_3.render(f5);
	    Leg_Left_4.render(f5);
	    Leg_Left_5.render(f5);
	    Leg_Left_6.render(f5);
	    Leg_Left_7.render(f5);
	    Leg_Left_8.render(f5);
	    Leg_Left_9.render(f5);
	    Leg_Left_10.render(f5);
	    Bowtie_1.render(f5);
	    Bowtie_2.render(f5);
	    Bowtie_3.render(f5);
	    Hair_1.render(f5);
	    Hair_2.render(f5);
	    Hair_3.render(f5);
	    Hair_4.render(f5);
	    Hair_5.render(f5);
	    Hair_6.render(f5);
	    Hair_7.render(f5);
	    Hair_8.render(f5);
	    Hair_9.render(f5);
	    Hair_10.render(f5);
	    Hair_11.render(f5);
	    Arm_Left.render(f5);
	    Arm_Right.render(f5);
	    Arm_Left_2.render(f5);
	    Arm_RIght_2.render(f5);
	    Leg_Right_1.render(f5);
	    Leg_Right_2.render(f5);
	    Leg_Right_3.render(f5);
	    Leg_Right_4.render(f5);
	    Leg_Right_5.render(f5);
	    Leg_Right_6.render(f5);
	    Leg_Right_7.render(f5);
	    Leg_Right_8.render(f5);
	    Leg_Right_9.render(f5);
	    Leg_Right_10.render(f5);
	    Eye_Top_Right.render(f5);
	    Eyes_Top_Left.render(f5);
	    Eyes_Bottom_Right.render(f5);
	    Eyes_Bottom_Left_.render(f5);
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
