package com.blocklogic.bioflux.item;

import com.blocklogic.bioflux.BioFlux;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BioFlux.MODID);

    public static final DeferredItem<Item> BIOMASS = ITEMS.register("biomass",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> COMPACTED_BIOMASS = ITEMS.register("compacted_biomass",
            () -> new Item(new Item.Properties()));

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
