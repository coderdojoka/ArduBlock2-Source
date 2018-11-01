package com.ardublock.translator.block.roboauto;

import com.ardublock.translator.Translator;

public class RoboAutoFahreRechtskurveBlock extends RoboAutoMultiNumberArgsBlock {
	public RoboAutoFahreRechtskurveBlock(Long blockId, Translator translator, String codePrefix, String codeSuffix,
			String label) {
		super(blockId, translator, codePrefix, codeSuffix, label, "fahreRechtskurve", 2);
	}
}
