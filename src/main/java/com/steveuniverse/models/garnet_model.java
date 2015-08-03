package com.steveuniverse.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class garnet_model extends ModelBase

{
  //fields
    ModelRenderer Foot2;
    ModelRenderer Foot1;
    ModelRenderer Toe1;
    ModelRenderer Toe2;
    ModelRenderer FootAngle2;
    ModelRenderer FootAngle1;
    ModelRenderer Neck;
    ModelRenderer Head;
    ModelRenderer Mouth;
    ModelRenderer GlassesTop;
    ModelRenderer GlassesMid;
    ModelRenderer GlassesBottom1;
    ModelRenderer GlassesBottom2;
    ModelRenderer Hair1;
    ModelRenderer HairTop1;
    ModelRenderer HairTop2;
    ModelRenderer Hair2;
    ModelRenderer Hair3;
    ModelRenderer Hair4;
    ModelRenderer Hair5;
    ModelRenderer Hair6;
    ModelRenderer Hair7;
    ModelRenderer Hair8;
    ModelRenderer Hair9;
    ModelRenderer HairBack;
    ModelRenderer TorsoFront;
    ModelRenderer TorsoBack;
    ModelRenderer TorsoSide1;
    ModelRenderer TorsoSide2;
    ModelRenderer TorsoTop;
    ModelRenderer TorsoBottom;
    ModelRenderer ArmCover2;
    ModelRenderer ArmCover1;
    ModelRenderer WaistFront;
    ModelRenderer WaistSide2;
    ModelRenderer WaistBack;
    ModelRenderer WaistSide1;
    ModelRenderer LegBlueThigh1;
    ModelRenderer LegBlueThigh2;
    ModelRenderer LegBlueThigh3;
    ModelRenderer LegBlueThigh4;
    ModelRenderer LegBlueThigh5;
    ModelRenderer LegBlueThigh6;
    ModelRenderer LegBlueThigh7;
    ModelRenderer LegBlueThigh8;
    ModelRenderer LegBlueThigh9;
    ModelRenderer LegRedThigh1;
    ModelRenderer LegRedThigh2;
    ModelRenderer LegRedThigh3;
    ModelRenderer LegRedThigh4;
    ModelRenderer LegRedThigh5;
    ModelRenderer LegRedThigh6;
    ModelRenderer LegRedThigh7;
    ModelRenderer LegRedThigh8;
    ModelRenderer LegRed;
    ModelRenderer LegRedTop;
    ModelRenderer LegRedBottom;
    ModelRenderer LegBlueBottom;
    ModelRenderer LegBlue;
    ModelRenderer LegBlueTop;
    ModelRenderer Arm1;
    ModelRenderer Arm2;
  
  public garnet_model()
  {
    textureWidth = 512;
    textureHeight = 512;
    
      Foot2 = new ModelRenderer(this, 82, 155);
      Foot2.addBox(0F, 0F, 0F, 2, 1, 6);
      Foot2.setRotationPoint(2F, 23F, -4.5F);
      Foot2.setTextureSize(512, 512);
      Foot2.mirror = true;
      setRotation(Foot2, 0F, 0F, 0F);
      Foot1 = new ModelRenderer(this, 100, 155);
      Foot1.addBox(0F, 0F, 0F, 2, 1, 6);
      Foot1.setRotationPoint(-4F, 23F, -4.5F);
      Foot1.setTextureSize(512, 512);
      Foot1.mirror = true;
      setRotation(Foot1, 0F, 0F, 0F);
      Toe1 = new ModelRenderer(this, 100, 169);
      Toe1.addBox(0F, 0F, 0F, 1, 1, 1);
      Toe1.setRotationPoint(-3.5F, 23F, -5F);
      Toe1.setTextureSize(512, 512);
      Toe1.mirror = true;
      setRotation(Toe1, 0F, 0F, 0F);
      Toe2 = new ModelRenderer(this, 100, 169);
      Toe2.addBox(0F, 0F, 0F, 1, 1, 1);
      Toe2.setRotationPoint(2.5F, 23F, -5F);
      Toe2.setTextureSize(512, 512);
      Toe2.mirror = true;
      setRotation(Toe2, 0F, 0F, 0F);
      FootAngle2 = new ModelRenderer(this, 90, 145);
      FootAngle2.addBox(0F, 0F, 0F, 2, 1, 3);
      FootAngle2.setRotationPoint(2F, 23F, -3.5F);
      FootAngle2.setTextureSize(512, 512);
      FootAngle2.mirror = true;
      setRotation(FootAngle2, 0.1047198F, 0F, 0F);
      FootAngle1 = new ModelRenderer(this, 100, 145);
      FootAngle1.addBox(0F, 0F, 0F, 2, 1, 3);
      FootAngle1.setRotationPoint(-4F, 23F, -3.5F);
      FootAngle1.setTextureSize(512, 512);
      FootAngle1.mirror = true;
      setRotation(FootAngle1, 0.1047198F, 0F, 0F);
      Neck = new ModelRenderer(this, 100, 26);
      Neck.addBox(0F, 0F, 0F, 1, 2, 1);
      Neck.setRotationPoint(-0.5F, -7F, 0.5F);
      Neck.setTextureSize(512, 512);
      Neck.mirror = true;
      setRotation(Neck, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 100, 10);
      Head.addBox(0F, 0F, 0F, 6, 6, 4);
      Head.setRotationPoint(-3F, -13F, -1F);
      Head.setTextureSize(512, 512);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Mouth = new ModelRenderer(this, 77, 43);
      Mouth.addBox(0F, 0F, 0F, 2, 1, 1);
      Mouth.setRotationPoint(-1F, -7.95F, -1.05F);
      Mouth.setTextureSize(512, 512);
      Mouth.mirror = true;
      setRotation(Mouth, 0.7853982F, 0F, 0F);
      GlassesTop = new ModelRenderer(this, 8, 31);
      GlassesTop.addBox(0F, 0F, 0F, 6, 2, 1);
      GlassesTop.setRotationPoint(-3F, -12F, -1.5F);
      GlassesTop.setTextureSize(512, 512);
      GlassesTop.mirror = true;
      setRotation(GlassesTop, 0F, 0F, 0F);
      GlassesMid = new ModelRenderer(this, 8, 31);
      GlassesMid.addBox(0F, 0F, 0F, 5, 2, 1);
      GlassesMid.setRotationPoint(-2.5F, -11.5F, -1.5F);
      GlassesMid.setTextureSize(512, 512);
      GlassesMid.mirror = true;
      setRotation(GlassesMid, 0F, 0F, 0F);
      GlassesBottom1 = new ModelRenderer(this, 8, 31);
      GlassesBottom1.addBox(0F, 0F, 0F, 1, 1, 1);
      GlassesBottom1.setRotationPoint(-2F, -9.7F, -1.5F);
      GlassesBottom1.setTextureSize(512, 512);
      GlassesBottom1.mirror = true;
      setRotation(GlassesBottom1, 0F, 0F, 0F);
      GlassesBottom2 = new ModelRenderer(this, 8, 31);
      GlassesBottom2.addBox(0F, 0F, 0F, 1, 1, 1);
      GlassesBottom2.setRotationPoint(1F, -9.7F, -1.5F);
      GlassesBottom2.setTextureSize(512, 512);
      GlassesBottom2.mirror = true;
      setRotation(GlassesBottom2, 0F, 0F, 0F);
      Hair1 = new ModelRenderer(this, 17, 60);
      Hair1.addBox(0F, 0F, 0F, 12, 3, 8);
      Hair1.setRotationPoint(-6F, -15F, -2F);
      Hair1.setTextureSize(512, 512);
      Hair1.mirror = true;
      setRotation(Hair1, 0F, 0F, 0F);
      HairTop1 = new ModelRenderer(this, 24, 60);
      HairTop1.addBox(0F, 0F, 0F, 11, 1, 8);
      HairTop1.setRotationPoint(-5.5F, -16F, -2F);
      HairTop1.setTextureSize(512, 512);
      HairTop1.mirror = true;
      setRotation(HairTop1, 0F, 0F, 0F);
      HairTop2 = new ModelRenderer(this, 18, 60);
      HairTop2.addBox(0F, 0F, 0F, 10, 1, 7);
      HairTop2.setRotationPoint(-5F, -16.7F, -1.5F);
      HairTop2.setTextureSize(512, 512);
      HairTop2.mirror = true;
      setRotation(HairTop2, 0F, 0F, 0F);
      Hair2 = new ModelRenderer(this, 17, 60);
      Hair2.addBox(0F, 0F, 0F, 2, 1, 8);
      Hair2.setRotationPoint(3F, -12F, -2F);
      Hair2.setTextureSize(512, 512);
      Hair2.mirror = true;
      setRotation(Hair2, 0F, 0F, 0F);
      Hair3 = new ModelRenderer(this, 17, 60);
      Hair3.addBox(0F, 0F, 0F, 2, 1, 8);
      Hair3.setRotationPoint(3.5F, -12F, -2F);
      Hair3.setTextureSize(512, 512);
      Hair3.mirror = true;
      setRotation(Hair3, 0F, 0F, 0F);
      Hair4 = new ModelRenderer(this, 17, 60);
      Hair4.addBox(0F, 0F, 0F, 3, 4, 8);
      Hair4.setRotationPoint(3F, -11F, -2F);
      Hair4.setTextureSize(512, 512);
      Hair4.mirror = true;
      setRotation(Hair4, 0F, 0F, 0F);
      Hair5 = new ModelRenderer(this, 17, 60);
      Hair5.addBox(0F, 0F, 0F, 3, 4, 8);
      Hair5.setRotationPoint(-6F, -11F, -2F);
      Hair5.setTextureSize(512, 512);
      Hair5.mirror = true;
      setRotation(Hair5, 0F, 0F, 0F);
      Hair6 = new ModelRenderer(this, 17, 60);
      Hair6.addBox(0F, 0F, 0F, 2, 1, 8);
      Hair6.setRotationPoint(-5F, -12F, -2F);
      Hair6.setTextureSize(512, 512);
      Hair6.mirror = true;
      setRotation(Hair6, 0F, 0F, 0F);
      Hair7 = new ModelRenderer(this, 17, 60);
      Hair7.addBox(0F, 0F, 0F, 2, 1, 8);
      Hair7.setRotationPoint(-5.5F, -12F, -2F);
      Hair7.setTextureSize(512, 512);
      Hair7.mirror = true;
      setRotation(Hair7, 0F, 0F, 0F);
      Hair8 = new ModelRenderer(this, 17, 60);
      Hair8.addBox(0F, 0F, 0F, 2, 1, 8);
      Hair8.setRotationPoint(3F, -7.5F, -2F);
      Hair8.setTextureSize(512, 512);
      Hair8.mirror = true;
      setRotation(Hair8, 0F, 0F, 0F);
      Hair9 = new ModelRenderer(this, 17, 60);
      Hair9.addBox(0F, 0F, 0F, 2, 1, 8);
      Hair9.setRotationPoint(-5F, -7.5F, -2F);
      Hair9.setTextureSize(512, 512);
      Hair9.mirror = true;
      setRotation(Hair9, 0F, 0F, 0F);
      HairBack = new ModelRenderer(this, 17, 60);
      HairBack.addBox(0F, 0F, 0F, 10, 5, 3);
      HairBack.setRotationPoint(-5F, -12F, 3F);
      HairBack.setTextureSize(512, 512);
      HairBack.mirror = true;
      setRotation(HairBack, 0F, 0F, 0F);
      TorsoFront = new ModelRenderer(this, 130, 31);
      TorsoFront.addBox(0F, 0F, 0F, 6, 5, 1);
      TorsoFront.setRotationPoint(-3F, -5F, -1.5F);
      TorsoFront.setTextureSize(512, 512);
      TorsoFront.mirror = true;
      setRotation(TorsoFront, 0F, 0F, 0F);
      TorsoBack = new ModelRenderer(this, 115, 31);
      TorsoBack.addBox(0F, 0F, 0F, 6, 5, 1);
      TorsoBack.setRotationPoint(3F, -5F, 4.5F);
      TorsoBack.setTextureSize(512, 512);
      TorsoBack.mirror = true;
      setRotation(TorsoBack, 0F, 3.141593F, 0F);
      TorsoSide1 = new ModelRenderer(this, 150, 31);
      TorsoSide1.addBox(0F, 0F, 0F, 5, 5, 1);
      TorsoSide1.setRotationPoint(-3.5F, -5F, 4F);
      TorsoSide1.setTextureSize(512, 512);
      TorsoSide1.mirror = true;
      setRotation(TorsoSide1, 0F, 1.570796F, 0F);
      TorsoSide2 = new ModelRenderer(this, 171, 31);
      TorsoSide2.addBox(0F, 0F, 0F, 5, 5, 1);
      TorsoSide2.setRotationPoint(2.5F, -5F, 4F);
      TorsoSide2.setTextureSize(512, 512);
      TorsoSide2.mirror = true;
      setRotation(TorsoSide2, 0F, 1.570796F, 0F);
      TorsoTop = new ModelRenderer(this, 187, 31);
      TorsoTop.addBox(0F, 0F, 0F, 6, 5, 1);
      TorsoTop.setRotationPoint(-3F, -5.5F, 4F);
      TorsoTop.setTextureSize(512, 512);
      TorsoTop.mirror = true;
      setRotation(TorsoTop, -1.570796F, 0F, 0F);
      TorsoBottom = new ModelRenderer(this, 207, 31);
      TorsoBottom.addBox(2F, 0F, 0F, 6, 5, 1);
      TorsoBottom.setRotationPoint(-5F, 0.5F, -1F);
      TorsoBottom.setTextureSize(512, 512);
      TorsoBottom.mirror = true;
      setRotation(TorsoBottom, 1.570796F, 0F, 0F);
      ArmCover2 = new ModelRenderer(this, 118, 39);
      ArmCover2.addBox(0F, 0F, 0F, 4, 3, 4);
      ArmCover2.setRotationPoint(3F, -4.9F, -0.5F);
      ArmCover2.setTextureSize(512, 512);
      ArmCover2.mirror = true;
      setRotation(ArmCover2, 0F, 0F, 0F);
      ArmCover1 = new ModelRenderer(this, 118, 39);
      ArmCover1.addBox(0F, 0F, 0F, 4, 3, 4);
      ArmCover1.setRotationPoint(-7F, -4.9F, -0.5F);
      ArmCover1.setTextureSize(512, 512);
      ArmCover1.mirror = true;
      setRotation(ArmCover1, 0F, 0F, 0F);
      WaistFront = new ModelRenderer(this, 135, 49);
      WaistFront.addBox(0F, 0F, 0F, 4, 3, 1);
      WaistFront.setRotationPoint(-2F, 0.5F, -0.5F);
      WaistFront.setTextureSize(512, 512);
      WaistFront.mirror = true;
      setRotation(WaistFront, 0F, 0F, 0F);
      WaistSide2 = new ModelRenderer(this, 145, 49);
      WaistSide2.addBox(0F, 0F, 0F, 3, 3, 1);
      WaistSide2.setRotationPoint(2.5F, 0.5F, 0F);
      WaistSide2.setTextureSize(512, 512);
      WaistSide2.mirror = true;
      setRotation(WaistSide2, 0F, -1.570796F, 0F);
      WaistBack = new ModelRenderer(this, 158, 49);
      WaistBack.addBox(0F, 0F, 0F, 4, 3, 1);
      WaistBack.setRotationPoint(2F, 0.5F, 3.5F);
      WaistBack.setTextureSize(512, 512);
      WaistBack.mirror = true;
      setRotation(WaistBack, 0F, -3.141593F, 0F);
      WaistSide1 = new ModelRenderer(this, 163, 49);
      WaistSide1.addBox(0F, 0F, 0F, 3, 3, 1);
      WaistSide1.setRotationPoint(-1.5F, 0.5F, 0F);
      WaistSide1.setTextureSize(512, 512);
      WaistSide1.mirror = true;
      setRotation(WaistSide1, 0F, -1.570796F, 0F);
      LegBlueThigh1 = new ModelRenderer(this, 156, 66);
      LegBlueThigh1.addBox(0F, 0F, 0F, 3, 3, 5);
      LegBlueThigh1.setRotationPoint(-3F, 3F, -1F);
      LegBlueThigh1.setTextureSize(512, 512);
      LegBlueThigh1.mirror = true;
      setRotation(LegBlueThigh1, 0F, 0F, 0F);
      LegBlueThigh2 = new ModelRenderer(this, 156, 66);
      LegBlueThigh2.addBox(0F, 0F, 0F, 2, 1, 4);
      LegBlueThigh2.setRotationPoint(-4.5F, 3.5F, -0.5F);
      LegBlueThigh2.setTextureSize(512, 512);
      LegBlueThigh2.mirror = true;
      setRotation(LegBlueThigh2, 0F, 0F, 0F);
      LegBlueThigh3 = new ModelRenderer(this, 156, 66);
      LegBlueThigh3.addBox(0F, 0F, 0F, 1, 1, 5);
      LegBlueThigh3.setRotationPoint(-4F, 4F, -1F);
      LegBlueThigh3.setTextureSize(512, 512);
      LegBlueThigh3.mirror = true;
      setRotation(LegBlueThigh3, 0F, 0F, 0F);
      LegBlueThigh4 = new ModelRenderer(this, 156, 66);
      LegBlueThigh4.addBox(0F, 0F, 0F, 1, 1, 4);
      LegBlueThigh4.setRotationPoint(-5.5F, 4F, -0.5F);
      LegBlueThigh4.setTextureSize(512, 512);
      LegBlueThigh4.mirror = true;
      setRotation(LegBlueThigh4, 0F, 0F, 0F);
      LegBlueThigh5 = new ModelRenderer(this, 156, 66);
      LegBlueThigh5.addBox(0F, 0F, 0F, 1, 5, 5);
      LegBlueThigh5.setRotationPoint(-5.5F, 5F, -1F);
      LegBlueThigh5.setTextureSize(512, 512);
      LegBlueThigh5.mirror = true;
      setRotation(LegBlueThigh5, 0F, 0F, 0F);
      LegBlueThigh6 = new ModelRenderer(this, 156, 66);
      LegBlueThigh6.addBox(0F, 0F, 0F, 3, 8, 5);
      LegBlueThigh6.setRotationPoint(-4.5F, 4F, -1F);
      LegBlueThigh6.setTextureSize(512, 512);
      LegBlueThigh6.mirror = true;
      setRotation(LegBlueThigh6, 0F, 0F, 0F);
      LegBlueThigh7 = new ModelRenderer(this, 156, 66);
      LegBlueThigh7.addBox(0F, 0F, 0F, 1, 1, 4);
      LegBlueThigh7.setRotationPoint(-5.5F, 10F, -0.5F);
      LegBlueThigh7.setTextureSize(512, 512);
      LegBlueThigh7.mirror = true;
      setRotation(LegBlueThigh7, 0F, 0F, 0F);
      LegBlueThigh8 = new ModelRenderer(this, 156, 66);
      LegBlueThigh8.addBox(0F, 0F, 0F, 1, 1, 4);
      LegBlueThigh8.setRotationPoint(-1.5F, 10F, -0.5F);
      LegBlueThigh8.setTextureSize(512, 512);
      LegBlueThigh8.mirror = true;
      setRotation(LegBlueThigh8, 0F, 0F, 0F);
      LegBlueThigh9 = new ModelRenderer(this, 156, 66);
      LegBlueThigh9.addBox(0F, 0F, 0F, 1, 5, 5);
      LegBlueThigh9.setRotationPoint(-1.5F, 5F, -1F);
      LegBlueThigh9.setTextureSize(512, 512);
      LegBlueThigh9.mirror = true;
      setRotation(LegBlueThigh9, 0F, 0F, 0F);
      LegRedThigh1 = new ModelRenderer(this, 212, 66);
      LegRedThigh1.addBox(0F, 0F, 0F, 3, 3, 5);
      LegRedThigh1.setRotationPoint(0F, 3F, -1F);
      LegRedThigh1.setTextureSize(512, 512);
      LegRedThigh1.mirror = true;
      setRotation(LegRedThigh1, 0F, 0F, 0F);
      LegRedThigh2 = new ModelRenderer(this, 203, 66);
      LegRedThigh2.addBox(0F, 0F, 0F, 2, 1, 4);
      LegRedThigh2.setRotationPoint(2.5F, 3.5F, -0.5F);
      LegRedThigh2.setTextureSize(512, 512);
      LegRedThigh2.mirror = true;
      setRotation(LegRedThigh2, 0F, 0F, 0F);
      LegRedThigh3 = new ModelRenderer(this, 214, 66);
      LegRedThigh3.addBox(0F, 0F, 0F, 3, 8, 5);
      LegRedThigh3.setRotationPoint(1.5F, 4F, -1F);
      LegRedThigh3.setTextureSize(512, 512);
      LegRedThigh3.mirror = true;
      setRotation(LegRedThigh3, 0F, 0F, 0F);
      LegRedThigh4 = new ModelRenderer(this, 216, 66);
      LegRedThigh4.addBox(0F, 0F, 0F, 1, 1, 4);
      LegRedThigh4.setRotationPoint(0.5F, 10F, -0.5F);
      LegRedThigh4.setTextureSize(512, 512);
      LegRedThigh4.mirror = true;
      setRotation(LegRedThigh4, 0F, 0F, 0F);
      LegRedThigh5 = new ModelRenderer(this, 213, 66);
      LegRedThigh5.addBox(0F, 0F, 0F, 1, 5, 5);
      LegRedThigh5.setRotationPoint(0.5F, 5F, -1F);
      LegRedThigh5.setTextureSize(512, 512);
      LegRedThigh5.mirror = true;
      setRotation(LegRedThigh5, 0F, 0F, 0F);
      LegRedThigh6 = new ModelRenderer(this, 220, 66);
      LegRedThigh6.addBox(0F, 0F, 0F, 1, 5, 5);
      LegRedThigh6.setRotationPoint(4.5F, 5F, -1F);
      LegRedThigh6.setTextureSize(512, 512);
      LegRedThigh6.mirror = true;
      setRotation(LegRedThigh6, 0F, 0F, 0F);
      LegRedThigh7 = new ModelRenderer(this, 215, 66);
      LegRedThigh7.addBox(0F, 0F, 0F, 1, 1, 4);
      LegRedThigh7.setRotationPoint(4.5F, 4F, -0.5F);
      LegRedThigh7.setTextureSize(512, 512);
      LegRedThigh7.mirror = true;
      setRotation(LegRedThigh7, 0F, 0F, 0F);
      LegRedThigh8 = new ModelRenderer(this, 227, 66);
      LegRedThigh8.addBox(0F, 0F, 0F, 1, 1, 4);
      LegRedThigh8.setRotationPoint(4.5F, 10F, -0.5F);
      LegRedThigh8.setTextureSize(512, 512);
      LegRedThigh8.mirror = true;
      setRotation(LegRedThigh8, 0F, 0F, 0F);
      LegRed = new ModelRenderer(this, 263, 73);
      LegRed.addBox(0F, 0F, 0F, 2, 7, 4);
      LegRed.setRotationPoint(2F, 13F, -0.5F);
      LegRed.setTextureSize(512, 512);
      LegRed.mirror = true;
      setRotation(LegRed, 0F, 0F, 0F);
      LegRedTop = new ModelRenderer(this, 265, 73);
      LegRedTop.addBox(0F, 0F, 0F, 2, 3, 3);
      LegRedTop.setRotationPoint(2F, 12F, -0.5F);
      LegRedTop.setTextureSize(512, 512);
      LegRedTop.mirror = true;
      setRotation(LegRedTop, 0F, 0F, 0F);
      LegRedBottom = new ModelRenderer(this, 246, 145);
      LegRedBottom.addBox(0F, 1F, 0F, 2, 4, 4);
      LegRedBottom.setRotationPoint(2F, 19F, -0.5F);
      LegRedBottom.setTextureSize(512, 512);
      LegRedBottom.mirror = true;
      setRotation(LegRedBottom, 0F, 0F, 0F);
      LegBlueBottom = new ModelRenderer(this, 220, 145);
      LegBlueBottom.addBox(0F, 0F, 0F, 2, 4, 4);
      LegBlueBottom.setRotationPoint(-4F, 20F, -0.5F);
      LegBlueBottom.setTextureSize(512, 512);
      LegBlueBottom.mirror = true;
      setRotation(LegBlueBottom, 0F, 0F, 0F);
      LegBlue = new ModelRenderer(this, 191, 73);
      LegBlue.addBox(0F, 0F, 0F, 2, 7, 4);
      LegBlue.setRotationPoint(-4F, 13F, -0.5F);
      LegBlue.setTextureSize(512, 512);
      LegBlue.mirror = true;
      setRotation(LegBlue, 0F, 0F, 0F);
      LegBlueTop = new ModelRenderer(this, 182, 73);
      LegBlueTop.addBox(0F, 0F, 0F, 2, 3, 3);
      LegBlueTop.setRotationPoint(-4F, 12F, -0.5F);
      LegBlueTop.setTextureSize(512, 512);
      LegBlueTop.mirror = true;
      setRotation(LegBlueTop, 0F, 0F, 0F);
      Arm1 = new ModelRenderer(this, 133, 129);
      Arm1.addBox(0F, 0F, 0F, 2, 12, 2);
      Arm1.setRotationPoint(-6F, -2.5F, 0.5F);
      Arm1.setTextureSize(512, 512);
      Arm1.mirror = true;
      setRotation(Arm1, 0F, 0F, 0.2617994F);
      Arm2 = new ModelRenderer(this, 145, 129);
      Arm2.addBox(0F, 0F, 0F, 2, 12, 2);
      Arm2.setRotationPoint(4F, -2F, 0.5F);
      Arm2.setTextureSize(512, 512);
      Arm2.mirror = true;
      setRotation(Arm2, 0F, 0F, -0.2617994F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Foot2.render(f5);
    Foot1.render(f5);
    Toe1.render(f5);
    Toe2.render(f5);
    FootAngle2.render(f5);
    FootAngle1.render(f5);
    Neck.render(f5);
    Head.render(f5);
    Mouth.render(f5);
    GlassesTop.render(f5);
    GlassesMid.render(f5);
    GlassesBottom1.render(f5);
    GlassesBottom2.render(f5);
    Hair1.render(f5);
    HairTop1.render(f5);
    HairTop2.render(f5);
    Hair2.render(f5);
    Hair3.render(f5);
    Hair4.render(f5);
    Hair5.render(f5);
    Hair6.render(f5);
    Hair7.render(f5);
    Hair8.render(f5);
    Hair9.render(f5);
    HairBack.render(f5);
    TorsoFront.render(f5);
    TorsoBack.render(f5);
    TorsoSide1.render(f5);
    TorsoSide2.render(f5);
    TorsoTop.render(f5);
    TorsoBottom.render(f5);
    ArmCover2.render(f5);
    ArmCover1.render(f5);
    WaistFront.render(f5);
    WaistSide2.render(f5);
    WaistBack.render(f5);
    WaistSide1.render(f5);
    LegBlueThigh1.render(f5);
    LegBlueThigh2.render(f5);
    LegBlueThigh3.render(f5);
    LegBlueThigh4.render(f5);
    LegBlueThigh5.render(f5);
    LegBlueThigh6.render(f5);
    LegBlueThigh7.render(f5);
    LegBlueThigh8.render(f5);
    LegBlueThigh9.render(f5);
    LegRedThigh1.render(f5);
    LegRedThigh2.render(f5);
    LegRedThigh3.render(f5);
    LegRedThigh4.render(f5);
    LegRedThigh5.render(f5);
    LegRedThigh6.render(f5);
    LegRedThigh7.render(f5);
    LegRedThigh8.render(f5);
    LegRed.render(f5);
    LegRedTop.render(f5);
    LegRedBottom.render(f5);
    LegBlueBottom.render(f5);
    LegBlue.render(f5);
    LegBlueTop.render(f5);
    Arm1.render(f5);
    Arm2.render(f5);
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
