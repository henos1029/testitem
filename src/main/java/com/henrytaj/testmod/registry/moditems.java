package com.henrytaj.testmod.registry;

import com.henrytaj.testmod.testmod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class moditems {

    public static final Item TEST_ITEM = new Item(new Item.Settings().group(ItemGroup.MISC));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(testmod.MODID, "test_item"), TEST_ITEM);
    }
}
