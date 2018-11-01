package com.ardublock.translator.block.roboauto;

import com.ardublock.translator.Translator;
import com.ardublock.translator.block.TranslatorBlock;
import com.ardublock.translator.block.exception.SocketNullException;
import com.ardublock.translator.block.exception.SubroutineNotDeclaredException;

public class RoboAutoMultiNumberArgsBlock extends TranslatorBlock
{
	private final String funcName;
	private final int numArgsCount;
	public RoboAutoMultiNumberArgsBlock(Long blockId, Translator translator, String codePrefix, String codeSuffix, String label,
			String funcName, int numArgsCount)
	{
		super(blockId, translator, codePrefix, codeSuffix, label);
		this.funcName = funcName;
		this.numArgsCount = numArgsCount;
	}

	@Override
	public String toCode() throws SocketNullException, SubroutineNotDeclaredException
	{
		String output = this.funcName + "( " ;
		for (int i = 0; i < this.numArgsCount; i++) {
			TranslatorBlock translatorBlock = this.getRequiredTranslatorBlockAtSocket(i);
			String code = translatorBlock.toCode();
			String number = code.replaceAll("\\s*_.new\\b\\s*", "");
			output += number;
			if(i < this.numArgsCount -1 )
				output += ", ";
		}
		
		return output + " );\n";
	}

}
