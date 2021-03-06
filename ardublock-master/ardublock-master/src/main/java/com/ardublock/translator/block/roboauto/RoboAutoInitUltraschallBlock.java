package com.ardublock.translator.block.roboauto;

import com.ardublock.translator.Translator;

public class RoboAutoInitUltraschallBlock extends RoboAutoConstSetupBlock {
	public RoboAutoInitUltraschallBlock(Long blockId, Translator translator, String codePrefix, String codeSuffix,
			String label) {
		super(blockId, translator, codePrefix, codeSuffix, label, "initUltraschallSensor();");

		// make sure to include our header file
		translator.addHeaderFile("roboauto.h");
	}
}
