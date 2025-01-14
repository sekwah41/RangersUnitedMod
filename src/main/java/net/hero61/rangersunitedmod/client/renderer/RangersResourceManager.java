package net.hero61.rangersunitedmod.client.renderer;

import net.hero61.rangersunitedmod.client.models.armor.mightymorphin.ModelMightyMorphinRed;
import net.hero61.rangersunitedmod.item.RangersItems;
import net.hero61.rangersunitedmod.item.armor.RangersArmorItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.server.packs.resources.ResourceManager;

public class RangersResourceManager extends BlockEntityWithoutLevelRenderer {
    public RangersResourceManager() {
        super(null, null);
    }

        public void onResourceManagerReload(ResourceManager resourceManager) {
            EntityModelSet modelSet = Minecraft.getInstance().getEntityModels();

            ((RangersArmorItem) RangersItems.RED_MIGHTY_MORPHIN.get())
                    .setArmorModel(new ModelMightyMorphinRed<>(modelSet.bakeLayer(ModelMightyMorphinRed.LAYER_LOCATION)))
                    .setArmorTexture("textures/models/armor/akatsuki_cloak.png");


        }
}
