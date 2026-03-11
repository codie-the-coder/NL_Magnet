package org.codiethecoder.nextland.magnet.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

public class CreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "nl_magnet");

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TAB =
            CREATIVE_MODE_TAB.register("magnet_creative_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.nl_magnet.magnet_creative_tab"))
                    .icon(() -> new ItemStack(Items.MAGNET.get()))
                    .displayItems((parameters, output) -> {
                        output.accept(Items.MAGNET.get());
                    })
                    .build());
}