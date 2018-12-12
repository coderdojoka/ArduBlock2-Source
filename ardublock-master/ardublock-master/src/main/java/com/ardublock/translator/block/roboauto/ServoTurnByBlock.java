package com.ardublock.translator.block.roboauto;

import com.ardublock.translator.Translator;

public class ServoTurnByBlock extends RoboAutoMultiNumberArgsBlock {
	public ServoTurnByBlock(Long blockId, Translator translator, String codePrefix, String codeSuffix,
			String label) {
		super(blockId, translator, codePrefix, codeSuffix, label, "servoDrehen", 1);
	}
}
