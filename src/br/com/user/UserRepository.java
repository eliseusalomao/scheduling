package br.com.user;

import java.util.ArrayList;
import java.util.List;

import br.com.repository.Repository;

public class UserRepository implements Repository<User> {
	
	private List<User> users = new ArrayList<>();
	private static UserRepository instance;
	private static Integer id = 0;
	
	private UserRepository() {
	}
	
	public static UserRepository getInstance() {
		if (instance == null) {
			instance = new UserRepository();
		}
		
		return instance;
	}

	@Override
	public List<User> list() {
		List<User> list = new ArrayList<>();
		for (User u: users) {
			list.add(u);
		}
		
		return list;
	}

	@Override
	public User insert(User entity) {
		entity.setId(++id);
		users.add(entity);
		return entity;
	}
	
	@Override
	public List<User> search(User entity) {
		List<User> list = new ArrayList<>();
		list.add(users.get(entity.getId()));
		return list;
	}

	
}
