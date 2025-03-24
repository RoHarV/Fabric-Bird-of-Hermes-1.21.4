package net.starry.birdofhermes;

import net.fabricmc.api.ModInitializer;

import net.starry.birdofhermes.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//commit test
public class BirdOfHermes implements ModInitializer {
	public static final String MOD_ID = "birdofhermes";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}