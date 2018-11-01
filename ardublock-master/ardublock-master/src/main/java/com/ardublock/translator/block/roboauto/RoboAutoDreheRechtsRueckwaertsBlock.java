package com.ardublock.translator.block.roboauto;

import com.ardublock.translator.Translator;
import com.ardublock.translator.block.ConstBlock;

public class RoboAutoDreheRechtsRueckwaertsBlock extends ConstBlock {
	public RoboAutoDreheRechtsRueckwaertsBlock(Long blockId, Translator translator, String codePrefix, String codeSuffix,
			String label) {
		super(blockId, translator, codePrefix, codeSuffix, label);
		this.setCode("dreheRechtsRueckwaerts();\n");
	}

}
