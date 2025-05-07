package com.blocklogic.bioflux.item;

import com.blocklogic.bioflux.BioFlux;
import com.blocklogic.bioflux.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BioFlux.MODID);

    public static final Supplier<CreativeModeTab> BIOFLUX_CREATIVE_TAB = CREATIVE_MODE_TAB.register("bioflux_creative_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.CAPACITOR_TIER_1.get()))
                    .title(Component.translatable("creativetab.bioflux.bioflux"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BIOMASS);
                        output.accept(ModItems.COMPACTED_BIOMASS);

                        output.accept(ModBlocks.BIOMASS_BURNER);
                        output.accept(ModBlocks.BIOMASS_PROCESSOR);
                        output.accept(ModBlocks.CAPACITOR_TIER_1);
                        output.accept(ModBlocks.CAPACITOR_TIER_2);
                        output.accept(ModBlocks.CAPACITOR_TIER_3);
                    }))


                    .build());

    public static void register (IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
