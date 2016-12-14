// Date: 9/23/2016 7:30:04 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package com.tayloristic.nokamod.entities.Goat;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelGoat extends ModelBase {
  //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer ear1;
    ModelRenderer ear2;
    ModelRenderer horn2;
    ModelRenderer horn1;
    ModelRenderer hornmid1;
    ModelRenderer hornmid2;
    ModelRenderer horntop1;
    ModelRenderer horntop2;
    ModelRenderer tail;
  
  public ModelGoat() {
	  	textureWidth = 512;
	    textureHeight = 256;
    
	      head = new ModelRenderer(this, 64, 64);
	      head.addBox(-3F, -4F, -5F, 6, 6, 5);
	      head.setRotationPoint(-1F, 10F, -8F);
	      head.setTextureSize(textureWidth, textureHeight);
	    //  head.mirror = true;
	      setRotation(head, 0F, 0F, 0F);
	      body = new ModelRenderer(this, 69, 14);
	      body.addBox(-6F, -13F, -7F, 10, 16, 8);
	      body.setRotationPoint(0F, 10F, 4F);
	      body.setTextureSize(textureWidth, textureHeight);
	      body.mirror = true;
	      setRotation(body, 1.570796F, 0F, 0F);
	      leg1 = new ModelRenderer(this, 36, 16);
	      leg1.addBox(-3F, 0F, -2F, 2, 8, 2);
	      leg1.setRotationPoint(-3F, 16F, 7F);
	      leg1.setTextureSize(textureWidth, textureHeight);
	      leg1.mirror = true;
	      setRotation(leg1, 0F, 0F, 0F);
	      leg2 = new ModelRenderer(this, 0, 16);
	      leg2.addBox(-1F, 0F, -2F, 2, 8, 2);
	      leg2.setRotationPoint(3F, 16F, 7F);
	      leg2.setTextureSize(textureWidth, textureHeight);
	      leg2.mirror = true;
	      setRotation(leg2, 0F, 0F, 0F);
	      leg3 = new ModelRenderer(this, 12, 16);
	      leg3.addBox(-3F, 0F, -3F, 2, 8, 2);
	      leg3.setRotationPoint(-3F, 16F, -5F);
	      leg3.setTextureSize(textureWidth, textureHeight);
	      leg3.mirror = true;
	      setRotation(leg3, 0F, 0F, 0F);
	      leg4 = new ModelRenderer(this, 24, 16);
	      leg4.addBox(-1F, 0F, -3F, 2, 8, 2);
	      leg4.setRotationPoint(3F, 16F, -5F);
	      leg4.setTextureSize(textureWidth, textureHeight);
	      leg4.mirror = true;
	      setRotation(leg4, 0F, 0F, 0F);
	      ear1 = new ModelRenderer(this, 1, 6);
	      ear1.addBox(3F, -15F, 4F, 1, 2, 1);
	      // addBox(offX, offY, offZ, width, height, depth)
	      ear1.setRotationPoint(-1F, 10F, -8F);
	      ear1.setTextureSize(textureWidth, textureHeight);
	      ear1.mirror = true;
	      setRotation(ear1, 0F, 0F, -0.3490659F);
	      ear2 = new ModelRenderer(this, 1, 0);
	      ear2.addBox(3F, -6F, -4F, 1, 2, 1);
	      ear2.setRotationPoint(-1F, 10F, -8F);
	      ear2.setTextureSize(textureWidth, textureHeight);
	      ear2.mirror = true;
	      setRotation(ear2, 0F, 0F, 0.3490659F);
	      horn2 = new ModelRenderer(this, 15, 4);
	      horn2.addBox(1F, -7F, -3F, 1, 2, 1);
	      horn2.setRotationPoint(-1F, 11F, -8F);
	      horn2.setTextureSize(textureWidth, textureHeight);
	      horn2.mirror = true;
	      setRotation(horn2, 0F, 0F, 0F);
	      horn1 = new ModelRenderer(this, 15, 0);
	      horn1.addBox(-2F, -6F, -3F, 1, 2, 1);
	      horn1.setRotationPoint(-1F, 10F, -8F);
	      horn1.setTextureSize(textureWidth, textureHeight);
	      horn1.mirror = true;
	      setRotation(horn1, 0F, 0F, 0F);
	      hornmid1 = new ModelRenderer(this, 22, 0);
	      hornmid1.addBox(-2F, -7F, -2F, 1, 2, 1);
	      hornmid1.setRotationPoint(-1F, 10F, -8F);
	      hornmid1.setTextureSize(textureWidth, textureHeight);
	      hornmid1.mirror = true;
	      setRotation(hornmid1, 0F, 0F, 0F);
	      hornmid2 = new ModelRenderer(this, 28, 4);
	      hornmid2.addBox(1F, -7F, -2F, 1, 2, 1);
	      hornmid2.setRotationPoint(-1F, 10F, -8F);
	      hornmid2.setTextureSize(textureWidth, textureHeight);
	      hornmid2.mirror = true;
	      setRotation(hornmid2, 0F, 0F, 0F);
	      horntop1 = new ModelRenderer(this, 29, 0);
	      horntop1.addBox(-2F, -8F, -1F, 1, 2, 1);
	      horntop1.setRotationPoint(-1F, 10F, -8F);
	      horntop1.setTextureSize(textureWidth, textureHeight);
	      horntop1.mirror = true;
	      setRotation(horntop1, 0F, 0F, 0F);
	      horntop2 = new ModelRenderer(this, 22, 4);
	      horntop2.addBox(1F, -8F, -1F, 1, 2, 1);
	      horntop2.setRotationPoint(-1F, 10F, -8F);
	      horntop2.setTextureSize(textureWidth, textureHeight);
	      horntop2.mirror = true;
	      setRotation(horntop2, 0F, 0F, 0F);
	      tail = new ModelRenderer(this, 52, 0);
	      tail.addBox(-1F, -1F, 0F, 2, 1, 3);
	      tail.setRotationPoint(-1F, 12F, 7F);
	      tail.setTextureSize(textureWidth, textureHeight);
	      tail.mirror = true;
	      setRotation(tail, 0F, 0F, 0F);
	      
	      head.addChild(ear1);
	  //    head.addChild(ear2);

  }
  
      
  public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor)  {
	  super.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
	  setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);
	  head.render(scaleFactor);
	  body.render(scaleFactor);
	  leg1.render(scaleFactor);
	  leg2.render(scaleFactor);
	  leg3.render(scaleFactor);
	  leg4.render(scaleFactor);
	 // ear1.render(scaleFactor);
	 // ear2.render(scaleFactor);
	  horn2.render(scaleFactor);
	  horn1.render(scaleFactor);
      hornmid1.render(scaleFactor);
      hornmid2.render(scaleFactor);
      horntop1.render(scaleFactor);
      horntop2.render(scaleFactor);
      tail.render(scaleFactor);		
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
	    model.rotateAngleX = x;
	    model.rotateAngleY = y;
	    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
	  super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);
	  this.head.rotateAngleX = headPitch * 0.017453292F;
	  this.head.rotateAngleY = netHeadYaw * 0.017453292F;
	  
	  this.tail.rotateAngleX = headPitch * 0.017453292F;
	  
	  this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
      this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
      this.leg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
      this.leg4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
  }
  
}
