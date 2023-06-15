package br.com.event;

public enum Mandatory {

	OBRIGATORIO("Obrigatorio"),
	FACULTATIVO("Facultativo");
	
	private final String label;
	Mandatory(String label) {
		this.label = label;
	}
	
	public String getMandatory() {
		return this.label;
	}
}
