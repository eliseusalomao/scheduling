package br.com.main;

import java.util.Scanner;

import br.com.event.Event;
import br.com.event.Mandatory;
import br.com.scheduling.Scheduling;
import br.com.scheduling.SchedulingController;
import br.com.user.User;
import br.com.user.UserController;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		User user = new User();

		System.out.println("1. Criar reunião\n"
						 + "2. Adicionar usuário\n"
						 + "3. Adicionar participante a uma reunião existente\n"
						 + "4. Listar usuários\n"
						 + "5. Listar reuniões\n");
		
		System.out.println("Insira aqui: ");
		int option = sc.nextInt();
		
		while (option > 0) {
			switch (option) {
				case 1:
					System.out.println("Insira os dados da reunião\n"
									 + "Data: ");
					String date = sc.next();
					System.out.println("Hora: ");
					String hour = sc.next();
					sc.nextLine();
					System.out.println("Assunto: ");
					String subject = sc.nextLine();
					System.out.println("Status da reunião: ");
					String isMandatory = sc.next();
					
					SchedulingController.getInstance().insert(
							new Scheduling(date, hour, subject, Mandatory.valueOf(isMandatory.toUpperCase())));
					break;
				case 2:
					System.out.println("Insira os dados do usuário\n"
							+ "Nome: ");
					sc.nextLine();
					String name = sc.nextLine();
					System.out.println("Email: ");
					String email = sc.next();
					
					user = new User(name, email);
					UserController.getInstance().insertUser(user);
					break;
				case 3:
					System.out.println("Que usuário deseja adicionar a uma reunião?\n");
					System.out.println("\t\tUsuários\n");
					System.out.println(UserController.getInstance().listUsers()); 
					System.out.println("\t\tReuniões\n");
					System.out.println(Event.getEventsList()); 
					
					System.out.println("ID da reunião: ");
					Integer eventID = sc.nextInt();
					System.out.println("ID do usuário: ");
					Integer userID = sc.nextInt();
					UserController.getInstance().search(userID - 1).get(0).getSchedule().add(SchedulingController.getInstance().search(eventID).get(0));
					break;
				case 4: 
					System.out.println(UserController.getInstance().listUsers());
					break;
				case 5:
					System.out.println(Event.getEventsList()); 
					break;
				default:
					System.out.println("Opção inválida.\n");
			}
			
			System.out.println("1. Criar reunião\n"
					 + "2. Adicionar usuário\n"
					 + "3. Adicionar participante a uma reunião existente\n"
					 + "4. Listar usuários\n"
					 + "5. Listar reuniões\n");
			
			System.out.println("Insira aqui: ");
			option = sc.nextInt();
		}
		
		sc.close();
		
		
		// CODE WITHOUT MENU (IT'S WORKING)
		
		
//		SchedulingController.getInstance().insert(
//			new Scheduling("15/06/2023", "13:00", "Apresentação", Mandatory.FACULTATIVO));
//		SchedulingController.getInstance().insert(
//			new Scheduling("16/06/2023", "14:00", "Lucros liquidos da empresa", Mandatory.OBRIGATORIO));
//		SchedulingController.getInstance().insert(
//			new Scheduling("16/06/2023", "14:00", "Lucros liquidos da empresa", Mandatory.OBRIGATORIO));
//
		
//		User user = new User("Eliseu", "eliseu@gmail");
//		user.getSchedule().add(SchedulingController.getInstance().search(1).get(0));
//		user.getSchedule().add(SchedulingController.getInstance().search(2).get(0));
//		UserController.getInstance().insertUser(user);
//		
//		User user1 = new User("Tiranossauro Rex", "trex@prehistorico");
//		user1.getSchedule().add(SchedulingController.getInstance().search(2).get(0));
//		UserController.getInstance().insertUser(user1);
//		
//		User user3 = new User("Tiranossauro Rex", "trex@prehistorico");
//		UserController.getInstance().insertUser(user3);
//		
//		System.out.println(UserController.getInstance().listUsers());
//		System.out.println("\n \tReuniões agendadas: \n");
//		System.out.println(Event.getEventsList());
	}

}
