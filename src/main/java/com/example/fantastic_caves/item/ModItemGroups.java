package com.example.fantastic_caves.item;

import com.example.fantastic_caves.Fantasticcaves;
import com.example.fantastic_caves.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup FANTASTIC_CAVES_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Fantasticcaves.MOD_ID, "fantastic_caves_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.GRAPPLING_HOOK))
                    .displayName(Text.translatable("itemGroup.fantastic-caves.fantastic_caves_items"))
                    .entries((displayContext, entries) -> {

                       entries.add(ModItems.GRAPPLING_HOOK);
                       entries.add(ModItems.SUSPICIOUS_POWDER);

                    }).build());

    public static final ItemGroup FANTASTIC_CAVES_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Fantasticcaves.MOD_ID, "fantastic_caves_blocks"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.CONDENSED_DIRT))
                    .displayName(Text.translatable("itemGroup.fantastic-caves.fantastic_caves_blocks"))
                    .entries((displayContext, entries) -> {

                       entries.add(ModBlocks.CONDENSED_DIRT);

                    }).build());

    public static void registerItemGroup () {
        Fantasticcaves.LOGGER.info("Registering Item Groups for " + Fantasticcaves.MOD_ID);
    }
}
