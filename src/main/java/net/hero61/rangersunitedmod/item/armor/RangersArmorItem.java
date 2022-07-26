package net.hero61.rangersunitedmod.item.armor;

import net.hero61.rangersunitedmod.RangersUnitedMod;
import net.hero61.rangersunitedmod.client.renderer.RangersRenderEvents;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;

import javax.annotation.Nullable;
import java.util.function.Consumer;

public class RangersArmorItem extends ArmorItem {
    private HumanoidModel armorModel = null;
    private String armorTexture = null;

    public RangersArmorItem(ArmorMaterial p_i48534_1_, EquipmentSlot p_i48534_2_, Properties p_i48534_3_) {
        super(p_i48534_1_, p_i48534_2_, p_i48534_3_);
    }

    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        return armorTexture;
    }

    public RangersArmorItem setArmorModel(HumanoidModel<? extends LivingEntity> armorModel) {
        this.armorModel = armorModel;
        return this;
    }


    public RangersArmorItem setArmorTexture(String armorTexture) {
        this.armorTexture = RangersUnitedMod.MOD_ID + ":" + armorTexture;
        return this;
    }


    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        super.initializeClient(consumer);
        consumer.accept(new IClientItemExtensions() {

            @Override
            public BlockEntityWithoutLevelRenderer getCustomRenderer()
            {
                return RangersRenderEvents.RANGERS_RENDERER;
            }

            @Override
            public HumanoidModel getHumanoidArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlot armorSlot, HumanoidModel _default) {
                return armorModel;
            }
        });
    }
}
