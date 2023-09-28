package com.example;

import com.example.init.ModBubbles;
import com.ultreon.bubbles.BubbleBlaster;
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
    }

    private void started(BubbleBlaster game) {

    }
}
