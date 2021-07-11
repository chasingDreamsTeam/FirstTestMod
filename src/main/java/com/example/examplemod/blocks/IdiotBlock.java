package com.example.examplemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.registries.ObjectHolder;

import javax.annotation.Nullable;
import java.util.function.ToIntFunction;

public class IdiotBlock extends Block {

    public static ToIntFunction<BlockState> lightLevel = BlockState -> 15;

    public IdiotBlock() {

        super(Properties.of(Material.METAL)
                .sound(SoundType.METAL)
                .strength(2.0f)
                .lightLevel(lightLevel)
        );


        this.setRegistryName("idiotblock");

    }

    @Override
    public void setPlacedBy(World world, BlockPos pos, BlockState state, @Nullable LivingEntity entity, ItemStack stack){
        if(entity != null){
            world.setBlock(pos, state.setValue(BlockStateProperties.FACING, getFacingFromEntity(pos, entity)), 2);
        }
    }

    public static Direction getFacingFromEntity(BlockPos clickedBlock, LivingEntity entity){
        return Direction.getNearest((float) (entity.getX() - clickedBlock.getX()),(float) (entity.getY() - clickedBlock.getY()),(float) (entity.getZ() - clickedBlock.getZ()));
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder){
        builder.add(BlockStateProperties.FACING);
    }
}
