package aqario.oubliette.item;

import aqario.oubliette.Oubliette;
import aqario.oubliette.item.items.LightningRodItem;
import aqario.oubliette.item.items.LongbowItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ItemInit {

    public static final net.minecraft.item.Item BEDROCK_FRAGMENT = registerItem("bedrock_fragment",
            new Item(new FabricItemSettings().rarity(Rarity.EPIC)));

    public static final net.minecraft.item.Item BONEBOW = registerItem("bonebow",
            new LongbowItem(new FabricItemSettings().maxDamage(640).group(OublietteGroup.OUBLIETTE)));



    // Registering Item
    private static net.minecraft.item.Item registerItem(String name, net.minecraft.item.Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Oubliette.MODID, name), item);
    }

    public static void initialize() {
        Oubliette.LOGGER.info("Registering Items for " + Oubliette.MODID);
    }

}
