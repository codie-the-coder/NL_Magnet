package org.codiethecoder.nextland.magnet.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;


public class Items {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems("nl_magnet");

    public static final DeferredItem<MagnetItem> MAGNET = ITEMS.register("magnet",
            () -> new MagnetItem(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.RARE)
            ));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}