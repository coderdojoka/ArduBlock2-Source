package com.ardublock.translator.block.roboauto;

import com.ardublock.translator.Translator;
import com.ardublock.translator.block.ConstBlock;

public class RoboAutoInitMotorenBlock extends RoboAutoConstSetupBlock {
	public RoboAutoInitMotorenBlock(Long blockId, Translator translator, String codePrefix, String codeSuffix,
			String label) {
		super(blockId, translator, codePrefix, codeSuffix, label, "initMotoren();");
		// make sure to include our header file
		translator.addHeaderFile("roboauto.h");
	}

}
