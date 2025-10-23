package com.example.fantastic_caves.block;

import com.example.fantastic_caves.Fantasticcaves;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    // =========================
    // Mod Blocks
    // =========================

    public static final Block CONDENSED_DIRT = registerBlock(
            "condensed_dirt",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(2f)
                    .sounds(BlockSoundGroup.GRASS))
    );

    // =========================
    // Helper Methods
    // =========================

    // Helper method to register a new Block in the game's registry.
    // It automatically handles registering the BlockItem as well, so the block can be placed and held.
    private static Block registerBlock(String name, Block block){
        // 1. Calls the helper method to register the BlockItem first.
        registerBlockItem(name, block);

        // 2. Registers the Block itself into the game's official Block Registry.
        return Registry.register(
                Registries.BLOCK, // Specifies the Block Registry.
                // Creates a unique identifier for the block (e.g., fantasticcaves:custom_block).
                Identifier.of(Fantasticcaves.MOD_ID, name),
                block // The actual Block object.
        );
    }

    // Helper method to register the BlockItem associated with a given Block.
    // This item is what the player holds in their inventory.
    private static void registerBlockItem(String name, Block block){
        // Registers the item form of the block into the Item Registry.
        Registry.register(
                Registries.ITEM, // Specifies the Item Registry.
                Identifier.of(Fantasticcaves.MOD_ID, name), // Uses the same ID as the block.
                new BlockItem(block, new Item.Settings()) // Creates a new BlockItem linked to the specified block.
        );
    }

    // The main public method for initiating the registration of all custom blocks in the mod.
    // This should be called during the mod's initialization sequence.
    public static void registerModBlocks(){
        // Logs an informational message to the console confirming that the block registration process has started.
        Fantasticcaves.LOGGER.info("Registering Mod Blocks for " + Fantasticcaves.MOD_ID);

        // NOTE: All static block declarations (e.g., public static final Block CUSTOM_BLOCK)
        // would implicitly call 'registerBlock()' from here or elsewhere in the class.

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.CONDENSED_DIRT);
        });
    }
}