package br.com.scheduling;

import java.util.Objects;

import br.com.event.Mandatory;

public class Scheduling {
	private Integer id;
	private String data;
	private String hora;
	private String assunto;
	private Mandatory mandatory;
	
	public Scheduling() {
		this.setId(0);
		this.setData("");
		this.setHora("");
		this.setAssunto("");
	}
	
	public Scheduling(Integer id) {
		this.setId(id);
		this.setData("");
		this.setHora("");
		this.setAssunto("");
	}
	
	public Scheduling (
			String data, String hora, String assunto, Mandatory mandatory) {
		this.setData(data);
		this.setHora(hora);
		this.setAssunto(assunto);
		this.setMandatory(mandatory);
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	
	public Mandatory getMandatory() {
		return this.mandatory;
	}
	
	public void setMandatory(Mandatory isMandatory) {
		this.mandatory = isMandatory;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(data, hora);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Scheduling other = (Scheduling) obj;
		return Objects.equals(data, other.data) && Objects.equals(hora, other.hora);
	}

	public String toString() {
		return "Reunião marcada para o dia "
				+ this.data
				+ " No horário das "
				+ this.hora + "h."
				+ " O assunto é referente a: "
				+ this.assunto
				+ "."
				+  " O status da reunião é: "
				+ this.getMandatory() + "\n";
	}
}
