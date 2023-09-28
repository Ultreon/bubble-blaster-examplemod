package com.example;

import com.example.init.ModBubbles;
import com.ultreon.bubbles.BubbleBlaster;
import com.ultreon.bubbles.event.v1.GameEvents;
import com.ultreon.bubbles.event.v1.WindowEvents;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {
    public static final String MOD_ID = "examplemod";
    public static final Logger LOGGER = LoggerFactory.getLogger("ExampleMod");

    public ExampleMod() {

    }

    @Override
    public void onInitialize() {
        ModBubbles.register();

        GameEvents.CLIENT_STARTED.listen(game -> LOGGER.info("Hello world from 'CLIENT_STARTED' event!"));
        GameEvents.CLIENT_STARTED.listen(ExampleMod::onClientStarted);
    }

    private static void onClientStarted(BubbleBlaster game) {
        LOGGER.info("Hello world from onClientStarted method!");
    }
}
