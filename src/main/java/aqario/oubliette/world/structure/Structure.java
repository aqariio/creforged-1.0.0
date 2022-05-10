package aqario.oubliette.world.structure;

import aqario.oubliette.Oubliette;
import aqario.oubliette.mixin.ExampleMixin;
import aqario.oubliette.world.structure.structures.OublietteStructure;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.StructureFeature;

public class Structure {

    /**
    /**
     * Registers the structure itself and sets what its path is. In this case, the
     * structure will have the Identifier of oubliette:sky_structures.
     *
     * It is always a good idea to register your Structures so that other mods and datapacks can
     * use them too directly from the registries. It is great for mod/datapacks compatibility.
     */
    public static StructureFeature<?> OUBLIETTE = new OublietteStructure();

    public static void registerStructureFeatures() {
        // The generation step for when to generate the structure. there are 10 stages you can pick from!
        // This surface structure stage places the structure before plants and ores are generated.
        ExampleMixin.callRegister(Oubliette.MODID + ":oubliette", OUBLIETTE, GenerationStep.Feature.STRONGHOLDS);
    }
}
