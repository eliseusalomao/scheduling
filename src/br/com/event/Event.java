package br.com.event;

import java.util.List;

import br.com.scheduling.Scheduling;
import br.com.scheduling.SchedulingController;

public class Event {

	public Event() {
	}
	
	public static List<Scheduling> getEventsList() {
		List<Scheduling> eventsList = SchedulingController.getInstance().listSchedules();
		return eventsList;
	}
}
