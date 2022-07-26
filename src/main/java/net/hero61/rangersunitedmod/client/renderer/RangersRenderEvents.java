package net.hero61.rangersunitedmod.client.renderer;


import net.hero61.rangersunitedmod.RangersUnitedMod;
import net.hero61.rangersunitedmod.client.models.armor.mightymorphin.ModelMightyMorphinRed_model;;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterClientReloadListenersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(value=Dist.CLIENT, modid=RangersUnitedMod.MOD_ID, bus= Mod.EventBusSubscriber.Bus.MOD)
public class RangersRenderEvents {

    public static final BlockEntityWithoutLevelRenderer RANGERS_RENDERER = new RangersResourceManager();


    @SubscribeEvent
    public static void reloadListener(RegisterClientReloadListenersEvent event) {
        event.registerReloadListener(new RangersResourceManager());
    }

    @SubscribeEvent
    public static void layerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event)
    {
        //Mighty Morphin
        event.registerLayerDefinition(ModelMightyMorphinRed_model.LAYER_LOCATION, ModelMightyMorphinRed_model::createLayer);
        
     
    }

   /* @SubscribeEvent
    public static void entityLayers(EntityRenderersEvent.AddLayers event)
    {
        LivingEntityRenderer<Player, ? extends EntityModel<Player>> renderer = event.getRenderer(EntityType.PLAYER);
    }*/


}