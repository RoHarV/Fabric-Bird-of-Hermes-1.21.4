package net.starry.birdofhermes.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.starry.birdofhermes.BirdOfHermes;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;

public class ModItems {
    public static final Item HOLY_BLOOD = registerItem("holy_blood", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BirdOfHermes.MOD_ID,"holy_blood")))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BirdOfHermes.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BirdOfHermes.LOGGER.info("registering Mod Items for" + BirdOfHermes.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(HOLY_BLOOD);
        });
    }
}