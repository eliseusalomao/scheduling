package br.com.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import br.com.event.Mandatory;
import br.com.scheduling.Scheduling;

public class SchedulingTest {

	@Test
	void SchedulingWithAllData() {
		Scheduling testScheduling = new Scheduling("15/05/2023", "13h", "Nada", Mandatory.OBRIGATORIO);
		Assert.assertTrue(
				testScheduling.getData().equals("15/05/2023") 
				&& testScheduling.getHora().equals("13h")
				&& testScheduling.getAssunto().equals("Nada")
				&& testScheduling.getMandatory() == Mandatory.OBRIGATORIO);
	}
	
}
