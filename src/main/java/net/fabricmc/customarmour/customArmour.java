package net.fabricmc.customarmour;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.Item;

public class customArmour implements ModInitializer {
	// @Override
	// public void onInitialize() {
	// 	System.out.println("Mod initialized");

	public static final Item TEST_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("test", "test_item"), TEST_ITEM);
	}
}
