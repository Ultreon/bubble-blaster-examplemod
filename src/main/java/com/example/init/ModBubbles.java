package com.example.init;

import com.example.ExampleMod;
import com.ultreon.bubbles.bubble.AbstractBubble;
import com.ultreon.bubbles.event.bus.GameEvents;
import com.ultreon.bubbles.registry.DelayedRegister;
import com.ultreon.bubbles.registry.Registers;
import com.ultreon.bubbles.registry.object.Registered;
import org.apache.commons.lang.math.DoubleRange;
import org.apache.commons.lang.math.IntRange;

import java.awt.*;

public class ModBubbles {
    private static final DelayedRegister<AbstractBubble> REGISTER = DelayedRegister.create(ExampleMod.MOD_ID, Registers.BUBBLES);

    public static final Registered<AbstractBubble> EXAMPLE = REGISTER.register("Example", () -> AbstractBubble.builder()
            .colors(new Color(0xFF3243), new Color(0x55FF32), new Color(0x3277FF))
            .attack(0.1f)
            .hardness(0.5f)
            .radius(new IntRange(15, 45))
            .priority(5_000_000)
            .speed(new DoubleRange(8.5, 14.5))
            .score(5.0f)
            .build());

    public static void register(GameEvents events) {
        REGISTER.register(events);
    }
}
