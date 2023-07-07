package com.johma.computertech.registry;

import com.johma.computertech.ComputerTech;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;

import static com.johma.computertech.registry.CreativeRegistry.addToTab;

public class BlocksRegistry {
/*
    @SubscribeEvent
    public static void CreativeModeTabRegister(RegisterEvent event){
        event.register(Registries.CREATIVE_MODE_TAB, helper -> {

            helper.register(TAB_BLOCKS, CreativeModeTab.builder().icon(() -> new ItemStack(BlocksRegistry.SALTWATER_DRYER.get().asItem()))
                            .title(Component.translatable("itemGroup." + ComputerTech.MODID))
                            .displayItems((displayParam, output) -> {
                for (RegistryObject<Block> b : BlocksRegistry.BLOCKS.getEntries()){
                    ItemStack stackStack = new ItemStack(b.get());
                    output.accept(stackStack);
                }
            }).build());
        });
    }
 */

   // private static final ResourceKey<CreativeModeTab> TAB_BLOCKS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(ComputerTech.MODID, "tab"));

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ComputerTech.MODID);

    public static final RegistryObject<Block> SALTWATER_DRYER = BLOCKS.register("water_dryer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANVIL)
                    .mapColor(MapColor.COLOR_BLUE)
                    .strength(7.0f, 15f)
                    .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
            ));
}
