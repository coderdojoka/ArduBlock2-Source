package com.ardublock.translator.block.output;

import com.ardublock.translator.Translator;
import com.ardublock.translator.block.TranslatorBlock;
import com.ardublock.translator.block.exception.SocketNullException;
import com.ardublock.translator.block.exception.SubroutineNotDeclaredException;

public class NeopixelBrightnessBlock  extends TranslatorBlock {

	public NeopixelBrightnessBlock (Long blockId, Translator translator, String codePrefix, String codeSuffix, String label)
	{
		super(blockId, translator, codePrefix, codeSuffix, label);
	}
	
	//@Override
		public String toCode() throws SocketNullException, SubroutineNotDeclaredException
		{
			String Pin ;
			String Brightness;

			TranslatorBlock translatorBlock = this.getRequiredTranslatorBlockAtSocket(0);
			Pin = translatorBlock.toCode().replaceAll("\\s*_.new\\b\\s*", "");
			translatorBlock = this.getRequiredTranslatorBlockAtSocket(1);
			Brightness = translatorBlock.toCode().replaceAll("\\s*_.new\\b\\s*", "");
			
			String ret = "strip_pin"+Pin+".setBrightness("+Brightness +");\n";
			
			return codePrefix + ret + codeSuffix;
				
		}
}
