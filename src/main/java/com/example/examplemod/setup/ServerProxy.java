package com.example.examplemod.setup;

import net.minecraft.world.World;

public class ServerProxy implements IProxy {


    @Override
    public World getClientWorld() {
        throw  new IllegalStateException("Access this on client only!");
    }
}
