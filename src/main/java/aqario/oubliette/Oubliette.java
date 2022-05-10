package aqario.oubliette;

import aqario.oubliette.block.Block;
import aqario.oubliette.item.Item;
import aqario.oubliette.world.structure.Structure;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Oubliette implements ModInitializer {

	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "oubliette";

	@Override
	public void onInitialize() {

		Item.initialize();
		Block.initialize();
		Structure.registerStructureFeatures();
	}
}