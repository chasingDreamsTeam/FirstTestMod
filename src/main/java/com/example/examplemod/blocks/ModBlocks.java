package com.example.examplemod.blocks;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;

public class ModBlocks {
    @ObjectHolder("examplemod:idiotblock")
    public static IdiotBlock IDIOTBLOCK;

    @ObjectHolder("examplemod:idiotblock")
    public static TileEntityType<IdiotBlockTile> IDIOTBLOCKTILE;

}
