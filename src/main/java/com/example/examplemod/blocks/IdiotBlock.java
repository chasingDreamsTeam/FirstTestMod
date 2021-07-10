package com.example.examplemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.state.IntegerProperty;

import java.util.function.ToIntFunction;

public class IdiotBlock extends Block {

    public static ToIntFunction<BlockState> lightLevel = BlockState -> 15;

    public IdiotBlock() {

        super(Properties.of(Material.METAL)
                .sound(SoundType.METAL)
                .strength(2.0f)
                .lightLevel(lightLevel)
        );


        setRegistryName("idiotblock");

    }
}
