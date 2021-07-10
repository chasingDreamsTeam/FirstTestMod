package com.example.examplemod.setup;

import com.example.examplemod.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetUp {
    public ItemGroup itemGroup = new ItemGroup("examplemod") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.IDIOTBLOCK);
        }
    };

    public void init(){

    }
}
