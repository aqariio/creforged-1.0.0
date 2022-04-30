package aqario.oubliette;

import aqario.oubliette.block.Block;
import aqario.oubliette.item.Item;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Oubliette implements ModInitializer {
	public static final String MODID = "oubliette";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {

		Item.initialize();
		Block.initialize();

	}
}
