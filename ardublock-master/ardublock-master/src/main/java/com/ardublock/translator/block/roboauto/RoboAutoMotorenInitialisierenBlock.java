package com.ardublock.translator.block.roboauto;

import com.ardublock.translator.Translator;
import com.ardublock.translator.block.ConstBlock;

public class RoboAutoMotorenInitialisierenBlock extends ConstBlock {
	public RoboAutoMotorenInitialisierenBlock(Long blockId, Translator translator, String codePrefix, String codeSuffix,
			String label) {
		super(blockId, translator, codePrefix, codeSuffix, label);
		this.setCode("initMotoren();\n");

		// make sure to include our header file
		translator.addHeaderFile("roboauto.h");
	}

}
