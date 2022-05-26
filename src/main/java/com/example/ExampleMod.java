package com.example;

import com.example.init.ModBubbles;
import com.ultreon.bubbles.common.mod.Mod;
import com.ultreon.bubbles.common.mod.ModInstance;
import com.ultreon.bubbles.event.SubscribeEvent;
import com.ultreon.bubbles.event.bus.GameEvents;
import com.ultreon.bubbles.event.load.ModSetupEvent;
import com.ultreon.bubbles.mod.loader.ModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modId = ExampleMod.MOD_ID)
public class ExampleMod extends ModInstance {
    public static final String MOD_ID = "com.example.mod";

    public static final Logger LOGGER = LogManager.getLogger("ExampleMod");

    public ExampleMod() {
        super(LOGGER, MOD_ID, null);

        ModLoadingContext.get().getEvents().subscribe(this);
    }

    @SubscribeEvent
    public void onModSetup(ModSetupEvent event) {
        ModBubbles.register(GameEvents.get());
    }
}
