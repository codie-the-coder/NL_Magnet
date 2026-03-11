package org.codiethecoder.nextland.magnet;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.codiethecoder.nextland.magnet.item.CreativeTabs;
import org.codiethecoder.nextland.magnet.item.Items;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Magnet.MODID)
public class Magnet {
    public static final String MODID = "nl_magnet";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Magnet(IEventBus modEventBus) {
        Items.register(modEventBus);
        CreativeTabs.CREATIVE_MODE_TAB.register(modEventBus);
    }
}