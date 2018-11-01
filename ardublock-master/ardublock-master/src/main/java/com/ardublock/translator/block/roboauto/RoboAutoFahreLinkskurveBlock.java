package com.ardublock.translator.block.roboauto;

import com.ardublock.translator.Translator;

public class RoboAutoFahreLinkskurveBlock extends RoboAutoMultiNumberArgsBlock {
	public RoboAutoFahreLinkskurveBlock(Long blockId, Translator translator, String codePrefix, String codeSuffix,
			String label) {
		super(blockId, translator, codePrefix, codeSuffix, label, "fahreLinkskurve", 2);
	}
}
