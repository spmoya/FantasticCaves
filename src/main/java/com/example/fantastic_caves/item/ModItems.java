package com.example.fantastic_caves.item;

import com.example.fantastic_caves.Fantasticcaves;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;



public class ModItems {

    // =========================
    // Items
    // =========================

    public static final Item SUSPICIOUS_POWDER = registerItem("suspicious_powder", new Item(new Item.Settings()));




    // =========================
    // Helper Methods
    // =========================

    // Helper method to register a new Item in the game's registry.
    // The method is private because it's only intended for internal use within this class.
    private static Item registerItem(String name, Item item) {

        // Calls the core registration method provided by the game framework (Registry.register).
        return Registry.register(
                Registries.ITEM, // Specifies that we are registering an item.
                // Creates a unique identifier for the item using the mod's ID and the item's name
                // (e.g., fantasticcaves:crystal_shard).
                Identifier.of(Fantasticcaves.MOD_ID, name),
                item // The actual Item instance to be added to the game.
        );
    }

    // The main public method for initiating the registration of all custom items in the mod.
    // This is typically called once during the mod's initialization process.
    public static void registerModItems() {
        // Logs a message to the game console/log to confirm that the item registration process has begun
        // for the specific mod ID.
        Fantasticcaves.LOGGER.info("Registering Mod Items for " + Fantasticcaves.MOD_ID);

        // Custom items would be registered here by calling the registerItem helper method, e.g.:
        // registerItem("custom_ore", new BlockItem(ModBlocks.CUSTOM_ORE, new Item.Settings()));
        // registerItem("magic_orb", new Item(new Item.Settings().maxCount(1)));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(SUSPICIOUS_POWDER);
        });
    }

}
