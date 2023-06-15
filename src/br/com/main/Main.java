package br.com.main;

import br.com.event.Mandatory;
import br.com.scheduling.Scheduling;
import br.com.scheduling.SchedulingController;
import br.com.user.User;
import br.com.user.UserController;

public class Main {

	public static void main(String[] args) {

		SchedulingController.getInstance().insert(
				new Scheduling("15/06/2023", "13:00", "Apresentação", Mandatory.FACULTATIVO));
		SchedulingController.getInstance().insert(
				new Scheduling("16/06/2023", "14:00", "Lucros liquidos da empresa", Mandatory.OBRIGATORIO));
		
		User user = new User("Eliseu", "eliseu@gmail");
		user.getSchedule().add(SchedulingController.getInstance().search(1).get(0));
		user.getSchedule().add(SchedulingController.getInstance().search(2).get(0));
		UserController.getInstance().insertUser(user);
		
		User user1 = new User("Tiranossauro Rex", "trex@prehistorico");
		user1.getSchedule().add(SchedulingController.getInstance().search(2).get(0));
		UserController.getInstance().insertUser(user1);
		
		User user3 = new User("Tiranossauro Rex", "trex@prehistorico");
		UserController.getInstance().insertUser(user3);
		
		System.out.println(UserController.getInstance().listUsers());
	}

}
