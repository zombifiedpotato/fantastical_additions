package com.github.zombifiedpotato.fantastical_additions.effect;

import com.github.zombifiedpotato.fantastical_additions.Main;
import com.github.zombifiedpotato.fantastical_additions.effect.custom.LightningEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEffects {
    public static final StatusEffect LIGHTNING = Registry.register(Registry.STATUS_EFFECT, new Identifier(Main.MOD_ID, "lightning"),
            new LightningEffect(StatusEffectCategory.HARMFUL, 3335601));

    public static void registerEffects() {
        Main.LOGGER.info("Registering StatusEffects for " + Main.MOD_ID);
    }
}
