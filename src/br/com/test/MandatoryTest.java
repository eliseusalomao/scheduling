package br.com.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.event.Mandatory;

public class MandatoryTest {

	@Test
	public void testGetMandatory_isMandatory() {
		Mandatory isMandatory = Mandatory.OBRIGATORIO;
		
		String expectedLabel = "Obrigatorio";
		String actualLabel = isMandatory.getMandatory();
		
		Assert.assertEquals(expectedLabel, actualLabel);
	}
	
	@Test
	public void testGetMandatory_isNotMandatory() {
		Mandatory isNotMandatory = Mandatory.FACULTATIVO;
		
		String expectedLabel = "Facultativo";
		String actualLabel = isNotMandatory.getMandatory();
		
		Assert.assertEquals(expectedLabel, actualLabel);
		
	}
}
