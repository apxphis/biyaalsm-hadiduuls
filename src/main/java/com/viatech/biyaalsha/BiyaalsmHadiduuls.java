package com.viatech.biyaalsha;

import com.viatech.biyaalsha.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BiyaalsmHadiduuls implements ModInitializer {
	public static final String MOD_ID = "biyaalsm-hadiduuls";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}