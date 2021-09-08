package com.henrytaj.testmod;

import com.henrytaj.testmod.registry.moditems;
import net.fabricmc.api.ModInitializer;

public class testmod implements ModInitializer {
    public static final String MODID = "testmod";

    @Override
    public void onInitialize() {

        moditems.registerItems();
    }
}