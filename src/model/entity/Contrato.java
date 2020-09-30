package model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	
	private int numeroContrato;
	private Date dataContrato;
	private double totalValor;
	
	List<Parcela> parcela = new ArrayList<>();
	
	public Contrato() {
		
	}

	public Contrato(int numeroContrato, Date dataContrato, double totalValor) {
		super();
		this.numeroContrato = numeroContrato;
		this.dataContrato = dataContrato;
		this.totalValor = totalValor;
	}

	public int getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(int numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	public double getTotalValor() {
		return totalValor;
	}

	public void setTotalValor(double totalValor) {
		this.totalValor = totalValor;
	}

	public List<Parcela> getParcela() {
		return parcela;
	}
	
}
