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
public class ModelMightyMorphinYellow_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("rangersunited", "model_mighty_morphin_yellow_model"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public ModelMightyMorphinYellow_model(ModelPart root) {
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
		PartDefinition MouthFix6 = Head.addOrReplaceChild("MouthFix6",
				CubeListBuilder.create().texOffs(87, 90).addBox(-0.65F, -1.87F, -4.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5585F));
		PartDefinition MouthFix3 = Head.addOrReplaceChild("MouthFix3",
				CubeListBuilder.create().texOffs(86, 90).addBox(0.7F, -2.5F, -4.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Goggles21 = Head.addOrReplaceChild("Goggles21",
				CubeListBuilder.create().texOffs(0, 43).addBox(-3.17F, -2.71F, -4.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, -0.0524F));
		PartDefinition HeadBit3 = Head.addOrReplaceChild("HeadBit3",
				CubeListBuilder.create().texOffs(15, 80).addBox(-3.0F, -8.35F, -2.5F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Mouth8 = Head.addOrReplaceChild("Mouth8",
				CubeListBuilder.create().texOffs(90, 90).addBox(-0.55F, -2.05F, -4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition Mouth7 = Head.addOrReplaceChild("Mouth7",
				CubeListBuilder.create().texOffs(90, 90).addBox(-1.0F, -1.64F, -4.12F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Eye2 = Head.addOrReplaceChild("Eye2",
				CubeListBuilder.create().texOffs(0, 43).addBox(3.5F, -7.8F, -2.18F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, -0.1745F));
		PartDefinition Horn1 = Head.addOrReplaceChild("Horn1",
				CubeListBuilder.create().texOffs(0, 73).addBox(-1.0F, -6.9F, -4.43F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition HeadBit1 = Head.addOrReplaceChild("HeadBit1",
				CubeListBuilder.create().texOffs(18, 90).addBox(-1.5F, -8.2F, -4.25F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Goggles15 = Head.addOrReplaceChild("Goggles15",
				CubeListBuilder.create().texOffs(0, 43).addBox(1.2F, -6.22F, -2.56F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, -0.1745F));
		PartDefinition HeadBit5 = Head.addOrReplaceChild("HeadBit5",
				CubeListBuilder.create().texOffs(18, 90).addBox(-1.5F, -8.2F, 3.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Mouth9 = Head.addOrReplaceChild("Mouth9",
				CubeListBuilder.create().texOffs(90, 90).addBox(-0.45F, -2.05F, -4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition MouthFix7 = Head.addOrReplaceChild("MouthFix7",
				CubeListBuilder.create().texOffs(87, 90).addBox(-0.35F, -1.87F, -4.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5585F));
		PartDefinition Eye1 = Head.addOrReplaceChild("Eye1",
				CubeListBuilder.create().texOffs(0, 43).addBox(-4.5F, -7.8F, -2.18F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.1745F));
		PartDefinition Goggles7 = Head.addOrReplaceChild(
				"Goggles7", CubeListBuilder.create().texOffs(0, 43).mirror()
						.addBox(-4.2F, -6.22F, -2.56F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.1745F));
		PartDefinition Horn2 = Head.addOrReplaceChild("Horn2",
				CubeListBuilder.create().texOffs(18, 90).addBox(3.2F, -8.3F, -3.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Mouth2 = Head.addOrReplaceChild("Mouth2",
				CubeListBuilder.create().texOffs(90, 90).addBox(-1.5F, -2.5F, -4.12F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition MouthFix1 = Head.addOrReplaceChild("MouthFix1",
				CubeListBuilder.create().texOffs(86, 90).addBox(-1.7F, -2.5F, -4.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition MouthFix5 = Head.addOrReplaceChild("MouthFix5",
				CubeListBuilder.create().texOffs(86, 90).addBox(-1.0F, -1.4F, -4.05F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Goggles8 = Head.addOrReplaceChild("Goggles8",
				CubeListBuilder.create().texOffs(0, 43).addBox(0.17F, -2.71F, -4.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0524F));
		PartDefinition Horn3 = Head.addOrReplaceChild("Horn3",
				CubeListBuilder.create().texOffs(18, 90).addBox(-4.3F, -8.3F, -3.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Mouth6 = Head.addOrReplaceChild("Mouth6",
				CubeListBuilder.create().texOffs(90, 90).addBox(-1.0F, -4.35F, -1.65F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.8727F, 0.0F, 0.0F));
		PartDefinition MouthFix2 = Head.addOrReplaceChild("MouthFix2",
				CubeListBuilder.create().texOffs(87, 90).addBox(-0.65F, -2.17F, -4.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5585F));
		PartDefinition MouthFix4 = Head.addOrReplaceChild("MouthFix4",
				CubeListBuilder.create().texOffs(87, 90).addBox(-0.35F, -2.17F, -4.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5585F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Belt5 = Body.addOrReplaceChild("Belt5",
				CubeListBuilder.create().texOffs(0, 49).addBox(3.4F, 11.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition WhiteD2 = Body.addOrReplaceChild("WhiteD2",
				CubeListBuilder.create().texOffs(0, 80).addBox(-0.2F, 0.2F, -2.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, -0.6109F));
		PartDefinition WhiteD7 = Body.addOrReplaceChild("WhiteD7",
				CubeListBuilder.create().texOffs(0, 80).addBox(3.9F, 1.15F, -0.87F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.2618F));
		PartDefinition WhiteD6 = Body.addOrReplaceChild("WhiteD6",
				CubeListBuilder.create().texOffs(0, 80).addBox(-5.42F, 6.1F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.6109F));
		PartDefinition WhiteD3 = Body.addOrReplaceChild("WhiteD3",
				CubeListBuilder.create().texOffs(0, 80).addBox(4.42F, 1.5F, -0.75F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.6109F));
		PartDefinition WhiteD11 = Body.addOrReplaceChild("WhiteD11",
				CubeListBuilder.create().texOffs(0, 80).addBox(2.85F, -2.68F, 0.13F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.9599F));
		PartDefinition WhiteD12 = Body.addOrReplaceChild("WhiteD12",
				CubeListBuilder.create().texOffs(0, 80).addBox(-3.6F, 2.38F, 1.86F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.9599F));
		PartDefinition WhiteD1 = Body.addOrReplaceChild("WhiteD1",
				CubeListBuilder.create().texOffs(0, 80).addBox(-0.8F, 0.2F, -2.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.6109F));
		PartDefinition WhiteD8 = Body.addOrReplaceChild("WhiteD8",
				CubeListBuilder.create().texOffs(0, 80).addBox(2.2F, 4.65F, -1.32F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, -0.1745F));
		PartDefinition WhiteD14 = Body.addOrReplaceChild("WhiteD14",
				CubeListBuilder.create().texOffs(0, 80).addBox(2.55F, 2.38F, 1.86F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.9599F));
		PartDefinition Belt1 = Body.addOrReplaceChild("Belt1",
				CubeListBuilder.create().texOffs(0, 61).addBox(-4.0F, 10.5F, -2.3F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Belt4 = Body.addOrReplaceChild("Belt4",
				CubeListBuilder.create().texOffs(0, 50).addBox(-4.0F, 10.5F, 1.3F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Belt2 = Body.addOrReplaceChild("Belt2",
				CubeListBuilder.create().texOffs(0, 50).addBox(-4.2F, 10.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition WhiteD4 = Body.addOrReplaceChild("WhiteD4",
				CubeListBuilder.create().texOffs(0, 80).addBox(-5.42F, 1.5F, -0.75F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.6109F));
		PartDefinition WhiteD10 = Body.addOrReplaceChild("WhiteD10",
				CubeListBuilder.create().texOffs(0, 80).addBox(-3.2F, 4.65F, -1.32F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.1745F));
		PartDefinition WhiteD13 = Body.addOrReplaceChild(
				"WhiteD13", CubeListBuilder.create().texOffs(0, 80).mirror()
						.addBox(-3.85F, -2.68F, 0.13F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, -0.9599F));
		PartDefinition WhiteD5 = Body.addOrReplaceChild("WhiteD5",
				CubeListBuilder.create().texOffs(0, 80).addBox(4.42F, 6.1F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.6109F));
		PartDefinition Belt3 = Body.addOrReplaceChild("Belt3",
				CubeListBuilder.create().texOffs(0, 50).addBox(3.2F, 10.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition WhiteD9 = Body.addOrReplaceChild("WhiteD9",
				CubeListBuilder.create().texOffs(0, 80).addBox(-4.9F, 1.15F, -0.87F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.2618F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition D2 = RightArm.addOrReplaceChild("D2",
				CubeListBuilder.create().texOffs(0, 35).addBox(3.95F, 4.7F, -1.09F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.6109F));
		PartDefinition D8 = RightArm.addOrReplaceChild("D8",
				CubeListBuilder.create().texOffs(0, 35).addBox(-3.3F, 4.1F, 4.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition D5 = RightArm.addOrReplaceChild("D5",
				CubeListBuilder.create().texOffs(0, 35).addBox(-3.3F, 3.4F, 2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition D14 = RightArm.addOrReplaceChild("D14",
				CubeListBuilder.create().texOffs(0, 35).addBox(0.3F, 4.1F, -5.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));
		PartDefinition Gauntlets1 = RightArm.addOrReplaceChild("Gauntlets1",
				CubeListBuilder.create().texOffs(50, 70).addBox(-3.0F, 4.0F, -2.2F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition D10 = RightArm.addOrReplaceChild("D10",
				CubeListBuilder.create().texOffs(0, 35).addBox(0.6F, 4.0F, 1.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.6109F));
		PartDefinition Gauntlets3 = RightArm.addOrReplaceChild("Gauntlets3", CubeListBuilder.create().texOffs(71, 70).mirror()
				.addBox(0.2F, 4.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition D13 = RightArm.addOrReplaceChild("D13",
				CubeListBuilder.create().texOffs(0, 35).addBox(0.3F, 3.4F, 2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition D15 = RightArm.addOrReplaceChild("D15",
				CubeListBuilder.create().texOffs(0, 35).addBox(0.3F, 3.4F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));
		PartDefinition D11 = RightArm.addOrReplaceChild("D11",
				CubeListBuilder.create().texOffs(0, 35).addBox(-6.55F, 3.6F, -0.32F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, -0.6109F));
		PartDefinition Gauntlets4 = RightArm.addOrReplaceChild("Gauntlets4",
				CubeListBuilder.create().texOffs(50, 70).addBox(-3.0F, 4.0F, 1.2F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition D7 = RightArm.addOrReplaceChild("D7",
				CubeListBuilder.create().texOffs(0, 35).addBox(-3.3F, 4.1F, -5.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));
		PartDefinition D12 = RightArm.addOrReplaceChild("D12",
				CubeListBuilder.create().texOffs(0, 35).addBox(3.95F, 4.7F, 0.08F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.6109F));
		PartDefinition Gauntlets2 = RightArm.addOrReplaceChild("Gauntlets2",
				CubeListBuilder.create().texOffs(71, 70).addBox(-3.2F, 4.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition D6 = RightArm.addOrReplaceChild("D6",
				CubeListBuilder.create().texOffs(0, 35).addBox(-3.3F, 3.4F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));
		PartDefinition D3 = RightArm.addOrReplaceChild("D3",
				CubeListBuilder.create().texOffs(0, 35).addBox(0.6F, 4.0F, -2.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.6109F));
		PartDefinition D4 = RightArm.addOrReplaceChild("D4",
				CubeListBuilder.create().texOffs(0, 35).addBox(-6.58F, 3.6F, -0.68F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.6109F));
		PartDefinition D1 = RightArm.addOrReplaceChild("D1",
				CubeListBuilder.create().texOffs(0, 35).addBox(-3.2F, 2.85F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, -0.6109F));
		PartDefinition D9 = RightArm.addOrReplaceChild("D9",
				CubeListBuilder.create().texOffs(0, 35).addBox(-3.2F, 2.85F, 2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.6109F));
		PartDefinition D16 = RightArm.addOrReplaceChild("D16",
				CubeListBuilder.create().texOffs(0, 35).addBox(0.3F, 4.1F, 4.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(40, 16).mirror()
				.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition Gauntlets4_1 = LeftArm.addOrReplaceChild("Gauntlets4_1", CubeListBuilder.create().texOffs(50, 70).mirror()
				.addBox(-1.0F, 4.0F, 1.2F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition D16_1 = LeftArm.addOrReplaceChild("D16_1",
				CubeListBuilder.create().texOffs(0, 35).addBox(-1.3F, 4.1F, 4.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition D9_1 = LeftArm.addOrReplaceChild("D9_1",
				CubeListBuilder.create().texOffs(0, 35).addBox(2.2F, 2.85F, 2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.6109F));
		PartDefinition D4_1 = LeftArm.addOrReplaceChild("D4_1",
				CubeListBuilder.create().texOffs(0, 35).addBox(5.58F, 3.6F, -0.68F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.6109F));
		PartDefinition D7_1 = LeftArm.addOrReplaceChild("D7_1",
				CubeListBuilder.create().texOffs(0, 35).addBox(2.3F, 4.1F, -5.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));
		PartDefinition D5_1 = LeftArm.addOrReplaceChild("D5_1",
				CubeListBuilder.create().texOffs(0, 35).addBox(2.3F, 3.4F, 2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition D10_1 = LeftArm.addOrReplaceChild("D10_1",
				CubeListBuilder.create().texOffs(0, 35).addBox(-1.6F, 4.0F, 1.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.6109F));
		PartDefinition D14_1 = LeftArm.addOrReplaceChild("D14_1",
				CubeListBuilder.create().texOffs(0, 35).addBox(-1.3F, 4.1F, -5.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));
		PartDefinition D12_1 = LeftArm.addOrReplaceChild("D12_1",
				CubeListBuilder.create().texOffs(0, 35).addBox(-4.95F, 4.7F, 0.08F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, -0.6109F));
		PartDefinition D2_1 = LeftArm.addOrReplaceChild("D2_1",
				CubeListBuilder.create().texOffs(0, 35).addBox(-4.95F, 4.7F, -1.09F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.6109F));
		PartDefinition D11_1 = LeftArm.addOrReplaceChild("D11_1",
				CubeListBuilder.create().texOffs(0, 35).addBox(5.55F, 3.6F, -0.32F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.6109F));
		PartDefinition D3_1 = LeftArm.addOrReplaceChild("D3_1",
				CubeListBuilder.create().texOffs(0, 35).addBox(-1.6F, 4.0F, -2.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, -0.6109F));
		PartDefinition D8_1 = LeftArm.addOrReplaceChild("D8_1",
				CubeListBuilder.create().texOffs(0, 35).addBox(2.3F, 4.1F, 4.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition D13_1 = LeftArm.addOrReplaceChild("D13_1",
				CubeListBuilder.create().texOffs(0, 35).addBox(-1.3F, 3.4F, 2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition D15_1 = LeftArm.addOrReplaceChild("D15_1",
				CubeListBuilder.create().texOffs(0, 35).addBox(-1.3F, 3.4F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));
		PartDefinition D6_1 = LeftArm.addOrReplaceChild("D6_1",
				CubeListBuilder.create().texOffs(0, 35).addBox(2.3F, 3.4F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));
		PartDefinition Gauntlets3_1 = LeftArm.addOrReplaceChild("Gauntlets3_1",
				CubeListBuilder.create().texOffs(71, 70).addBox(-1.2F, 4.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Gauntlets2_1 = LeftArm.addOrReplaceChild("Gauntlets2_1", CubeListBuilder.create().texOffs(71, 70).mirror()
				.addBox(2.2F, 4.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Gauntlets1_1 = LeftArm.addOrReplaceChild("Gauntlets1_1", CubeListBuilder.create().texOffs(50, 70).mirror()
				.addBox(-1.0F, 4.0F, -2.2F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition D1_1 = LeftArm.addOrReplaceChild("D1_1",
				CubeListBuilder.create().texOffs(0, 35).addBox(2.2F, 2.85F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.6109F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition D2_2 = RightLeg.addOrReplaceChild("D2_2",
				CubeListBuilder.create().texOffs(0, 35).addBox(5.85F, 5.8F, -0.59F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.6109F));
		PartDefinition D10_2 = RightLeg.addOrReplaceChild("D10_2",
				CubeListBuilder.create().texOffs(0, 35).addBox(2.5F, 5.05F, 2.11F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.6109F));
		PartDefinition D6_2 = RightLeg.addOrReplaceChild("D6_2",
				CubeListBuilder.create().texOffs(0, 35).addBox(-2.3F, 5.1F, -4.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));
		PartDefinition D11_2 = RightLeg.addOrReplaceChild("D11_2",
				CubeListBuilder.create().texOffs(0, 35).addBox(-6.88F, 5.8F, -0.42F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, -0.6109F));
		PartDefinition D15_2 = RightLeg.addOrReplaceChild("D15_2",
				CubeListBuilder.create().texOffs(0, 35).addBox(1.3F, 5.1F, -4.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));
		PartDefinition D1_2 = RightLeg.addOrReplaceChild("D1_2",
				CubeListBuilder.create().texOffs(0, 35).addBox(-3.5F, 5.05F, -3.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, -0.6109F));
		PartDefinition D13_2 = RightLeg.addOrReplaceChild("D13_2",
				CubeListBuilder.create().texOffs(0, 35).addBox(1.3F, 5.1F, 3.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition DLEG4 = RightLeg.addOrReplaceChild("DLEG4",
				CubeListBuilder.create().texOffs(50, 70).addBox(-2.0F, 6.0F, 1.2F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition D9_2 = RightLeg.addOrReplaceChild("D9_2",
				CubeListBuilder.create().texOffs(0, 35).addBox(-3.5F, 5.05F, 2.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.6109F));
		PartDefinition D16_2 = RightLeg.addOrReplaceChild("D16_2",
				CubeListBuilder.create().texOffs(0, 35).addBox(1.3F, 5.8F, 5.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition D3_2 = RightLeg.addOrReplaceChild("D3_2",
				CubeListBuilder.create().texOffs(0, 35).addBox(2.5F, 5.05F, -3.11F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.6109F));
		PartDefinition D7_2 = RightLeg.addOrReplaceChild("D7_2",
				CubeListBuilder.create().texOffs(0, 35).addBox(-2.3F, 5.8F, -6.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));
		PartDefinition D12_2 = RightLeg.addOrReplaceChild("D12_2",
				CubeListBuilder.create().texOffs(0, 35).addBox(5.85F, 5.8F, -0.41F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.6109F));
		PartDefinition D8_2 = RightLeg.addOrReplaceChild("D8_2",
				CubeListBuilder.create().texOffs(0, 35).addBox(-2.3F, 5.8F, 5.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition D14_2 = RightLeg.addOrReplaceChild("D14_2",
				CubeListBuilder.create().texOffs(0, 35).addBox(1.3F, 5.8F, -6.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));
		PartDefinition DLEG2 = RightLeg.addOrReplaceChild("DLEG2",
				CubeListBuilder.create().texOffs(71, 70).addBox(-2.2F, 6.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition DLEG3 = RightLeg.addOrReplaceChild("DLEG3", CubeListBuilder.create().texOffs(71, 70).mirror()
				.addBox(1.2F, 6.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition DLEG1 = RightLeg.addOrReplaceChild("DLEG1",
				CubeListBuilder.create().texOffs(50, 70).addBox(-2.0F, 6.0F, -2.2F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition D4_2 = RightLeg.addOrReplaceChild("D4_2",
				CubeListBuilder.create().texOffs(0, 35).addBox(-6.88F, 5.8F, -0.58F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.6109F));
		PartDefinition D5_2 = RightLeg.addOrReplaceChild("D5_2",
				CubeListBuilder.create().texOffs(0, 35).addBox(-2.3F, 5.1F, 3.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(0, 16).mirror()
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition D8_3 = LeftLeg.addOrReplaceChild("D8_3",
				CubeListBuilder.create().texOffs(0, 35).addBox(1.3F, 5.8F, 5.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition D12_3 = LeftLeg.addOrReplaceChild("D12_3",
				CubeListBuilder.create().texOffs(0, 35).addBox(5.85F, 5.8F, -0.41F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.6109F));
		PartDefinition D7_3 = LeftLeg.addOrReplaceChild("D7_3",
				CubeListBuilder.create().texOffs(0, 35).addBox(1.3F, 5.8F, -6.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));
		PartDefinition D13_3 = LeftLeg.addOrReplaceChild("D13_3",
				CubeListBuilder.create().texOffs(0, 35).addBox(-2.3F, 5.1F, 3.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition D14_3 = LeftLeg.addOrReplaceChild("D14_3",
				CubeListBuilder.create().texOffs(0, 35).addBox(-2.3F, 5.1F, -4.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));
		PartDefinition D1_3 = LeftLeg.addOrReplaceChild("D1_3",
				CubeListBuilder.create().texOffs(0, 35).addBox(-3.5F, 5.05F, -3.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, -0.6109F));
		PartDefinition DLEG3_1 = LeftLeg.addOrReplaceChild("DLEG3_1",
				CubeListBuilder.create().texOffs(71, 70).addBox(-2.2F, 6.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition D15_3 = LeftLeg.addOrReplaceChild("D15_3",
				CubeListBuilder.create().texOffs(0, 35).addBox(-2.3F, 5.8F, -6.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));
		PartDefinition DLEG2_1 = LeftLeg.addOrReplaceChild("DLEG2_1", CubeListBuilder.create().texOffs(71, 70).mirror()
				.addBox(1.2F, 6.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition D4_3 = LeftLeg.addOrReplaceChild("D4_3",
				CubeListBuilder.create().texOffs(0, 35).addBox(-6.88F, 5.8F, -0.58F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.6109F));
		PartDefinition D3_3 = LeftLeg.addOrReplaceChild("D3_3",
				CubeListBuilder.create().texOffs(0, 35).addBox(2.5F, 5.05F, -3.11F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.6109F));
		PartDefinition D16_3 = LeftLeg.addOrReplaceChild("D16_3",
				CubeListBuilder.create().texOffs(0, 35).addBox(-2.3F, 5.8F, 5.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition D9_3 = LeftLeg.addOrReplaceChild("D9_3",
				CubeListBuilder.create().texOffs(0, 35).addBox(-3.5F, 5.05F, 2.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.6109F));
		PartDefinition D10_3 = LeftLeg.addOrReplaceChild("D10_3",
				CubeListBuilder.create().texOffs(0, 35).addBox(2.5F, 5.05F, 2.11F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.6109F));
		PartDefinition DLEG1_1 = LeftLeg.addOrReplaceChild("DLEG1_1",
				CubeListBuilder.create().texOffs(50, 70).addBox(-2.0F, 6.0F, -2.2F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition D2_3 = LeftLeg.addOrReplaceChild("D2_3",
				CubeListBuilder.create().texOffs(0, 35).addBox(5.85F, 5.8F, -0.59F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.6109F));
		PartDefinition DLEG4_1 = LeftLeg.addOrReplaceChild("DLEG4_1", CubeListBuilder.create().texOffs(50, 70).mirror()
				.addBox(-2.0F, 6.0F, 1.2F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition D6_3 = LeftLeg.addOrReplaceChild("D6_3",
				CubeListBuilder.create().texOffs(0, 35).addBox(1.3F, 5.1F, -4.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));
		PartDefinition D11_3 = LeftLeg.addOrReplaceChild("D11_3",
				CubeListBuilder.create().texOffs(0, 35).addBox(-6.88F, 5.8F, -0.42F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, -0.6109F));
		PartDefinition D5_3 = LeftLeg.addOrReplaceChild("D5_3",
				CubeListBuilder.create().texOffs(0, 35).addBox(1.3F, 5.1F, 3.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));
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
