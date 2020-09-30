package model.service;

public class PaypalService implements PagamentoOnlineService{

	public double taxaDePagamemto(double valor) {
		return valor * 0.02;
	}

	public double juros(double valor, int meses) {
		
		return valor * meses * 0.01;
	}
	
}

