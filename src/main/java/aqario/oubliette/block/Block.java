package aqario.oubliette.block;

import aqario.oubliette.Oubliette;
import aqario.oubliette.item.OublietteGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.Oxidizable;
import net.minecraft.block.OxidizableBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Block {

    public static final net.minecraft.block.Block IRON_PLATING = registerBlock("iron_plating",
            new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).mapColor(MapColor.IRON_GRAY).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.COPPER)), OublietteGroup.OUBLIETTE);

    public static final net.minecraft.block.Block TARNISHED_IRON_PLATING = registerBlock("tarnished_iron_plating",
            new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.of(Material.METAL).mapColor(MapColor.DULL_RED).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.COPPER)), OublietteGroup.OUBLIETTE);

    public static final net.minecraft.block.Block AGED_BRICKS = registerBlock("aged_bricks",
            new net.minecraft.block.Block(FabricBlockSettings.of(Material.STONE).mapColor(MapColor.TERRACOTTA_BROWN).requiresTool().strength(1500.0f, 6000.0f).sounds(BlockSoundGroup.STONE)), OublietteGroup.OUBLIETTE);

    // Registering Block
    private static net.minecraft.block.Block registerBlock(String name, net.minecraft.block.Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(Oubliette.MODID, name), block);
    }

    // Registering Block Item
    public static Item registerBlockItem(String name, net.minecraft.block.Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(Oubliette.MODID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void initialize() {
        Oubliette.LOGGER.info("Registering Mod Blocks for " + Oubliette.MODID);
    }
}
