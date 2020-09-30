package model.entity;

import java.util.Date;

public class Parcela {
	
	private Date dataVencimento;
	private double valor;
	
	public Parcela() {
		
	}

	public Parcela(Date dataVencimento, double valor) {
		super();
		this.dataVencimento = dataVencimento;
		this.valor = valor;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
