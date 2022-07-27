package net.hero61.rangersunitedmod.item;

import net.hero61.rangersunitedmod.RangersUnitedMod;
import net.hero61.rangersunitedmod.item.armor.RangersArmorItem;
import net.hero61.rangersunitedmod.item.armor.RangersArmorMaterial;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RangersItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RangersUnitedMod.MOD_ID);

//Mighty Morphin
    public static final RegistryObject<Item> RED_MIGHTY_MORPHIN_MORPHER =ITEMS.register("red_mighty_morphin_morpher",
            () -> new Item(new Item.Properties().tab(RangersUnitedTabs.MIGHTY_MORPHIN_TAB).stacksTo(1).fireResistant().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> BLUE_MIGHTY_MORPHIN_MORPHER =ITEMS.register("blue_mighty_morphin_morpher",
            () -> new Item(new Item.Properties().tab(RangersUnitedTabs.MIGHTY_MORPHIN_TAB).stacksTo(1).fireResistant().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> BLACK_MIGHTY_MORPHIN_MORPHER =ITEMS.register("black_mighty_morphin_morpher",
            () -> new Item(new Item.Properties().tab(RangersUnitedTabs.MIGHTY_MORPHIN_TAB).stacksTo(1).fireResistant().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> GREEN_MIGHTY_MORPHIN_MORPHER =ITEMS.register("green_mighty_morphin_morpher",
            () -> new Item(new Item.Properties().tab(RangersUnitedTabs.MIGHTY_MORPHIN_TAB).stacksTo(1).fireResistant().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> PINK_MIGHTY_MORPHIN_MORPHER =ITEMS.register("pink_mighty_morphin_morpher",
            () -> new Item(new Item.Properties().tab(RangersUnitedTabs.MIGHTY_MORPHIN_TAB).stacksTo(1).fireResistant().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> YELLOW_MIGHTY_MORPHIN_MORPHER =ITEMS.register("yellow_mighty_morphin_morpher",
            () -> new Item(new Item.Properties().tab(RangersUnitedTabs.MIGHTY_MORPHIN_TAB).stacksTo(1).fireResistant().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> RED_MIGHTY_MORPHIN = ITEMS.register("red_mighty_morphin",
            () -> new RangersArmorItem(RangersArmorMaterial.MIGHTY_MORPHIN, EquipmentSlot.HEAD, new Item.Properties().tab(RangersUnitedTabs.MIGHTY_MORPHIN_TAB)));

   /*public static final RegistryObject<Item> RED_MIGHTY_MORPHIN_CHESTPLATE = ITEMS.register("red_mighty_morphin_chestplate",
            () -> new ArmorItem(RangersArmorMaterial.MIGHTY_MORPHIN, EquipmentSlot.CHEST, new Item.Properties().tab(RangersUnitedTabs.MIGHTY_MORPHIN_TAB).stacksTo(1)));
    public static final RegistryObject<Item> RED_MIGHTY_MORPHIN_LEGGINGS = ITEMS.register("red_mighty_morphin_leggings",
            () -> new ArmorItem(RangersArmorMaterial.MIGHTY_MORPHIN, EquipmentSlot.LEGS, new Item.Properties().tab(RangersUnitedTabs.MIGHTY_MORPHIN_TAB).stacksTo(1)));
*/
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
