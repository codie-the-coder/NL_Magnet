package org.codiethecoder.nextland.magnet;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;

@EventBusSubscriber(modid = Magnet.MODID, bus = EventBusSubscriber.Bus.MOD)
public class Config {
    @SubscribeEvent
    static void onLoad(final ModConfigEvent event) {}
}