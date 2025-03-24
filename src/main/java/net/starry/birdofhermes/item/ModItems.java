package net.starry.birdofhermes.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.starry.birdofhermes.BirdOfHermes;

public class ModItems {


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BirdOfHermes.MOD_ID, name), item);;
    }

    public static void registerModItems() {
        BirdOfHermes.LOGGER.info("Registering Mod Items for" + BirdOfHermes.MOD_ID);
    }
}
