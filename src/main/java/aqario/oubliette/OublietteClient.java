package aqario.oubliette;

import aqario.oubliette.block.BlockInit;
import aqario.oubliette.util.ModelPredicateProvider;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class OublietteClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.IRON_GATE, RenderLayer.getCutout());
        ModelPredicateProvider.registerModels();
    }
}
