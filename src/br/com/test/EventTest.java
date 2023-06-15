package br.com.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.event.Event;
import br.com.scheduling.Scheduling;

public class EventTest {

	@Test
	public void testGetEventList() {
		List<Scheduling> eventsList = Event.getEventsList();
		Assert.assertNotNull(eventsList);
	}
}
