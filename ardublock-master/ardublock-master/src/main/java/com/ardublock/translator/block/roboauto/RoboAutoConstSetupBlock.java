package com.ardublock.translator.block.roboauto;

import com.ardublock.translator.Translator;
import com.ardublock.translator.block.TranslatorBlock;

public abstract class RoboAutoConstSetupBlock extends TranslatorBlock
{
	protected RoboAutoConstSetupBlock(Long blockId, Translator translator, String codePrefix, String codeSuffix,
            String label, String setupCmd)
	{
		super(blockId, translator, codePrefix, codeSuffix, label);		
		translator.addSetupCommand(setupCmd);
	}

	@Override
	public String toCode()
	{
		return "";
	}

}
