package com.ardublock.translator.block.roboauto;

import com.ardublock.translator.Translator;

public class LinksAufDerStelleBlock extends RoboAutoMultiNumberArgsBlock {
	public LinksAufDerStelleBlock(Long blockId, Translator translator, String codePrefix,
			String codeSuffix,
			String label) {
		super(blockId, translator, codePrefix, codeSuffix, label, "aufDerStelleLinks", 2);
	}
}
