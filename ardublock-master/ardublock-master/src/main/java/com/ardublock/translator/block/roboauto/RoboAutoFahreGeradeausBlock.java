package com.ardublock.translator.block.roboauto;

import com.ardublock.translator.Translator;

public class RoboAutoFahreGeradeausBlock extends RoboAutoMultiNumberArgsBlock {
	public RoboAutoFahreGeradeausBlock(Long blockId, Translator translator, String codePrefix, String codeSuffix,
			String label) {
		super(blockId, translator, codePrefix, codeSuffix, label, "fahreVorwaerts", 2);
	}
}
