package aqario.oubliette.block;

import aqario.oubliette.Oubliette;
import aqario.oubliette.block.blocks.IronGateBlock;
import aqario.oubliette.block.blocks.IronGrateBlock;
import aqario.oubliette.block.blocks.ModStairsBlock;
import aqario.oubliette.item.OublietteGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlock {

    public static final net.minecraft.block.Block IRON_PLATING = registerBlock("iron_plating",
            new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).mapColor(MapColor.IRON_GRAY).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.COPPER)), OublietteGroup.OUBLIETTE);

    public static final net.minecraft.block.Block TARNISHED_IRON_PLATING = registerBlock("tarnished_iron_plating",
            new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.of(Material.METAL).mapColor(MapColor.DULL_RED).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.COPPER)), OublietteGroup.OUBLIETTE);

    public static final net.minecraft.block.Block AGED_BRICKS = registerBlock("aged_bricks",
            new net.minecraft.block.Block(FabricBlockSettings.of(Material.STONE).mapColor(MapColor.TERRACOTTA_BROWN).requiresTool().strength(1500.0f, 6000.0f).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)), OublietteGroup.OUBLIETTE);

    public static final net.minecraft.block.Block CHISELED_AGED_BRICKS = registerBlock("chiseled_aged_bricks",
            new net.minecraft.block.Block(FabricBlockSettings.of(Material.STONE).mapColor(MapColor.TERRACOTTA_BROWN).requiresTool().strength(1500.0f, 6000.0f).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)), OublietteGroup.OUBLIETTE);

    public static final net.minecraft.block.Block AGED_BRICK_SLAB = registerBlock("aged_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).mapColor(MapColor.TERRACOTTA_BROWN).requiresTool().strength(1500.0f, 6000.0f).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)), OublietteGroup.OUBLIETTE);

    public static final net.minecraft.block.Block AGED_BRICK_STAIRS = registerBlock("aged_brick_stairs",
            new ModStairsBlock(ModBlock.AGED_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).mapColor(MapColor.TERRACOTTA_BROWN).requiresTool().strength(1500.0f, 6000.0f).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)), OublietteGroup.OUBLIETTE);

    public static final net.minecraft.block.Block AGED_BRICK_WALL = registerBlock("aged_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).mapColor(MapColor.TERRACOTTA_BROWN).requiresTool().strength(1500.0f, 6000.0f).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)), OublietteGroup.OUBLIETTE);

    public static final net.minecraft.block.Block IRON_GATE = registerBlock("iron_gate",
            new IronGateBlock(FabricBlockSettings.of(Material.METAL).mapColor(MapColor.CLEAR).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL).nonOpaque()), OublietteGroup.OUBLIETTE);

    public static final net.minecraft.block.Block IRON_GRATE = registerBlock("iron_grate",
            new IronGrateBlock(FabricBlockSettings.of(Material.METAL).mapColor(MapColor.CLEAR).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL).nonOpaque()), OublietteGroup.OUBLIETTE);


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
        Oubliette.LOGGER.info("Registering Blocks for " + Oubliette.MODID);
    }
}
