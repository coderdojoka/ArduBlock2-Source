package com.ardublock.translator.block.roboauto;

import com.ardublock.translator.Translator;

public class RechtsAufDerStelleBlock extends RoboAutoMultiNumberArgsBlock {
	public RechtsAufDerStelleBlock(Long blockId, Translator translator, String codePrefix,
			String codeSuffix,
			String label) {
		super(blockId, translator, codePrefix, codeSuffix, label, "aufDerStelleRechts", 2);
	}
}
