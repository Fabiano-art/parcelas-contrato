package model.service;

public interface PagamentoOnlineService {
	
	public double taxaDePagamemto(double valor);
	public double juros(double valor, int meses);
	
}
