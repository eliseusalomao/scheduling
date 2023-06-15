package br.com.scheduling;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.repository.Repository;

public class SchedulingRepository implements Repository<Scheduling> {
	
	private HashMap<Integer, Scheduling> schedule = null;
	private static SchedulingRepository instance;
	private static Integer id = 0;
	
	private SchedulingRepository() {
		schedule = new HashMap<Integer, Scheduling>();
	}
	
	public static SchedulingRepository getInstance() {
		if (instance == null) {
			instance = new SchedulingRepository();
		}
		
		return instance;
	}
	
	@Override
	public List<Scheduling> list() {
		List<Scheduling> list = new ArrayList<>();
		for (Scheduling s : schedule.values()) {
			list.add(s);
		}
		return list;
	}

	@Override
	public Scheduling insert(Scheduling entity) {
		entity.setId(++id);
		schedule.put(entity.getId(), entity);
		return entity;
	}

	@Override
	public List<Scheduling> search(Scheduling entity) {
		List<Scheduling> list = new ArrayList<>();
		list.add(schedule.get(entity.getId()));
		return list;
	}

}
