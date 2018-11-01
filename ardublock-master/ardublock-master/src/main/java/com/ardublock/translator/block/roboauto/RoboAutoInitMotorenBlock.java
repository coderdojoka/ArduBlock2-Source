package com.ardublock.translator.block.roboauto;

import com.ardublock.translator.Translator;

public class RoboAutoInitMotorenBlock extends RoboAutoConstSetupBlock {
	public RoboAutoInitMotorenBlock(Long blockId, Translator translator, String codePrefix, String codeSuffix,
			String label) {
		super(blockId, translator, codePrefix, codeSuffix, label, "//RoboAuto v1.0\ninitMotoren();");
		// make sure to include our header file
		translator.addHeaderFile("roboauto.h");
	}

}
