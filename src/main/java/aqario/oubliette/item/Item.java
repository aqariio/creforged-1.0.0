package aqario.oubliette.item;

import aqario.oubliette.Oubliette;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class Item {

    public static final net.minecraft.item.Item RUBY = registerItem("ruby",
            new net.minecraft.item.Item(new FabricItemSettings()));

    public static final net.minecraft.item.Item BEDROCK_FRAGMENT = registerItem("bedrock_fragment",
            new net.minecraft.item.Item(new FabricItemSettings().rarity(Rarity.EPIC)));



    // Registering Item
    private static net.minecraft.item.Item registerItem(String name, net.minecraft.item.Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Oubliette.MODID, name), item);
    }

    public static void initialize() {
        Oubliette.LOGGER.info("Registering Items for " + Oubliette.MODID);
    }

}
