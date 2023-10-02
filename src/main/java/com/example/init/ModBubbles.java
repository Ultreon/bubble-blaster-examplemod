package com.example.init;

import com.example.ExampleMod;
import com.ultreon.bubbles.bubble.BubbleType;
import com.ultreon.bubbles.registry.Registries;
import com.ultreon.libs.registries.v0.DelayedRegister;
import com.ultreon.libs.registries.v0.RegistrySupplier;

public class ModBubbles {
    private static final DelayedRegister<BubbleType> REGISTER = DelayedRegister.create(ExampleMod.MOD_ID, Registries.BUBBLES);

    public static final RegistrySupplier<BubbleType> EXAMPLE = REGISTER.register("example", () -> BubbleType.builder()
            .colors("#FF3243,#55FF32,#3277FF")
            .attack(0.1f)
            .hardness(0.5f)
            .radius(15, 45)
            .priority(5_000_000)
            .speed(8.5, 14.5)
            .score(5.0f)
            .build());

    public static void register() {
        REGISTER.register();
    }
}
