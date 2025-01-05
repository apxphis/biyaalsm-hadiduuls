package com.viatech.biyaalsha.item;

import com.viatech.biyaalsha.BiyaalsmHadiduuls;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item BIYAALSM_SWORD = registerItem("biyaalsm_sword", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BiyaalsmHadiduuls.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BiyaalsmHadiduuls.LOGGER.info("registering mod items for " + BiyaalsmHadiduuls.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(fabricItemGroupEntries -> {
            entries.add(BIYAALSM_SWORD);
        });
    }

}
