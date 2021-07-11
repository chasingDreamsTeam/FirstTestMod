package com.example.examplemod.blocks;

import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.world.World;

import static com.example.examplemod.blocks.ModBlocks.IDIOTBLOCKTILE;

public class IdiotBlockTile extends TileEntity implements ITickableTileEntity {

    public IdiotBlockTile() {
        super(IDIOTBLOCKTILE);
    }

    @Override
    public void tick() {
        assert level != null;
        if(!level.isClientSide){
            System.out.println("Test server clicked!");

        }
    }
}
