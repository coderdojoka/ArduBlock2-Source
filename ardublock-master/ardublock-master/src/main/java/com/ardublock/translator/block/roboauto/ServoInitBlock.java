package com.ardublock.translator.block.roboauto;

import com.ardublock.translator.Translator;

public class ServoInitBlock extends RoboAutoConstSetupBlock {
	public ServoInitBlock(Long blockId, Translator translator, String codePrefix, String codeSuffix,
			String label) {
		super(blockId, translator, codePrefix, codeSuffix, label, "servoInit();");

		// make sure to include our header file
		translator.addHeaderFile("roboauto.h");
	}
}
