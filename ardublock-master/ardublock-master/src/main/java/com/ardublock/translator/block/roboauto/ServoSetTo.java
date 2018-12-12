package com.ardublock.translator.block.roboauto;

import com.ardublock.translator.Translator;

public class ServoSetTo extends RoboAutoMultiNumberArgsBlock {
	public ServoSetTo(Long blockId, Translator translator, String codePrefix, String codeSuffix,
			String label) {
		super(blockId, translator, codePrefix, codeSuffix, label, "servoSetzen", 1);
	}
}
