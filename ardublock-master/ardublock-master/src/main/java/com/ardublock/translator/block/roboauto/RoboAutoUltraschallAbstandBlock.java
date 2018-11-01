package com.ardublock.translator.block.roboauto;

import com.ardublock.translator.Translator;
import com.ardublock.translator.block.ConstBlock;

public class RoboAutoUltraschallAbstandBlock extends ConstBlock {
	public RoboAutoUltraschallAbstandBlock(Long blockId, Translator translator, String codePrefix, String codeSuffix,
			String label) {
		super(blockId, translator, codePrefix, codeSuffix, label);
		// this.translator.addNumberVariable("Ultraschall Abstand in CM",
		// "ultraschallAbstand");

		this.setCode("ultraschallAbstandCM();\n");
	}

}
