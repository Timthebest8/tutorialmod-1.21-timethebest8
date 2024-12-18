package nl.timthebest8.tutorialmod;

import net.fabricmc.api.ModInitializer;

import nl.timthebest8.tutorialmod.block.ModBlocks;
import nl.timthebest8.tutorialmod.item.ModItemGroups;
import nl.timthebest8.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}