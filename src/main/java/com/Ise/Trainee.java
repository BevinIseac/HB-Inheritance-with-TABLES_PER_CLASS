package com.Ise;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Trainee")
@AttributeOverrides({
	@AttributeOverride(name="paperhour", column=@Column(name="paperhour")),
	@AttributeOverride(name="contractperiod", column=@Column(name="contractperiod"))
})

public class Trainee extends Employee{

	private float paperhour;
	private String contractperiod;

	public Trainee(float paperhour, String contractperiod, String name) {
		super(name);
		this.paperhour = paperhour;
		this.contractperiod = contractperiod;
	}
	public float getPaperhour() {
		return paperhour;
	}
	public void setPaperhour(float paperhour) {
		this.paperhour = paperhour;
	}
	public String getContractperiod() {
		return contractperiod;
	}
	public void setContractperiod(String contractperiod) {
		this.contractperiod = contractperiod;
	}

}
