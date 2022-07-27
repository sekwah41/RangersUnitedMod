package net.hero61.rangersunitedmod.client.models.armor.mightymorphin;
// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.sekwah.sekclib.util.ModelUtils;
import net.hero61.rangersunitedmod.RangersUnitedMod;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;

public class ModelMightyMorphinRed<T extends LivingEntity> extends HumanoidModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(RangersUnitedMod.MOD_ID, "redmightymorphin"), "main");

	public ModelMightyMorphinRed(ModelPart modelPart) {
		super(modelPart);

	}

	public static LayerDefinition createLayer() {
		//MeshDefinition definition = new MeshDefinition();
		MeshDefinition definition = ModelUtils.createBlankHumanoidMesh();
		PartDefinition root = definition.getRoot();

		PartDefinition Head = root.addOrReplaceChild("Head",
				CubeListBuilder.create()
						.texOffs(0, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.ZERO);

		Head.addOrReplaceChild("MouthFix3",
				CubeListBuilder.create()
						.texOffs(86, 90)
						.addBox(0.7F, -2.5F, -4.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		 Head.addOrReplaceChild("Goggles1",
				 CubeListBuilder.create()
						 .texOffs(0, 70)
						 .addBox(1.08F, -2.2F, -4.54F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				 PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, -0.4363F));

		 Head.addOrReplaceChild("Goggles7",
				 CubeListBuilder.create()
						 .texOffs(90, 40)
						 .addBox(-3.29F, -6.34F, -2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				 PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.1745F));

		 Head.addOrReplaceChild("HeadBit5",
				 CubeListBuilder.create()
						 .texOffs(18, 90)
						 .addBox(-1.5F, -8.2F, 3.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				 PartPose.offset(0.0F, 0.0F, 0.0F));

		  Head.addOrReplaceChild("Mouth8",
				  CubeListBuilder.create()
						  .texOffs(90, 90)
						  .addBox(-0.55F, -2.05F, -4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				  PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));

		  Head.addOrReplaceChild("Goggles13",
				  CubeListBuilder.create()
						  .texOffs(0, 70)
						  .addBox(-2.85F, -6.0F, -2.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				  PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.1745F));

		  Head.addOrReplaceChild("Goggles15",
				  CubeListBuilder.create()
						  .texOffs(90, 40).mirror()
						  .addBox(2.29F, -6.34F, -2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				  PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, -0.1745F));

		  Head.addOrReplaceChild("Goggles21",
				  CubeListBuilder.create()
						  .texOffs(90, 50).mirror()
						  .addBox(0.94F, -7.33F, -2.34F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				  PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.2618F));

		  Head.addOrReplaceChild("MouthFix5",
				  CubeListBuilder.create()
						  .texOffs(86, 90)
						  .addBox(-1.0F, -1.4F, -4.05F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				  PartPose.offset(0.0F, 0.0F, 0.0F));

		  Head.addOrReplaceChild("MouthFix2",
				  CubeListBuilder.create()
						  .texOffs(87, 90)
						  .addBox(-0.65F, -2.17F, -4.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				  PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5585F));


		  Head.addOrReplaceChild("Goggles4",
				  CubeListBuilder.create()
						  .texOffs(120, 70)
						  .addBox(-5.39F, -0.83F, -4.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				  PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.6981F));


		  Head.addOrReplaceChild("Mouth9",
				  CubeListBuilder.create()
						  .texOffs(90, 90)
						  .addBox(-0.45F, -2.05F, -4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				  PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5236F));

		  Head.addOrReplaceChild("MouthFix1",
				  CubeListBuilder.create()
						  .texOffs(86, 90)
						  .addBox(-1.7F, -2.5F, -4.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				  PartPose.offset(0.0F, 0.0F, 0.0F));

		 Head.addOrReplaceChild("Goggles3",
				 CubeListBuilder.create()
						 .texOffs(100, 70)
						 .addBox(-4.0F, -1.9F, -4.54F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				 PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.4363F));

		 Head.addOrReplaceChild("Eye1",
				 CubeListBuilder.create()
						 .texOffs(130, 50)
						 .addBox(-4.5F, -7.8F, -2.18F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				 PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.1745F));

		 Head.addOrReplaceChild("Goggles31",
				 CubeListBuilder.create()
						 .texOffs(120, 60).mirror()
						 .addBox(4.22F, -5.13F, -2.88F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				 PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, -0.0873F));

		  Head.addOrReplaceChild("Goggles30",
				  CubeListBuilder.create()
						  .texOffs(80, 40).mirror()
						  .addBox(2.63F, -6.34F, -2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				  PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, -0.1745F));

		  Head.addOrReplaceChild("MouthFix6",
				  CubeListBuilder.create()
						  .texOffs(87, 90)
						  .addBox(-0.65F, -1.87F, -4.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				  PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5585F));

		 Head.addOrReplaceChild("HeadBit3",
				 CubeListBuilder.create()
						 .texOffs(15, 80)
						 .addBox(-3.0F, -8.35F, -2.5F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				 PartPose.offset(0.0F, 0.0F, 0.0F));

		Head.addOrReplaceChild("Goggles28",
				CubeListBuilder.create()
						.texOffs(80, 40)
						.addBox(-3.63F, -6.34F, -2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.1745F));

		 Head.addOrReplaceChild("Goggles10",
				 CubeListBuilder.create()
						 .texOffs(120, 70).mirror()
						 .addBox(4.39F, -0.83F, -4.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				 PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, -0.6981F));

		 Head.addOrReplaceChild("Goggles5",
				 CubeListBuilder.create()
						 .texOffs(110, 60)
						 .addBox(-5.21F, -5.33F, -2.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				 PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0873F));

		 Head.addOrReplaceChild("HeadBit2",
				 CubeListBuilder.create()
						 .texOffs(24, 66)
						 .addBox(-1.0F, -7.65F, -4.55F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				 PartPose.offset(0.0F, 0.0F, 0.0F));

		 Head.addOrReplaceChild("Mouth2", CubeListBuilder.create().texOffs(90, 90).addBox(-1.5F, -2.5F, -4.12F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		Head.addOrReplaceChild("Goggles25", CubeListBuilder.create().texOffs(125, 70).addBox(-5.89F, -0.83F, -4.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.6981F));

		  Head.addOrReplaceChild("MouthFix4", CubeListBuilder.create().texOffs(87, 90).addBox(-0.35F, -2.17F, -4.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5585F));

		  Head.addOrReplaceChild("MouthFix7", CubeListBuilder.create().texOffs(87, 90).addBox(-0.35F, -1.87F, -4.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5585F));

		  Head.addOrReplaceChild("Goggles26", CubeListBuilder.create().texOffs(125, 70).mirror().addBox(4.89F, -0.83F, -4.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, -0.6981F));

		  Head.addOrReplaceChild("Goggles29", CubeListBuilder.create().texOffs(120, 60).addBox(-5.22F, -5.13F, -2.88F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0873F));

		   Head.addOrReplaceChild("Goggles20", CubeListBuilder.create().texOffs(90, 50).addBox(-1.94F, -7.33F, -2.34F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, -0.2618F));

		  Head.addOrReplaceChild("HeadBit6", CubeListBuilder.create().texOffs(18, 80).addBox(3.18F, -6.0F, -3.89F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		 Head.addOrReplaceChild("Mouth6", CubeListBuilder.create().texOffs(90, 90).addBox(-1.0F, -4.35F, -1.65F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.8727F, 0.0F, 0.0F));

		 Head.addOrReplaceChild("Goggles24", CubeListBuilder.create().texOffs(100, 50).addBox(-2.27F, -7.33F, -2.34F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, -0.2618F));

		  Head.addOrReplaceChild("Goggles22", CubeListBuilder.create().texOffs(110, 60).addBox(4.21F, -5.33F, -2.87F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, -0.0873F));

		 Head.addOrReplaceChild("HeadBit1", CubeListBuilder.create().texOffs(18, 90).addBox(-1.5F, -8.2F, -4.3F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		  Head.addOrReplaceChild("Goggles2", CubeListBuilder.create().texOffs(0, 70).addBox(-3.08F, -2.2F, -4.54F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.4363F));

		  Head.addOrReplaceChild("Goggles27", CubeListBuilder.create().texOffs(100, 50).mirror().addBox(1.27F, -7.33F, -2.34F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.2618F));

		 Head.addOrReplaceChild("Mouth7", CubeListBuilder.create().texOffs(90, 90).addBox(-1.0F, -1.64F, -4.12F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		  Head.addOrReplaceChild("Eye2", CubeListBuilder.create().texOffs(130, 50).addBox(3.5F, -7.8F, -2.18F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, -0.1745F));

		  Head.addOrReplaceChild("Goggles8", CubeListBuilder.create().texOffs(100, 70).mirror().addBox(3.0F, -1.9F, -4.54F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, -0.4363F));

		  Head.addOrReplaceChild("HeadBit4", CubeListBuilder.create().texOffs(18, 80).addBox(-4.18F, -6.0F, -3.89F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		  Head.addOrReplaceChild("Goggles16", CubeListBuilder.create().texOffs(0, 70).addBox(0.85F, -6.0F, -2.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, -0.1745F));

		PartDefinition Body = root.addOrReplaceChild("Body",
				CubeListBuilder.create()
						.texOffs(16, 16)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.ZERO);

		  Body.addOrReplaceChild("WhiteD5", CubeListBuilder.create().texOffs(0, 80).addBox(4.42F, 6.1F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.6109F));

		Body.addOrReplaceChild("WhiteD4", CubeListBuilder.create().texOffs(0, 80).addBox(-5.42F, 1.5F, -0.75F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.6109F));

		 Body.addOrReplaceChild("WhiteD8", CubeListBuilder.create().texOffs(0, 80).addBox(2.2F, 4.65F, -1.32F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, -0.1745F));

		 Body.addOrReplaceChild("WhiteD2", CubeListBuilder.create().texOffs(0, 80).addBox(-0.2F, 0.2F, -2.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, -0.6109F));

		 Body.addOrReplaceChild("Belt4", CubeListBuilder.create().texOffs(0, 50).addBox(-4.0F, 10.5F, 1.3F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		 Body.addOrReplaceChild("WhiteD12", CubeListBuilder.create().texOffs(0, 80).addBox(-3.6F, 2.38F, 1.86F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.9599F));

		 Body.addOrReplaceChild("Belt1", CubeListBuilder.create().texOffs(0, 61).addBox(-4.0F, 10.5F, -2.3F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		 Body.addOrReplaceChild("WhiteD11", CubeListBuilder.create().texOffs(0, 80).addBox(2.85F, -2.68F, 0.13F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.9599F));

		  Body.addOrReplaceChild("WhiteD10", CubeListBuilder.create().texOffs(0, 80).addBox(-3.2F, 4.65F, -1.32F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.1745F));

		  Body.addOrReplaceChild("Belt3", CubeListBuilder.create().texOffs(0, 50).addBox(3.2F, 10.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		 Body.addOrReplaceChild("WhiteD7", CubeListBuilder.create().texOffs(0, 80).addBox(3.9F, 1.15F, -0.87F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.2618F));

		  Body.addOrReplaceChild("WhiteD3", CubeListBuilder.create().texOffs(0, 80).addBox(4.42F, 1.5F, -0.75F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.6109F));

		 Body.addOrReplaceChild("WhiteD6", CubeListBuilder.create().texOffs(0, 80).addBox(-5.42F, 6.1F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.6109F));

		  Body.addOrReplaceChild("Belt2", CubeListBuilder.create().texOffs(0, 50).addBox(-4.2F, 10.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		  Body.addOrReplaceChild("Belt5", CubeListBuilder.create().texOffs(0, 49).addBox(3.4F, 11.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		   Body.addOrReplaceChild("WhiteD1", CubeListBuilder.create().texOffs(0, 80).addBox(-0.8F, 0.2F, -2.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.6109F));

		  Body.addOrReplaceChild("WhiteD14", CubeListBuilder.create().texOffs(0, 80).addBox(2.55F, 2.38F, 1.86F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.9599F));

		  Body.addOrReplaceChild("WhiteD13", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-3.85F, -2.68F, 0.13F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, -0.9599F));

		  Body.addOrReplaceChild("WhiteD9", CubeListBuilder.create().texOffs(0, 80).addBox(-4.9F, 1.15F, -0.87F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.2618F));

		PartDefinition RightArm = root.addOrReplaceChild("RightArm",
				CubeListBuilder.create()
						.texOffs(40, 16)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		  RightArm.addOrReplaceChild("D10", CubeListBuilder.create().texOffs(0, 35).addBox(0.6F, 4.0F, 1.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.6109F));

		 RightArm.addOrReplaceChild("D16", CubeListBuilder.create().texOffs(0, 35).addBox(0.3F, 4.1F, 4.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		  RightArm.addOrReplaceChild("Gauntlets4", CubeListBuilder.create().texOffs(50, 70).addBox(-3.0F, 4.0F, 1.2F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		  RightArm.addOrReplaceChild("Gauntlets1", CubeListBuilder.create().texOffs(50, 70).addBox(-3.0F, 4.0F, -2.2F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		  RightArm.addOrReplaceChild("D12", CubeListBuilder.create().texOffs(0, 35).addBox(3.95F, 4.7F, 0.08F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.6109F));

		  RightArm.addOrReplaceChild("Gauntlets2", CubeListBuilder.create().texOffs(71, 70).addBox(-3.2F, 4.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		  RightArm.addOrReplaceChild("D9", CubeListBuilder.create().texOffs(0, 35).addBox(-3.2F, 2.85F, 2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.6109F));

		  RightArm.addOrReplaceChild("D5", CubeListBuilder.create().texOffs(0, 35).addBox(-3.3F, 3.4F, 2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		  RightArm.addOrReplaceChild("D7", CubeListBuilder.create().texOffs(0, 35).addBox(-3.3F, 4.1F, -5.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));

		  RightArm.addOrReplaceChild("D11", CubeListBuilder.create().texOffs(0, 35).addBox(-6.55F, 3.6F, -0.32F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, -0.6109F));

		  RightArm.addOrReplaceChild("D4", CubeListBuilder.create().texOffs(0, 35).addBox(-6.58F, 3.6F, -0.68F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.6109F));

		  RightArm.addOrReplaceChild("D8", CubeListBuilder.create().texOffs(0, 35).addBox(-3.3F, 4.1F, 4.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		 RightArm.addOrReplaceChild("D3", CubeListBuilder.create().texOffs(0, 35).addBox(0.6F, 4.0F, -2.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.6109F));

		  RightArm.addOrReplaceChild("D13", CubeListBuilder.create().texOffs(0, 35).addBox(0.3F, 3.4F, 2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		 RightArm.addOrReplaceChild("D6", CubeListBuilder.create().texOffs(0, 35).addBox(-3.3F, 3.4F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));

		RightArm.addOrReplaceChild("D2", CubeListBuilder.create().texOffs(0, 35).addBox(3.95F, 4.7F, -1.09F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.6109F));

		  RightArm.addOrReplaceChild("D1", CubeListBuilder.create().texOffs(0, 35).addBox(-3.2F, 2.85F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, -0.6109F));

		  RightArm.addOrReplaceChild("Gauntlets3", CubeListBuilder.create().texOffs(71, 70).mirror().addBox(0.2F, 4.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		  RightArm.addOrReplaceChild("D14", CubeListBuilder.create().texOffs(0, 35).addBox(0.3F, 4.1F, -5.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));

		 RightArm.addOrReplaceChild("D15", CubeListBuilder.create().texOffs(0, 35).addBox(0.3F, 3.4F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition LeftArm =root.addOrReplaceChild("LeftArm",
				CubeListBuilder.create()
						.texOffs(40, 16).mirror()
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		  LeftArm.addOrReplaceChild("D3_1", CubeListBuilder.create().texOffs(0, 35).addBox(-1.6F, 4.0F, -2.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, -0.6109F));

		  LeftArm.addOrReplaceChild("Gauntlets4_1", CubeListBuilder.create().texOffs(50, 70).mirror().addBox(-1.0F, 4.0F, 1.2F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		  LeftArm.addOrReplaceChild("D8_1", CubeListBuilder.create().texOffs(0, 35).addBox(2.3F, 4.1F, 4.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		  LeftArm.addOrReplaceChild("D1_1", CubeListBuilder.create().texOffs(0, 35).addBox(2.2F, 2.85F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.6109F));

		  LeftArm.addOrReplaceChild("Gauntlets2_1", CubeListBuilder.create().texOffs(71, 70).mirror().addBox(2.2F, 4.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		  LeftArm.addOrReplaceChild("D4_1", CubeListBuilder.create().texOffs(0, 35).addBox(5.58F, 3.6F, -0.68F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.6109F));

		  LeftArm.addOrReplaceChild("D16_1", CubeListBuilder.create().texOffs(0, 35).addBox(-1.3F, 4.1F, 4.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		  LeftArm.addOrReplaceChild("D11_1", CubeListBuilder.create().texOffs(0, 35).addBox(5.55F, 3.6F, -0.32F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.6109F));

		  LeftArm.addOrReplaceChild("D5_1", CubeListBuilder.create().texOffs(0, 35).addBox(2.3F, 3.4F, 2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		 LeftArm.addOrReplaceChild("Gauntlets1_1", CubeListBuilder.create().texOffs(50, 70).mirror().addBox(-1.0F, 4.0F, -2.2F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		  LeftArm.addOrReplaceChild("D14_1", CubeListBuilder.create().texOffs(0, 35).addBox(-1.3F, 4.1F, -5.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));

		  LeftArm.addOrReplaceChild("D7_1", CubeListBuilder.create().texOffs(0, 35).addBox(2.3F, 4.1F, -5.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));

		 LeftArm.addOrReplaceChild("D9_1", CubeListBuilder.create().texOffs(0, 35).addBox(2.2F, 2.85F, 2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.6109F));

		  LeftArm.addOrReplaceChild("D2_1", CubeListBuilder.create().texOffs(0, 35).addBox(-4.95F, 4.7F, -1.09F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.6109F));

		  LeftArm.addOrReplaceChild("D15_1", CubeListBuilder.create().texOffs(0, 35).addBox(-1.3F, 3.4F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));

		  LeftArm.addOrReplaceChild("D12_1", CubeListBuilder.create().texOffs(0, 35).addBox(-4.95F, 4.7F, 0.08F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, -0.6109F));

		  LeftArm.addOrReplaceChild("D6_1", CubeListBuilder.create().texOffs(0, 35).addBox(2.3F, 3.4F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));

		  LeftArm.addOrReplaceChild("D10_1", CubeListBuilder.create().texOffs(0, 35).addBox(-1.6F, 4.0F, 1.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.6109F));

		  LeftArm.addOrReplaceChild("Gauntlets3_1", CubeListBuilder.create().texOffs(71, 70).addBox(-1.2F, 4.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		  LeftArm.addOrReplaceChild("D13_1", CubeListBuilder.create().texOffs(0, 35).addBox(-1.3F, 3.4F, 2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition RightLeg = root.addOrReplaceChild("RightLeg",
				CubeListBuilder.create()
						.texOffs(0, 16)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		  RightLeg.addOrReplaceChild("DLEG1", CubeListBuilder.create().texOffs(50, 70).addBox(-2.0F, 6.0F, -2.2F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		  RightLeg.addOrReplaceChild("D11_2", CubeListBuilder.create().texOffs(0, 35).addBox(-6.88F, 5.8F, -0.42F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, -0.6109F));

		 RightLeg.addOrReplaceChild("D9_2", CubeListBuilder.create().texOffs(0, 35).addBox(-3.5F, 5.05F, 2.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.6109F));

		  RightLeg.addOrReplaceChild("D13_2", CubeListBuilder.create().texOffs(0, 35).addBox(1.3F, 5.1F, 3.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		 RightLeg.addOrReplaceChild("D2_2", CubeListBuilder.create().texOffs(0, 35).addBox(5.85F, 5.8F, -0.59F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.6109F));

		 RightLeg.addOrReplaceChild("D5_2", CubeListBuilder.create().texOffs(0, 35).addBox(-2.3F, 5.1F, 3.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		  RightLeg.addOrReplaceChild("D10_2", CubeListBuilder.create().texOffs(0, 35).addBox(2.5F, 5.05F, 2.11F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.6109F));

		 RightLeg.addOrReplaceChild("D6_2", CubeListBuilder.create().texOffs(0, 35).addBox(-2.3F, 5.1F, -4.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));

		 RightLeg.addOrReplaceChild("D4_2", CubeListBuilder.create().texOffs(0, 35).addBox(-6.88F, 5.8F, -0.58F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.6109F));

		  RightLeg.addOrReplaceChild("D16_2", CubeListBuilder.create().texOffs(0, 35).addBox(1.3F, 5.8F, 5.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		 RightLeg.addOrReplaceChild("D12_2", CubeListBuilder.create().texOffs(0, 35).addBox(5.85F, 5.8F, -0.41F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.6109F));

		RightLeg.addOrReplaceChild("D1_2", CubeListBuilder.create().texOffs(0, 35).addBox(-3.5F, 5.05F, -3.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, -0.6109F));

		RightLeg.addOrReplaceChild("D7_2", CubeListBuilder.create().texOffs(0, 35).addBox(-2.3F, 5.8F, -6.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));

		 RightLeg.addOrReplaceChild("D14_2", CubeListBuilder.create().texOffs(0, 35).addBox(1.3F, 5.8F, -6.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));

		 RightLeg.addOrReplaceChild("D15_2", CubeListBuilder.create().texOffs(0, 35).addBox(1.3F, 5.1F, -4.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));

		 RightLeg.addOrReplaceChild("DLEG3", CubeListBuilder.create().texOffs(71, 70).mirror().addBox(1.2F, 6.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 RightLeg.addOrReplaceChild("DLEG4", CubeListBuilder.create().texOffs(50, 70).addBox(-2.0F, 6.0F, 1.2F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		RightLeg.addOrReplaceChild("D8_2", CubeListBuilder.create().texOffs(0, 35).addBox(-2.3F, 5.8F, 5.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		 RightLeg.addOrReplaceChild("DLEG2", CubeListBuilder.create().texOffs(71, 70).addBox(-2.2F, 6.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		RightLeg.addOrReplaceChild("D3_2", CubeListBuilder.create().texOffs(0, 35).addBox(2.5F, 5.05F, -3.11F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.6109F));

		PartDefinition LeftLeg = root.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create()
						.texOffs(0, 16).mirror()
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		  LeftLeg.addOrReplaceChild("D16_3", CubeListBuilder.create().texOffs(0, 35).addBox(-2.3F, 5.8F, 5.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		  LeftLeg.addOrReplaceChild("DLEG2_1", CubeListBuilder.create().texOffs(71, 70).mirror().addBox(1.2F, 6.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		  LeftLeg.addOrReplaceChild("D7_3", CubeListBuilder.create().texOffs(0, 35).addBox(1.3F, 5.8F, -6.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));

		LeftLeg.addOrReplaceChild("DLEG4_1", CubeListBuilder.create().texOffs(50, 70).mirror().addBox(-2.0F, 6.0F, 1.2F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		  LeftLeg.addOrReplaceChild("DLEG3_1", CubeListBuilder.create().texOffs(71, 70).addBox(-2.2F, 6.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		  LeftLeg.addOrReplaceChild("D3_3", CubeListBuilder.create().texOffs(0, 35).addBox(2.5F, 5.05F, -3.11F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.6109F));

		  LeftLeg.addOrReplaceChild("D10_3", CubeListBuilder.create().texOffs(0, 35).addBox(2.5F, 5.05F, 2.11F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.6109F));

		  LeftLeg.addOrReplaceChild("D5_3", CubeListBuilder.create().texOffs(0, 35).addBox(1.3F, 5.1F, 3.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		  LeftLeg.addOrReplaceChild("D13_3", CubeListBuilder.create().texOffs(0, 35).addBox(-2.3F, 5.1F, 3.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		  LeftLeg.addOrReplaceChild("D9_3", CubeListBuilder.create().texOffs(0, 35).addBox(-3.5F, 5.05F, 2.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.6109F));

		  LeftLeg.addOrReplaceChild("D8_3", CubeListBuilder.create().texOffs(0, 35).addBox(1.3F, 5.8F, 5.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		 LeftLeg.addOrReplaceChild("DLEG1_1", CubeListBuilder.create().texOffs(50, 70).addBox(-2.0F, 6.0F, -2.2F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		 LeftLeg.addOrReplaceChild("D2_3", CubeListBuilder.create().texOffs(0, 35).addBox(5.85F, 5.8F, -0.59F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.6109F));

		  LeftLeg.addOrReplaceChild("D12_3", CubeListBuilder.create().texOffs(0, 35).addBox(5.85F, 5.8F, -0.41F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.6109F));

		 LeftLeg.addOrReplaceChild("D1_3", CubeListBuilder.create().texOffs(0, 35).addBox(-3.5F, 5.05F, -3.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, -0.6109F));

		 LeftLeg.addOrReplaceChild("D4_3", CubeListBuilder.create().texOffs(0, 35).addBox(-6.88F, 5.8F, -0.58F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.6109F));

		 LeftLeg.addOrReplaceChild("D6_3", CubeListBuilder.create().texOffs(0, 35).addBox(1.3F, 5.1F, -4.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));

		  LeftLeg.addOrReplaceChild("D11_3", CubeListBuilder.create().texOffs(0, 35).addBox(-6.88F, 5.8F, -0.42F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, -0.6109F));

		   LeftLeg.addOrReplaceChild("D15_3", CubeListBuilder.create().texOffs(0, 35).addBox(-2.3F, 5.8F, -6.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));

		  LeftLeg.addOrReplaceChild("D14_3", CubeListBuilder.create().texOffs(0, 35).addBox(-2.3F, 5.1F, -4.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));

		return LayerDefinition.create(definition, 150, 100);
	}

	@Override
	public void renderToBuffer(PoseStack matrixStack, VertexConsumer vertexConsumer, int p_225598_3_, int p_225598_4_, float p_225598_5_, float p_225598_6_, float p_225598_7_, float p_225598_8_) {
		this.leftLeg.visible = true;
		this.rightLeg.visible = true;
		this.head.visible = true;
		this.body.visible = true;
		super.renderToBuffer(matrixStack, vertexConsumer, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
	}
}