
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.poopytestmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.poopytestmod.item.FunneItem;
import net.mcreator.poopytestmod.item.CherryBlossomItem;
import net.mcreator.poopytestmod.PoopytestmodMod;

public class PoopytestmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PoopytestmodMod.MODID);
	public static final RegistryObject<Item> CHERRY_FLOWERS = block(PoopytestmodModBlocks.CHERRY_FLOWERS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FUNNE = REGISTRY.register("funne", () -> new FunneItem());
	public static final RegistryObject<Item> CHERRY_BLOSSOM = REGISTRY.register("cherry_blossom", () -> new CherryBlossomItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
