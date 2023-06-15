package br.com.user;

import java.util.List;

import br.com.scheduling.Scheduling;
import br.com.scheduling.SchedulingController;

public class UserController {

	private static UserController instance;
	private UserRepository userRepository = UserRepository.getInstance();
	
	public static UserController getInstance() {
		if (instance == null) {
			instance = new UserController();
		}
		
		return instance;
	}
	
	public User insertUser(User user) {
		for (Scheduling userSchedule: user.getSchedule()) {
			Scheduling attendTo = null;
			attendTo = SchedulingController.getInstance().search(userSchedule.getId()).get(0);
			if (attendTo == null) {
				Scheduling scheduling = SchedulingController.getInstance().insert(userSchedule);
				if (scheduling == null) {
					return null;
				}
				userSchedule = scheduling;
			}
		}
		
		User insertedUser = userRepository.insert(user);
		return insertedUser;
	}
	
	
	public List<User> search(Integer id) {
		List<User> users = userRepository.search(new User(id));
		return users;
	}
	
	public List<User> listUsers() {
		return userRepository.list();
	}
}
