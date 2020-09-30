package model.service;

import java.util.Calendar;
import java.util.Date;

import model.entity.Contrato;
import model.entity.Parcela;

public class ContratoService {
	
	private PagamentoOnlineService pagamentoOnline;
	
	public ContratoService(PagamentoOnlineService pagamentoOnline) {
		this.pagamentoOnline = pagamentoOnline;
	}

	public void processarContrato(Contrato contrato, int meses) {
		double valorBasicoParcela = contrato.getTotalValor() / meses;
		
		for (int i = 1; i <= meses; i++) {
			
			double valorBasicoComJuros = valorBasicoParcela + pagamentoOnline.juros(valorBasicoParcela, i);
			double valorFinal = valorBasicoComJuros + pagamentoOnline.taxaDePagamemto(valorBasicoComJuros);
			
			Calendar c = Calendar.getInstance();
			c.setTime(contrato.getDataContrato());
			c.add(Calendar.MONTH, i);
			
			Date dataVencimento = c.getTime();
			
			contrato.getParcela().add(new Parcela(dataVencimento, valorFinal));
			
		}
	}
	
}
