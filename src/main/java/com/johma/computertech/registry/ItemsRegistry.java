package com.johma.computertech.registry;

import com.johma.computertech.ComputerTech;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.johma.computertech.registry.CreativeRegistry.addToTab;

public class ItemsRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ComputerTech.MODID);

    public static final RegistryObject<Item> CPU_genONE = addToTab(ITEMS.register("cpu_genone", () -> new Item(new Item.Properties().stacksTo(32).rarity(Rarity.RARE))));
}
