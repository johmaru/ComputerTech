package com.johma.computertech.registry;

import com.johma.computertech.ComputerTech;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.johma.computertech.registry.CreativeRegistry.addToTab;

public class ItemsRegistry {

    static final int SmallFoodEffects = 20 * 90; // 1:30
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ComputerTech.MODID);

    public static final RegistryObject<Item> CPU_genONE = addToTab(ITEMS.register("cpu_genone", () -> new Item(new Item.Properties().stacksTo(32).rarity(Rarity.RARE))));

    public static final RegistryObject<Item> Salt_Item = addToTab(ITEMS.register("salt_item", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON).food(new FoodProperties.Builder().nutrition(0).saturationMod(0).effect(() -> new MobEffectInstance(MobEffects.HUNGER, SmallFoodEffects, 1),1).build()).rarity(Rarity.UNCOMMON))));

    public static final RegistryObject<BlockItem> saltWater_Dryer = addToTab(ITEMS.register("water_dryer_item", () -> new BlockItem(BlocksRegistry.SALTWATER_DRYER.get(), new Item.Properties().stacksTo(32).rarity(Rarity.COMMON))));
}
