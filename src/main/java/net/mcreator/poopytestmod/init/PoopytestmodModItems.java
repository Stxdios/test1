
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.poopytestmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.poopytestmod.item.FunneItem;
import net.mcreator.poopytestmod.PoopytestmodMod;

public class PoopytestmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PoopytestmodMod.MODID);
	public static final RegistryObject<Item> FUNNE = REGISTRY.register("funne", () -> new FunneItem());
}
