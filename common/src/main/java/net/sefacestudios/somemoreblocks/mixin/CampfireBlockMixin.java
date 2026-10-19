package net.sefacestudios.somemoreblocks.mixin;

import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.sefacestudios.somemoreblocks.registries.SMBBlocks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(CampfireBlock.class)
public abstract class CampfireBlockMixin {

  @Inject(method = "isSmokeSource", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/state/BlockState;is(Ljava/lang/Object;)Z"), cancellable = true)
  private void isSmokeSouceMixin(BlockState blockState, CallbackInfoReturnable<Boolean> cir) {
    cir.setReturnValue(blockState.is(SMBBlocks.REED_BALE.get()));
  }
}
