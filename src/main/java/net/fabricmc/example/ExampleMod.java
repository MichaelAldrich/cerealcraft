package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.tem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;

public class ExampleMod implements ModInitializer {

	public static final Item dry_cereal_item = new Item(new Item.Settings().itemGroup(ItemGroup.MISC));
	public static final Item cereal_bowl_item = new Item(new Item.Settings().itemGroup(ItemGroup.MISC));
	public static final Item milk_and_cereal_item = new Item(new Item.Settings().itemGroup(ItemGroup.FOOD));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Hello Fabric world!");

		Registry.register(Registry.ITEM, new Identifier("cerealcraft", "dry_cereal"), dry_cereal_item);
		Registry.register(Registry.ITEM, new Identifier("cerealcraft", "cereal_bowl"), cereal_bowl_item);
		Registry.register(Registry.ITEM, new Identifier("cerealcraft", "milk_and_cereal"), milk_and_cereal_item);
	}
}
