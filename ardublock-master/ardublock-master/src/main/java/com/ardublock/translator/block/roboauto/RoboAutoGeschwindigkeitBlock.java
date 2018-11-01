package com.ardublock.translator.block.roboauto;

import com.ardublock.translator.Translator;

public class RoboAutoGeschwindigkeitBlock extends RoboAutoMultiNumberArgsBlock {
	public RoboAutoGeschwindigkeitBlock(Long blockId, Translator translator, String codePrefix, String codeSuffix,
			String label) {
		super(blockId, translator, codePrefix, codeSuffix, label, "geschwindigkeit", 1);
	}
}
