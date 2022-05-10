package aqario.oubliette.item;

import aqario.oubliette.Oubliette;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class OublietteGroup {
    public static final net.minecraft.item.ItemGroup OUBLIETTE = FabricItemGroupBuilder.build(new Identifier(Oubliette.MODID, "oubliette"),
            () -> new ItemStack(Item.RUBY));
}
