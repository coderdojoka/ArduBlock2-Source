package com.ardublock.translator.block.roboauto;

import com.ardublock.translator.Translator;

public class RoboAutoFahreRueckwaertsBlock extends RoboAutoMultiNumberArgsBlock {
	public RoboAutoFahreRueckwaertsBlock(Long blockId, Translator translator, String codePrefix, String codeSuffix,
			String label) {
		super(blockId, translator, codePrefix, codeSuffix, label, "fahreRueckwaerts", 2);
	}
}
