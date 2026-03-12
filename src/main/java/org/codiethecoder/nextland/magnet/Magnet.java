package org.codiethecoder.nextland.magnet;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.codiethecoder.nextland.magnet.item.CreativeTabs;
import org.codiethecoder.nextland.magnet.item.Items;

@Mod(Magnet.MODID)
public class Magnet {
    public static final String MODID = "nl_magnet";

    public Magnet(IEventBus modEventBus) {
        Items.register(modEventBus);
        CreativeTabs.CREATIVE_MODE_TAB.register(modEventBus);
    }
}