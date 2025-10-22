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

    // Declaration of the SUSPICIOUS_POWDER item.
    // It is a static final constant, meaning only one instance exists, and it cannot be reassigned.
    // It is automatically registered when the class is initialized.
    public static final Item SUSPICIOUS_POWDER = registerItem("suspicious_powder", new Item(new Item.Settings()));




    // =========================
    // Helper Methods
    // =========================

    // Helper method to register a new Item in the game's registry.
    // The method is private because it's only intended for internal use within this class
    // to keep the registration logic encapsulated.
    private static Item registerItem(String name, Item item) {

        // Calls the core registration method provided by the game framework (Registry.register).
        // This is the crucial step that adds the item to the game's asset list.
        return Registry.register(
                Registries.ITEM, // 1. Specifies the type of registry (the Item registry).
                // 2. Creates a unique identifier (Identifier) by combining the mod ID and the item name
                //    (e.g., fantasticcaves:suspicious_powder).
                Identifier.of(Fantasticcaves.MOD_ID, name),
                item // 3. The actual Item instance to be added to the game.
        );
    }

    // The main public method for initiating the registration of all custom items in the mod.
    // This method must be called from the mod's main class during its initialization phase.
    public static void registerModItems() {
        // Logs a message to the game console/log to confirm that the item registration process has begun
        // for the specific mod ID.
        Fantasticcaves.LOGGER.info("Registering Mod Items for " + Fantasticcaves.MOD_ID);

        // Uses Fabric events to add the registered item (SUSPICIOUS_POWDER)
        // to the "INGREDIENTS" item group in the creative inventory.
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(SUSPICIOUS_POWDER);
        });
    }

}