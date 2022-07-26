package net.hero61.rangersunitedmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class RangersUnitedTabs {
    public static final CreativeModeTab MIGHTY_MORPHIN_TAB = new CreativeModeTab("mightymorphintab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RED_MIGHTY_MORPHIN_MORPHER.get());
        }
    };
   public static final CreativeModeTab ZEO_TAB = new CreativeModeTab("zeotab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RED_MIGHTY_MORPHIN_MORPHER.get());
        }
    };
}
