package net.sefacestudios.somemoreblocks.registries;

import net.fabricmc.fabric.api.registry.FuelValueEvents;
import net.fabricmc.fabric.api.registry.LandPathTypeRegistry;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.minecraft.world.level.pathfinder.PathType;
import net.sefacestudios.somemoreblocks.Constants;

public class CommonRegistries {

  public static void init() {
    CommonRegistries.registerPathNodeTypes();
    CommonRegistries.registerFuels();
    CommonRegistries.registerWeatheringCopperBlocks();
  }

  private static void registerPathNodeTypes() {
    LandPathTypeRegistry.register(SMBBlocks.TINY_CACTUS.get(), (s, n) -> PathType.DAMAGING);
    LandPathTypeRegistry.register(SMBBlocks.TALL_CACTUS.get(), (s, n) -> PathType.DAMAGING);
  }

 /**
  * Registers Fuel values.
  */
  private static void registerFuels() {
    FuelValueEvents.BUILD.register((builder, ctx) -> {
      builder.add(SMBBlocks.COAL_BRICKS.get(), Constants.COAL_BRICKS_FUEL);
      builder.add(SMBBlocks.CRACKED_COAL_BRICKS.get(), Constants.CRACKED_COAL_BRICKS_FUEL);
      builder.add(SMBBlocks.COAL_PILLAR.get(), Constants.COAL_PILLAR_FUEL);
      builder.add(SMBBlocks.CUT_COAL.get(), Constants.CUT_COAL_FUEL);
      builder.add(SMBBlocks.CRACKED_CUT_COAL.get(), Constants.CRACKED_CUT_COAL_FUEL);
      builder.add(SMBItems.CLOVER.get(), Constants.CLOVER_FUEL);
    });
  }

  private static void registerWeatheringCopperBlocks() {
    OxidizableBlocksRegistry.registerWeatheringCopperBlocks(SMBBlocks.COPPER_BRICKS.get());
    OxidizableBlocksRegistry.registerWeatheringCopperBlocks(SMBBlocks.CRACKED_COPPER_BRICKS.get());
    OxidizableBlocksRegistry.registerWeatheringCopperBlocks(SMBBlocks.CRACKED_CUT_COPPER.get());
    OxidizableBlocksRegistry.registerWeatheringCopperBlocks(SMBBlocks.COPPER_PILLAR.get());
  }
}
