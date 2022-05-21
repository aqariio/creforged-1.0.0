package aqario.oubliette.potion;

import aqario.oubliette.Oubliette;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Potion {
    public static net.minecraft.potion.Potion DECAY_POTION;

    public static net.minecraft.potion.Potion registerPotion(String name) {
        return Registry.register(Registry.POTION, new Identifier(Oubliette.MODID, name),
                new net.minecraft.potion.Potion(new StatusEffectInstance(StatusEffects.WITHER, 800, 0)));
    }

    public static void registerPotions() {
        DECAY_POTION = registerPotion("decay");
    }
}
