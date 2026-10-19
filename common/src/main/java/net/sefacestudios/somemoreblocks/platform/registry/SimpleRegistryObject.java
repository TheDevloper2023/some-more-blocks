package net.sefacestudios.somemoreblocks.platform.registry;

import net.minecraft.resources.Identifier;

import java.util.function.Supplier;

/**
 * A {@link PlatformRegistryObject} for values that aren't themselves a single native registry
 * entry, such as the aggregate {@code ColorCollection}/{@code WeatheringCopperCollection} result
 * of registering several blocks at once.
 */
public class SimpleRegistryObject<T> implements PlatformRegistryObject<T> {

  private final Identifier id;
  private final Supplier<T> supplier;

  public SimpleRegistryObject(Identifier id, Supplier<T> supplier) {
    this.id = id;
    this.supplier = supplier;
  }

  @Override
  public Identifier getId() {
    return this.id;
  }

  @Override
  public T get() {
    return this.supplier.get();
  }
}
