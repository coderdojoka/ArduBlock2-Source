package com.ardublock.translator.block.roboauto;

import com.ardublock.translator.Translator;

public class RoboAutoDreheAufDerStelleBlock extends RoboAutoMultiNumberArgsBlock {
	public RoboAutoDreheAufDerStelleBlock(Long blockId, Translator translator, String codePrefix, String codeSuffix,
			String label) {
		super(blockId, translator, codePrefix, codeSuffix, label, "dreheAufDerStelle", 2);
	}
}
