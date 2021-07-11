package com.example.examplemod.items;

import com.example.examplemod.ExampleMod;
import net.minecraft.item.Item;

public class IdiotItem extends Item {

    public IdiotItem() {
        super(new Item.Properties()
                .stacksTo(4)
                .tab(ExampleMod.modSetUp.itemGroup));
        this.setRegistryName("idiotitem");
    }
}
