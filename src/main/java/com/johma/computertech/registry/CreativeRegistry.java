package com.johma.computertech.registry;

import com.johma.computertech.ComputerTech;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = ComputerTech.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class CreativeRegistry {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ComputerTech.MODID);

    public static final List<Supplier<? extends ItemLike>> ComputerTech_TAB_ITEMS = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> MAIN_TAB = TABS.register("computertech_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.computer_tech_tab"))
                    .icon(ItemsRegistry.CPU_genONE.get()::getDefaultInstance)
                    .displayItems((displayParam, output) -> {
                        ComputerTech_TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get()));
                    })
                    .build()
            );

    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike){
        ComputerTech_TAB_ITEMS.add(itemLike);
        return itemLike;
    }

}
