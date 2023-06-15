package br.com.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import br.com.scheduling.Scheduling;

public class User {
	private Integer id;
	private String nome;
	private String email;
	private List<Scheduling> schedule;
	
	public User() {
		this.setId(0);
		this.setNome("");
		this.setEmail("");
		this.setSchedule(new ArrayList<Scheduling>());
	}
	
	public User(Integer id) {
		this.setId(id);
		this.setNome("");
		this.setEmail("");
		this.setSchedule(new ArrayList<Scheduling>());
	}
	
	public User(String nome, String email) {
		this.setNome(nome);
		this.setEmail(email);
		this.setSchedule(new ArrayList<Scheduling>());
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Scheduling> getSchedule() {
		return schedule;
	}

	public void setSchedule(List<Scheduling> schedule) {
		this.schedule = schedule;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}

	public String toString() {
		if (this.getSchedule().size() == 0) {
			return "\nID: " 
					+ this.getId() 
					+ "\nNome: "
					+ this.getNome() 
					+ "\nEmail: " 
					+ this.getEmail() 
					+ "\n"
					+ "Sem reuniões";
		}
		
		return "\nID: " 
				+ this.getId() 
				+ "\nNome: "
				+ this.getNome() 
				+ "\nEmail: " 
				+ this.getEmail() 
				+ "\n"
				+ this.getSchedule();
	}
}
