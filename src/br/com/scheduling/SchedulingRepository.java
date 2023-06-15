package br.com.scheduling;

import java.util.ArrayList;
import java.util.List;

import br.com.repository.Repository;

public class SchedulingRepository implements Repository<Scheduling> {
	
	private List<Scheduling> scheduling = new ArrayList<>();
	private static SchedulingRepository instance;
	private static Integer sequence = 0;
	
	private SchedulingRepository() {
	}
	
	public static SchedulingRepository getInstance() {
		if (instance == null) {
			instance = new SchedulingRepository();
		}
		return instance;
	}
	
	@Override
	public List<Scheduling> list() {
		return scheduling;
	}

	@Override
	public Scheduling insert(Scheduling entity) {
		entity.setId(++sequence);
		scheduling.add(entity);
		return entity;
	}

	@Override
	public List<Scheduling> search(Scheduling entity) {
		List<Scheduling> list = new ArrayList<>();
		list.add(scheduling.get(entity.getId() - 1));
		return list;
	}

}
