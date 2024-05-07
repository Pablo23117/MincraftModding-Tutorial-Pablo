package net.pabloaran.tutorialmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab("tutorialtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ZIRCON.get());
        }
    };

    // To add another creative mode tab you just repeat the process above
    // something like this
//    public static final CreativeModeTab TUTORIAL_TAB_2= new CreativeModeTab("tutorialtab") {
//        @Override
//        public ItemStack makeIcon() {
//            return new ItemStack(ModItems.ZIRCON.get());
//        }
//    };
}
