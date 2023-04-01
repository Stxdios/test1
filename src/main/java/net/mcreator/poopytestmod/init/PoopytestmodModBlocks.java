
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.poopytestmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.poopytestmod.block.CherryFlowersBlock;
import net.mcreator.poopytestmod.PoopytestmodMod;

public class PoopytestmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PoopytestmodMod.MODID);
	public static final RegistryObject<Block> CHERRY_FLOWERS = REGISTRY.register("cherry_flowers", () -> new CherryFlowersBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			CherryFlowersBlock.blockColorLoad(event);
		}
	}
}
