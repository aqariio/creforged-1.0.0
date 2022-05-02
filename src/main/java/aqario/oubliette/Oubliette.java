package aqario.oubliette;

import aqario.oubliette.block.ModBlock;
import aqario.oubliette.item.ModItem;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Oubliette implements ModInitializer {
	public static final String MODID = "oubliette";
	public static final Logger LOGGER = LoggerFactory.getLogger("Oubliette");

	@Override
	public void onInitialize() {

		ModItem.initialize();
		ModBlock.initialize();

	}
}
