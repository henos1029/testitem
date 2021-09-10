package com.henrytaj.testmod.registry;

import com.henrytaj.testmod.testmod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class modblocks {

    public static final Block TEST_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 4)
            .requiresTool()
            .strength(15f,99999999999999999999999999999999999999f)
            .sounds(BlockSoundGroup.METAL)
            .luminance(999999999)
            .jumpVelocityMultiplier(99999999999999999999999999999999999999f)
            );

    public static void registerBlocks(){
        Registry.register(Registry.BLOCK, new Identifier(testmod.MODID, "test_block"), TEST_BLOCK);
    }
}
