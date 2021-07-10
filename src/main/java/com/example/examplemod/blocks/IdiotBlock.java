package com.example.examplemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import java.util.function.ToIntFunction;

public class IdiotBlock extends Block {

    public IdiotBlock() {
        super(Properties.of(Material.METAL)
                .sound(SoundType.METAL)
                .strength(2.0f)
        );
        setRegistryName("idiotblock");
    }
}
