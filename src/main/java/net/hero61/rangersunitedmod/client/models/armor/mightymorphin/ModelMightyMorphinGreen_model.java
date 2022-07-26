package net.hero61.rangersunitedmod.client.models.armor.mightymorphin;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelMightyMorphinGreen_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("rangersunited", "model_mighty_morphin_green_model"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public ModelMightyMorphinGreen_model(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Crystal3 = Head.addOrReplaceChild("Crystal3",
				CubeListBuilder.create().texOffs(0, 75).addBox(-0.5F, -7.65F, -3.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition MouthFix2 = Head.addOrReplaceChild("MouthFix2",
				CubeListBuilder.create().texOffs(87, 90).addBox(-0.65F, -2.17F, -4.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5585F));
		PartDefinition Goggles28 = Head.addOrReplaceChild("Goggles28",
				CubeListBuilder.create().texOffs(0, 70).addBox(2.05F, -5.26F, -2.82F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, -0.4363F));
		PartDefinition Goggles22 = Head.addOrReplaceChild("Goggles22",
				CubeListBuilder.create().texOffs(0, 43).addBox(2.16F, -5.85F, -3.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.2094F));
		PartDefinition Goggles23 = Head.addOrReplaceChild("Goggles23",
				CubeListBuilder.create().texOffs(0, 70).addBox(-4.86F, -1.69F, -4.41F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.4363F));
		PartDefinition Mouth9 = Head.addOrReplaceChild("Mouth9",
				CubeListBuilder.create().texOffs(90, 90).addBox(-0.45F, -2.05F, -4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition Goggles30 = Head.addOrReplaceChild("Goggles30",
				CubeListBuilder.create().texOffs(0, 75).addBox(2.02F, -5.4F, -3.94F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0262F, 0.2094F));
		PartDefinition Eye1 = Head.addOrReplaceChild("Eye1",
				CubeListBuilder.create().texOffs(130, 50).addBox(-4.5F, -7.8F, -2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.1745F));
		PartDefinition MouthFix6 = Head.addOrReplaceChild("MouthFix6",
				CubeListBuilder.create().texOffs(87, 90).addBox(-0.65F, -1.87F, -4.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5585F));
		PartDefinition Goggles18 = Head.addOrReplaceChild("Goggles18",
				CubeListBuilder.create().texOffs(0, 43).addBox(-3.16F, -5.45F, -3.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, -0.2094F));
		PartDefinition Goggles20 = Head.addOrReplaceChild("Goggles20",
				CubeListBuilder.create().texOffs(0, 43).addBox(2.63F, -1.98F, -4.64F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, -0.4363F));
		PartDefinition Goggles29 = Head.addOrReplaceChild("Goggles29",
				CubeListBuilder.create().texOffs(0, 70).addBox(2.86F, -1.69F, -4.41F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, -0.4363F));
		PartDefinition HeadBit1 = Head.addOrReplaceChild("HeadBit1",
				CubeListBuilder.create().texOffs(18, 90).addBox(-1.0F, -8.1F, -4.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Goggles19 = Head.addOrReplaceChild("Goggles19",
				CubeListBuilder.create().texOffs(0, 43).addBox(-3.16F, -5.85F, -3.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, -0.2094F));
		PartDefinition MouthFix3 = Head.addOrReplaceChild("MouthFix3",
				CubeListBuilder.create().texOffs(86, 90).addBox(0.7F, -2.5F, -4.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition MouthFix5 = Head.addOrReplaceChild("MouthFix5",
				CubeListBuilder.create().texOffs(86, 90).addBox(-1.0F, -1.4F, -4.05F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition HeadBit3 = Head.addOrReplaceChild("HeadBit3",
				CubeListBuilder.create().texOffs(15, 80).addBox(-1.5F, -8.35F, -3.5F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Goggles17 = Head.addOrReplaceChild("Goggles17",
				CubeListBuilder.create().texOffs(0, 43).addBox(-4.63F, -1.98F, -4.64F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.4363F));
		PartDefinition Goggles13 = Head.addOrReplaceChild("Goggles13",
				CubeListBuilder.create().texOffs(0, 43).addBox(-2.82F, -5.8F, -2.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.1745F));
		PartDefinition Goggles32 = Head.addOrReplaceChild("Goggles32",
				CubeListBuilder.create().texOffs(0, 75).addBox(-1.6F, -2.76F, -4.66F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.4887F));
		PartDefinition Goggles16 = Head.addOrReplaceChild("Goggles16",
				CubeListBuilder.create().texOffs(0, 40).addBox(0.82F, -5.8F, -2.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, -0.1745F));
		PartDefinition Mouth2 = Head.addOrReplaceChild("Mouth2",
				CubeListBuilder.create().texOffs(90, 90).addBox(-1.5F, -2.5F, -4.12F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Mouth8 = Head.addOrReplaceChild("Mouth8",
				CubeListBuilder.create().texOffs(90, 90).addBox(-0.55F, -2.05F, -4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition Goggles24 = Head.addOrReplaceChild("Goggles24",
				CubeListBuilder.create().texOffs(0, 70).addBox(-4.05F, -5.26F, -2.82F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.4363F));
		PartDefinition MouthFix7 = Head.addOrReplaceChild("MouthFix7",
				CubeListBuilder.create().texOffs(87, 90).addBox(-0.35F, -1.87F, -4.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5585F));
		PartDefinition Goggles1 = Head.addOrReplaceChild("Goggles1",
				CubeListBuilder.create().texOffs(0, 43).addBox(-0.97F, -2.97F, -4.84F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.2618F));
		PartDefinition Mouth6 = Head.addOrReplaceChild("Mouth6",
				CubeListBuilder.create().texOffs(90, 90).addBox(-1.0F, -4.35F, -1.65F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.8727F, 0.0F, 0.0F));
		PartDefinition Goggles25 = Head.addOrReplaceChild("Goggles25",
				CubeListBuilder.create().texOffs(0, 75).addBox(-3.02F, -5.4F, -3.94F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0262F, -0.2094F));
		PartDefinition HeadBit2 = Head.addOrReplaceChild("HeadBit2",
				CubeListBuilder.create().texOffs(24, 77).addBox(-1.0F, -6.75F, -3.05F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition Goggles2 = Head.addOrReplaceChild("Goggles2",
				CubeListBuilder.create().texOffs(0, 43).addBox(-0.03F, -2.97F, -4.84F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, -0.2618F));
		PartDefinition Goggles31 = Head.addOrReplaceChild("Goggles31",
				CubeListBuilder.create().texOffs(0, 70).addBox(3.96F, -1.69F, -4.41F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, -0.4363F));
		PartDefinition Eye2 = Head.addOrReplaceChild("Eye2",
				CubeListBuilder.create().texOffs(130, 50).addBox(3.5F, -7.8F, -2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, -0.1745F));
		PartDefinition Mouth7 = Head.addOrReplaceChild("Mouth7",
				CubeListBuilder.create().texOffs(90, 90).addBox(-1.0F, -1.64F, -4.12F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Goggles26 = Head.addOrReplaceChild("Goggles26",
				CubeListBuilder.create().texOffs(0, 70).addBox(-4.96F, -1.69F, -4.41F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.4363F));
		PartDefinition Goggles27 = Head.addOrReplaceChild("Goggles27",
				CubeListBuilder.create().texOffs(0, 75).addBox(0.6F, -2.76F, -4.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, -0.4887F));
		PartDefinition Crystal1 = Head.addOrReplaceChild("Crystal1",
				CubeListBuilder.create().texOffs(0, 75).addBox(-0.5F, -7.45F, -3.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition MouthFix1 = Head.addOrReplaceChild("MouthFix1",
				CubeListBuilder.create().texOffs(86, 90).addBox(-1.7F, -2.5F, -4.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Goggles21 = Head.addOrReplaceChild("Goggles21",
				CubeListBuilder.create().texOffs(0, 43).addBox(2.16F, -5.45F, -3.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.2094F));
		PartDefinition Crystal2 = Head.addOrReplaceChild("Crystal2",
				CubeListBuilder.create().texOffs(26, 67).addBox(7.1F, -1.95F, -1.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.2618F, -1.5708F));
		PartDefinition MouthFix4 = Head.addOrReplaceChild("MouthFix4",
				CubeListBuilder.create().texOffs(87, 90).addBox(-0.35F, -2.17F, -4.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5585F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition GOLD29 = Body
				.addOrReplaceChild(
						"GOLD29", CubeListBuilder.create().texOffs(24, 38).mirror()
								.addBox(-2.6F, 1.8F, 1.72F, 7.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition Belt4 = Body.addOrReplaceChild("Belt4",
				CubeListBuilder.create().texOffs(0, 50).addBox(-4.0F, 10.5F, 1.3F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition GOLD20 = Body.addOrReplaceChild("GOLD20",
				CubeListBuilder.create().texOffs(24, 46).addBox(6.12F, -5.0F, -2.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6981F));
		PartDefinition GOLD4 = Body.addOrReplaceChild("GOLD4",
				CubeListBuilder.create().texOffs(24, 46).addBox(-1.3F, 0.8F, -2.92F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6109F));
		PartDefinition WhiteD10 = Body.addOrReplaceChild("WhiteD10",
				CubeListBuilder.create().texOffs(0, 80).addBox(-3.2F, 4.65F, -1.32F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.1745F));
		PartDefinition GOLD8 = Body.addOrReplaceChild("GOLD8",
				CubeListBuilder.create().texOffs(0, 42).addBox(1.25F, 1.4F, -2.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.6109F));
		PartDefinition GOLD31 = Body.addOrReplaceChild("GOLD31",
				CubeListBuilder.create().texOffs(24, 46).addBox(6.12F, -5.0F, 1.73F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6981F));
		PartDefinition Belt1 = Body.addOrReplaceChild("Belt1",
				CubeListBuilder.create().texOffs(0, 61).addBox(-4.0F, 10.5F, -2.3F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition GOLD15 = Body.addOrReplaceChild("GOLD15",
				CubeListBuilder.create().texOffs(24, 46).addBox(-7.12F, -5.0F, -2.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6981F));
		PartDefinition GOLD7 = Body.addOrReplaceChild("GOLD7",
				CubeListBuilder.create().texOffs(0, 42).addBox(3.3F, 2.6F, -3.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.6109F));
		PartDefinition GOLD18 = Body
				.addOrReplaceChild(
						"GOLD18", CubeListBuilder.create().texOffs(24, 46).mirror()
								.addBox(-0.4F, 1.8F, -2.7F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition GOLD27 = Body.addOrReplaceChild("GOLD27",
				CubeListBuilder.create().texOffs(24, 46).addBox(-5.1F, -3.4F, 1.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6981F));
		PartDefinition WhiteD6 = Body.addOrReplaceChild("WhiteD6",
				CubeListBuilder.create().texOffs(0, 80).addBox(-5.42F, 6.1F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.6109F));
		PartDefinition GOLD32 = Body
				.addOrReplaceChild(
						"GOLD32", CubeListBuilder.create().texOffs(24, 46).mirror()
								.addBox(5.1F, -4.4F, 1.75F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6981F));
		PartDefinition GOLD10 = Body.addOrReplaceChild("GOLD10",
				CubeListBuilder.create().texOffs(24, 46).addBox(-4.4F, 1.8F, -2.7F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition GOLD2 = Body.addOrReplaceChild("GOLD2",
				CubeListBuilder.create().texOffs(24, 46).addBox(4.35F, 2.3F, -2.92F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6109F));
		PartDefinition WhiteD1 = Body.addOrReplaceChild("WhiteD1",
				CubeListBuilder.create().texOffs(0, 80).addBox(-0.8F, 0.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.6109F));
		PartDefinition GOLD16 = Body.addOrReplaceChild("GOLD16",
				CubeListBuilder.create().texOffs(24, 46).addBox(-5.1F, -3.4F, -2.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6981F));
		PartDefinition GOLD30 = Body.addOrReplaceChild("GOLD30", CubeListBuilder.create().texOffs(24, 46).mirror()
				.addBox(4.7F, -0.3F, 1.7F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition GOLD5 = Body.addOrReplaceChild("GOLD5",
				CubeListBuilder.create().texOffs(24, 46).addBox(1.4F, 1.5F, -2.4F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition GOLD24 = Body.addOrReplaceChild("GOLD24",
				CubeListBuilder.create().texOffs(24, 46).addBox(-8.7F, -0.3F, 1.7F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition GOLD26 = Body.addOrReplaceChild("GOLD26",
				CubeListBuilder.create().texOffs(24, 46).addBox(-7.1F, -4.4F, 1.75F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6981F));
		PartDefinition WhiteD13 = Body.addOrReplaceChild(
				"WhiteD13", CubeListBuilder.create().texOffs(0, 80).mirror()
						.addBox(-3.85F, -2.68F, 0.13F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, -0.9599F));
		PartDefinition GOLD25 = Body.addOrReplaceChild("GOLD25",
				CubeListBuilder.create().texOffs(24, 46).addBox(-7.12F, -5.0F, 1.73F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6981F));
		PartDefinition GOLD3 = Body.addOrReplaceChild("GOLD3",
				CubeListBuilder.create().texOffs(24, 46).addBox(0.3F, 0.8F, -2.92F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6109F));
		PartDefinition GOLD6 = Body.addOrReplaceChild("GOLD6",
				CubeListBuilder.create().texOffs(0, 42).addBox(-4.3F, 2.6F, -3.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, -0.6109F));
		PartDefinition WhiteD11 = Body.addOrReplaceChild("WhiteD11",
				CubeListBuilder.create().texOffs(0, 80).addBox(2.85F, -2.68F, 0.13F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.9599F));
		PartDefinition GOLD33 = Body.addOrReplaceChild("GOLD33",
				CubeListBuilder.create().texOffs(24, 46).addBox(4.1F, -3.4F, 1.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6981F));
		PartDefinition Belt5 = Body.addOrReplaceChild("Belt5",
				CubeListBuilder.create().texOffs(0, 49).addBox(3.4F, 11.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition WhiteD12 = Body.addOrReplaceChild("WhiteD12",
				CubeListBuilder.create().texOffs(0, 80).addBox(-3.6F, 2.38F, 1.86F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.9599F));
		PartDefinition GOLD12 = Body.addOrReplaceChild("GOLD12",
				CubeListBuilder.create().texOffs(24, 46).addBox(-7.1F, -4.4F, -2.75F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6981F));
		PartDefinition GOLD14 = Body.addOrReplaceChild("GOLD14",
				CubeListBuilder.create().texOffs(24, 46).addBox(-8.7F, -0.3F, -2.7F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition GOLD11 = Body.addOrReplaceChild("GOLD11",
				CubeListBuilder.create().texOffs(24, 43).addBox(-4.8F, 0.9F, -2.77F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition GOLD13 = Body.addOrReplaceChild("GOLD13",
				CubeListBuilder.create().texOffs(22, 41).addBox(-8.7F, -0.8F, -2.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition GOLD23 = Body.addOrReplaceChild("GOLD23", CubeListBuilder.create().texOffs(22, 41).mirror()
				.addBox(3.7F, -0.8F, -2.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition WhiteD5 = Body.addOrReplaceChild("WhiteD5",
				CubeListBuilder.create().texOffs(0, 80).addBox(4.42F, 6.1F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.6109F));
		PartDefinition WhiteD8 = Body.addOrReplaceChild("WhiteD8",
				CubeListBuilder.create().texOffs(0, 80).addBox(2.2F, 4.65F, -1.32F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, -0.1745F));
		PartDefinition WhiteD9 = Body.addOrReplaceChild("WhiteD9",
				CubeListBuilder.create().texOffs(0, 80).addBox(-4.9F, 1.15F, -0.87F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.2618F));
		PartDefinition Belt3 = Body.addOrReplaceChild("Belt3",
				CubeListBuilder.create().texOffs(0, 50).addBox(3.2F, 10.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition WhiteD7 = Body.addOrReplaceChild("WhiteD7",
				CubeListBuilder.create().texOffs(0, 80).addBox(3.9F, 1.15F, -0.87F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.2618F));
		PartDefinition WhiteD2 = Body.addOrReplaceChild("WhiteD2",
				CubeListBuilder.create().texOffs(0, 80).addBox(-0.2F, 0.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, -0.6109F));
		PartDefinition Belt2 = Body.addOrReplaceChild("Belt2",
				CubeListBuilder.create().texOffs(0, 50).addBox(-4.2F, 10.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition GOLD22 = Body.addOrReplaceChild("GOLD22", CubeListBuilder.create().texOffs(24, 46).mirror()
				.addBox(4.7F, -0.3F, -2.7F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition GOLD28 = Body.addOrReplaceChild("GOLD28",
				CubeListBuilder.create().texOffs(24, 41).addBox(-4.4F, 1.8F, 1.7F, 7.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition GOLD19 = Body
				.addOrReplaceChild(
						"GOLD19", CubeListBuilder.create().texOffs(24, 46).mirror()
								.addBox(5.1F, -4.4F, -2.75F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6981F));
		PartDefinition GOLD9 = Body.addOrReplaceChild("GOLD9",
				CubeListBuilder.create().texOffs(0, 42).addBox(-2.25F, 1.4F, -2.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.6109F));
		PartDefinition GOLD21 = Body.addOrReplaceChild("GOLD21",
				CubeListBuilder.create().texOffs(24, 46).addBox(4.1F, -3.4F, -2.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6981F));
		PartDefinition WhiteD14 = Body.addOrReplaceChild("WhiteD14",
				CubeListBuilder.create().texOffs(0, 80).addBox(2.55F, 2.38F, 1.86F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.9599F));
		PartDefinition GOLD1 = Body.addOrReplaceChild("GOLD1",
				CubeListBuilder.create().texOffs(24, 46).addBox(-5.35F, 2.3F, -2.92F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6109F));
		PartDefinition GOLD17 = Body
				.addOrReplaceChild(
						"GOLD17", CubeListBuilder.create().texOffs(24, 43).mirror()
								.addBox(-0.2F, 0.9F, -2.77F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition D16 = RightArm.addOrReplaceChild("D16",
				CubeListBuilder.create().texOffs(19, 75).addBox(0.5F, 3.8F, 0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0175F, 0.7854F, 0.1222F));
		PartDefinition Gauntlets1 = RightArm.addOrReplaceChild("Gauntlets1",
				CubeListBuilder.create().texOffs(50, 70).addBox(-3.0F, 4.0F, -2.2F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition D8 = RightArm.addOrReplaceChild("D8",
				CubeListBuilder.create().texOffs(19, 75).addBox(-2.1F, 3.5F, 3.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0175F, -0.7854F, -0.1222F));
		PartDefinition D13 = RightArm.addOrReplaceChild("D13",
				CubeListBuilder.create().texOffs(19, 75).addBox(1.4F, 3.8F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0175F, 0.7854F, 0.1222F));
		PartDefinition GoldChain1 = RightArm.addOrReplaceChild("GoldChain1",
				CubeListBuilder.create().texOffs(30, 45).addBox(-3.0F, 3.5F, -2.1F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition D5 = RightArm.addOrReplaceChild("D5",
				CubeListBuilder.create().texOffs(19, 75).addBox(-3.9F, 3.5F, 1.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0175F, -0.7854F, -0.1222F));
		PartDefinition D6 = RightArm.addOrReplaceChild("D6",
				CubeListBuilder.create().texOffs(19, 75).addBox(-3.0F, 3.5F, 2.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0175F, -0.7854F, -0.1222F));
		PartDefinition D10 = RightArm.addOrReplaceChild("D10",
				CubeListBuilder.create().texOffs(16, 73).addBox(-0.2F, 3.65F, 2.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, -0.7854F, 0.1222F));
		PartDefinition GoldChain7 = RightArm.addOrReplaceChild("GoldChain7",
				CubeListBuilder.create().texOffs(30, 45).addBox(-3.0F, 0.4F, 1.3F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition D1 = RightArm.addOrReplaceChild("D1",
				CubeListBuilder.create().texOffs(16, 73).addBox(-2.0F, 3.7F, -2.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1396F, -0.7854F, -0.0873F));
		PartDefinition D15 = RightArm.addOrReplaceChild("D15",
				CubeListBuilder.create().texOffs(19, 75).addBox(-0.3F, 3.8F, 1.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0175F, 0.7854F, 0.1222F));
		PartDefinition GoldChain2 = RightArm.addOrReplaceChild("GoldChain2",
				CubeListBuilder.create().texOffs(30, 45).addBox(-3.1F, 3.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition D11 = RightArm.addOrReplaceChild("D11",
				CubeListBuilder.create().texOffs(16, 73).addBox(0.65F, 3.65F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, -0.7854F, 0.1222F));
		PartDefinition GoldChain8 = RightArm.addOrReplaceChild("GoldChain8",
				CubeListBuilder.create().texOffs(26, 45).addBox(0.3F, 0.4F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition GoldChain6 = RightArm.addOrReplaceChild("GoldChain6",
				CubeListBuilder.create().texOffs(26, 45).addBox(-3.3F, 0.4F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Gauntlets3 = RightArm.addOrReplaceChild("Gauntlets3", CubeListBuilder.create().texOffs(71, 70).mirror()
				.addBox(0.2F, 4.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Gauntlets4 = RightArm.addOrReplaceChild("Gauntlets4",
				CubeListBuilder.create().texOffs(50, 70).addBox(-3.0F, 4.0F, 1.2F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition GoldChain5 = RightArm.addOrReplaceChild("GoldChain5",
				CubeListBuilder.create().texOffs(30, 45).addBox(-3.0F, 0.4F, -2.3F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition D3 = RightArm.addOrReplaceChild("D3",
				CubeListBuilder.create().texOffs(16, 73).addBox(-3.9F, 3.65F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, -0.7854F, -0.1222F));
		PartDefinition GoldChain4 = RightArm.addOrReplaceChild("GoldChain4",
				CubeListBuilder.create().texOffs(30, 45).addBox(0.1F, 3.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition D2 = RightArm.addOrReplaceChild("D2",
				CubeListBuilder.create().texOffs(16, 73).addBox(-3.0F, 3.65F, -1.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, -0.7854F, -0.1222F));
		PartDefinition D12 = RightArm.addOrReplaceChild("D12",
				CubeListBuilder.create().texOffs(16, 73).addBox(1.5F, 3.65F, 1.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, -0.7854F, 0.1222F));
		PartDefinition Gauntlets2 = RightArm.addOrReplaceChild("Gauntlets2",
				CubeListBuilder.create().texOffs(71, 70).addBox(-3.2F, 4.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition GoldChain3 = RightArm.addOrReplaceChild("GoldChain3",
				CubeListBuilder.create().texOffs(30, 45).addBox(-3.0F, 3.5F, 1.1F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(40, 16).mirror()
				.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition Gauntlets1_1 = LeftArm.addOrReplaceChild("Gauntlets1_1", CubeListBuilder.create().texOffs(50, 70).mirror()
				.addBox(-1.0F, 4.0F, -2.2F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition GoldChain5_1 = LeftArm.addOrReplaceChild("GoldChain5_1",
				CubeListBuilder.create().texOffs(30, 45).addBox(-1.0F, 0.4F, -2.3F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition D6_1 = LeftArm.addOrReplaceChild("D6_1",
				CubeListBuilder.create().texOffs(19, 75).addBox(-2.5F, 3.8F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0175F, -0.7854F, -0.1222F));
		PartDefinition GoldChain1_1 = LeftArm.addOrReplaceChild("GoldChain1_1",
				CubeListBuilder.create().texOffs(30, 45).addBox(-1.0F, 3.5F, -2.1F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition GoldChain6_2 = LeftArm.addOrReplaceChild("GoldChain6_2",
				CubeListBuilder.create().texOffs(26, 45).addBox(-1.3F, 0.4F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition D3_1 = LeftArm.addOrReplaceChild("D3_1",
				CubeListBuilder.create().texOffs(16, 73).addBox(-0.6F, 3.7F, -3.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1396F, -0.7854F, -0.0873F));
		PartDefinition D5_1 = LeftArm.addOrReplaceChild("D5_1",
				CubeListBuilder.create().texOffs(19, 75).addBox(-1.65F, 3.8F, 0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0175F, -0.7854F, -0.1222F));
		PartDefinition D15_1 = LeftArm.addOrReplaceChild("D15_1",
				CubeListBuilder.create().texOffs(19, 75).addBox(1.1F, 3.6F, 2.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0175F, 0.7854F, 0.1222F));
		PartDefinition D14 = LeftArm.addOrReplaceChild("D14",
				CubeListBuilder.create().texOffs(19, 75).addBox(2.05F, 3.6F, 1.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0175F, 0.7854F, 0.1222F));
		PartDefinition Gauntlets2_1 = LeftArm.addOrReplaceChild("Gauntlets2_1", CubeListBuilder.create().texOffs(71, 70).mirror()
				.addBox(2.2F, 4.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition GoldChain6_1 = LeftArm.addOrReplaceChild("GoldChain6_1",
				CubeListBuilder.create().texOffs(26, 45).addBox(2.3F, 0.4F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition GoldChain4_1 = LeftArm.addOrReplaceChild("GoldChain4_1",
				CubeListBuilder.create().texOffs(30, 45).addBox(2.1F, 3.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Gauntlets3_1 = LeftArm.addOrReplaceChild("Gauntlets3_1",
				CubeListBuilder.create().texOffs(71, 70).addBox(-1.2F, 4.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition GoldChain3_1 = LeftArm.addOrReplaceChild("GoldChain3_1",
				CubeListBuilder.create().texOffs(30, 45).addBox(-1.0F, 3.5F, 1.1F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Gauntlets4_1 = LeftArm.addOrReplaceChild("Gauntlets4_1", CubeListBuilder.create().texOffs(50, 70).mirror()
				.addBox(-1.0F, 4.0F, 1.2F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition D13_1 = LeftArm.addOrReplaceChild("D13_1",
				CubeListBuilder.create().texOffs(19, 75).addBox(2.9F, 3.6F, 1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0175F, 0.7854F, 0.1222F));
		PartDefinition D2_1 = LeftArm.addOrReplaceChild("D2_1",
				CubeListBuilder.create().texOffs(16, 73).addBox(-1.45F, 3.7F, -2.95F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1396F, -0.7854F, -0.0873F));
		PartDefinition D4 = LeftArm.addOrReplaceChild("D4",
				CubeListBuilder.create().texOffs(19, 75).addBox(-0.7F, 3.75F, 1.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0175F, -0.7854F, -0.1222F));
		PartDefinition D1_1 = LeftArm.addOrReplaceChild("D1_1",
				CubeListBuilder.create().texOffs(16, 73).addBox(-2.3F, 3.7F, -2.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1396F, -0.7854F, -0.0873F));
		PartDefinition GoldChain2_1 = LeftArm.addOrReplaceChild("GoldChain2_1",
				CubeListBuilder.create().texOffs(30, 45).addBox(-1.1F, 3.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition D10_1 = LeftArm.addOrReplaceChild("D10_1",
				CubeListBuilder.create().texOffs(16, 73).addBox(2.9F, 3.65F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, -0.7854F, 0.1222F));
		PartDefinition GoldChain7_1 = LeftArm.addOrReplaceChild("GoldChain7_1",
				CubeListBuilder.create().texOffs(30, 45).addBox(-1.0F, 0.4F, 1.3F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition D12_1 = LeftArm.addOrReplaceChild("D12_1",
				CubeListBuilder.create().texOffs(16, 73).addBox(1.1F, 3.65F, 1.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, -0.7854F, 0.1222F));
		PartDefinition D11_1 = LeftArm.addOrReplaceChild("D11_1",
				CubeListBuilder.create().texOffs(16, 73).addBox(1.95F, 3.65F, 0.65F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, -0.7854F, 0.1222F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition D2_2 = RightLeg.addOrReplaceChild("D2_2",
				CubeListBuilder.create().texOffs(16, 73).addBox(-3.3F, 5.65F, -1.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, -0.7854F, -0.1222F));
		PartDefinition D12_2 = RightLeg.addOrReplaceChild("D12_2",
				CubeListBuilder.create().texOffs(16, 73).addBox(2.4F, 5.65F, 0.55F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, -0.7854F, 0.1222F));
		PartDefinition D7 = RightLeg.addOrReplaceChild("D7",
				CubeListBuilder.create().texOffs(19, 75).addBox(-1.6F, 5.63F, 2.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0175F, -0.7854F, -0.1222F));
		PartDefinition D6_2 = RightLeg.addOrReplaceChild("D6_2",
				CubeListBuilder.create().texOffs(19, 75).addBox(-2.5F, 5.63F, 1.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0175F, -0.7854F, -0.1222F));
		PartDefinition DLEG1 = RightLeg.addOrReplaceChild("DLEG1",
				CubeListBuilder.create().texOffs(50, 70).addBox(-2.0F, 6.0F, -2.2F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition D1_2 = RightLeg.addOrReplaceChild("D1_2",
				CubeListBuilder.create().texOffs(16, 73).addBox(-2.23F, 5.7F, -2.38F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1396F, -0.7854F, -0.0873F));
		PartDefinition DLEG3 = RightLeg.addOrReplaceChild("DLEG3", CubeListBuilder.create().texOffs(71, 70).mirror()
				.addBox(1.2F, 6.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition GoldChain2_2 = RightLeg.addOrReplaceChild("GoldChain2_2",
				CubeListBuilder.create().texOffs(30, 45).addBox(-2.1F, 5.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition D13_2 = RightLeg.addOrReplaceChild("D13_2",
				CubeListBuilder.create().texOffs(19, 75).addBox(2.3F, 5.65F, 0.45F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0175F, 0.7854F, 0.1222F));
		PartDefinition D5_2 = RightLeg.addOrReplaceChild("D5_2",
				CubeListBuilder.create().texOffs(19, 75).addBox(-3.35F, 5.65F, 0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0175F, -0.7854F, -0.1222F));
		PartDefinition D3_2 = RightLeg.addOrReplaceChild("D3_2",
				CubeListBuilder.create().texOffs(16, 73).addBox(-1.6F, 5.65F, -3.35F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, -0.7854F, -0.1222F));
		PartDefinition DLEG4 = RightLeg.addOrReplaceChild("DLEG4",
				CubeListBuilder.create().texOffs(50, 70).addBox(-2.0F, 6.0F, 1.2F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition GoldChain4_2 = RightLeg.addOrReplaceChild("GoldChain4_2",
				CubeListBuilder.create().texOffs(30, 45).addBox(1.1F, 5.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition D14_1 = RightLeg.addOrReplaceChild("D14_1",
				CubeListBuilder.create().texOffs(19, 75).addBox(1.5F, 5.65F, 1.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0175F, 0.7854F, 0.1222F));
		PartDefinition GoldChain3_2 = RightLeg.addOrReplaceChild("GoldChain3_2",
				CubeListBuilder.create().texOffs(30, 45).addBox(-2.0F, 5.5F, 1.1F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition D11_2 = RightLeg.addOrReplaceChild("D11_2",
				CubeListBuilder.create().texOffs(16, 73).addBox(1.45F, 5.65F, 1.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, -0.7854F, 0.1222F));
		PartDefinition GoldChain1_2 = RightLeg.addOrReplaceChild("GoldChain1_2",
				CubeListBuilder.create().texOffs(30, 45).addBox(-2.0F, 5.5F, -2.1F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition D15_2 = RightLeg.addOrReplaceChild("D15_2",
				CubeListBuilder.create().texOffs(19, 75).addBox(0.6F, 5.65F, 2.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0175F, 0.7854F, 0.1222F));
		PartDefinition DLEG2 = RightLeg.addOrReplaceChild("DLEG2",
				CubeListBuilder.create().texOffs(71, 70).addBox(-2.2F, 6.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition D10_2 = RightLeg.addOrReplaceChild("D10_2",
				CubeListBuilder.create().texOffs(16, 73).addBox(0.6F, 5.65F, 2.35F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, -0.7854F, 0.1222F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(0, 16).mirror()
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition D5_3 = LeftLeg.addOrReplaceChild("D5_3",
				CubeListBuilder.create().texOffs(19, 75).addBox(-3.35F, 5.65F, 0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0175F, -0.7854F, -0.1222F));
		PartDefinition GoldChain4_3 = LeftLeg.addOrReplaceChild("GoldChain4_3",
				CubeListBuilder.create().texOffs(30, 45).addBox(1.1F, 5.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition DLEG3_1 = LeftLeg.addOrReplaceChild("DLEG3_1",
				CubeListBuilder.create().texOffs(71, 70).addBox(-2.2F, 6.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition D2_3 = LeftLeg.addOrReplaceChild("D2_3",
				CubeListBuilder.create().texOffs(16, 73).addBox(-3.3F, 5.65F, -1.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, -0.7854F, -0.1222F));
		PartDefinition DLEG4_1 = LeftLeg.addOrReplaceChild("DLEG4_1", CubeListBuilder.create().texOffs(50, 70).mirror()
				.addBox(-2.0F, 6.0F, 1.2F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition GoldChain3_3 = LeftLeg.addOrReplaceChild("GoldChain3_3",
				CubeListBuilder.create().texOffs(30, 45).addBox(-2.0F, 5.5F, 1.1F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition DLEG1_1 = LeftLeg.addOrReplaceChild("DLEG1_1",
				CubeListBuilder.create().texOffs(50, 70).addBox(-2.0F, 6.0F, -2.2F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition D11_3 = LeftLeg.addOrReplaceChild("D11_3",
				CubeListBuilder.create().texOffs(16, 73).addBox(1.45F, 5.65F, 1.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, -0.7854F, 0.1222F));
		PartDefinition D13_3 = LeftLeg.addOrReplaceChild("D13_3",
				CubeListBuilder.create().texOffs(19, 75).addBox(2.35F, 5.65F, 0.45F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0175F, 0.7854F, 0.1222F));
		PartDefinition D15_3 = LeftLeg.addOrReplaceChild("D15_3",
				CubeListBuilder.create().texOffs(19, 75).addBox(0.6F, 5.65F, 2.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0175F, 0.7854F, 0.1222F));
		PartDefinition D14_2 = LeftLeg.addOrReplaceChild("D14_2",
				CubeListBuilder.create().texOffs(19, 75).addBox(1.5F, 5.65F, 1.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0175F, 0.7854F, 0.1222F));
		PartDefinition D1_3 = LeftLeg.addOrReplaceChild("D1_3",
				CubeListBuilder.create().texOffs(16, 73).addBox(-2.23F, 5.7F, -2.38F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1396F, -0.7854F, -0.0873F));
		PartDefinition D3_3 = LeftLeg.addOrReplaceChild("D3_3",
				CubeListBuilder.create().texOffs(16, 73).addBox(-1.6F, 5.65F, -3.35F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, -0.7854F, -0.1222F));
		PartDefinition GoldChain1_3 = LeftLeg.addOrReplaceChild("GoldChain1_3",
				CubeListBuilder.create().texOffs(30, 45).addBox(-2.0F, 5.5F, -2.1F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition GoldChain2_3 = LeftLeg.addOrReplaceChild("GoldChain2_3",
				CubeListBuilder.create().texOffs(30, 45).addBox(-2.1F, 5.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition D10_3 = LeftLeg.addOrReplaceChild("D10_3",
				CubeListBuilder.create().texOffs(16, 73).addBox(0.6F, 5.65F, 2.35F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, -0.7854F, 0.1222F));
		PartDefinition D6_3 = LeftLeg.addOrReplaceChild("D6_3",
				CubeListBuilder.create().texOffs(19, 75).addBox(-2.5F, 5.63F, 1.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0175F, -0.7854F, -0.1222F));
		PartDefinition D7_1 = LeftLeg.addOrReplaceChild("D7_1",
				CubeListBuilder.create().texOffs(19, 75).addBox(-1.6F, 5.63F, 2.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0175F, -0.7854F, -0.1222F));
		PartDefinition DLEG2_1 = LeftLeg.addOrReplaceChild("DLEG2_1", CubeListBuilder.create().texOffs(71, 70).mirror()
				.addBox(1.2F, 6.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition D12_3 = LeftLeg.addOrReplaceChild("D12_3",
				CubeListBuilder.create().texOffs(16, 73).addBox(2.4F, 5.65F, 0.55F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, -0.7854F, 0.1222F));
		return LayerDefinition.create(meshdefinition, 150, 100);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
