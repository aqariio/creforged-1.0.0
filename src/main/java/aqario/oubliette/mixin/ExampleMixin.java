package aqario.oubliette.mixin;

import aqario.oubliette.Oubliette;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.StructureFeature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(StructureFeature.class)
public interface ExampleMixin {
    @Invoker
    static <F extends StructureFeature<?>> F callRegister(String name, F structureFeature, GenerationStep.Feature step) {
        throw new UnsupportedOperationException();
    }
}

