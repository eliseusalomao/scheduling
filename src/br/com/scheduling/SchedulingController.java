package br.com.scheduling;

import java.util.List;

public class SchedulingController {
	
	private static SchedulingController instance;
	private SchedulingRepository schedulingRepository = SchedulingRepository.getInstance();
	
	public static SchedulingController getInstance() {
		if (instance == null) {
			instance = new SchedulingController();
		}
		
		return instance;
	}
	
	public Scheduling insert(Scheduling scheduling) {
		if (scheduling.getData().isEmpty()) {
			return null;
		}
		
		schedulingRepository.insert(scheduling);
		return scheduling;
	}
	
	
	public List<Scheduling> listSchedules() {
		return schedulingRepository.list();
	}
	
	public List<Scheduling> search(Integer id) {
		List<Scheduling> users = schedulingRepository.search(new Scheduling(id));
		return users;
	}
}
