package aplicação;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entity.Contrato;
import model.service.ContratoService;
import model.service.PaypalService;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Dados do contrato:");
		
		System.out.print("Numero:");
		int numero = sc.nextInt();
		
		System.out.print("Data: ");
		Date data = sdf.parse(sc.next());
		
		System.out.print("Valor do contrato:");
		double valor = sc.nextDouble();
		
		System.out.print("Numero de parcelas");
		int parcelas = sc.nextInt();
		
		Contrato con = new Contrato(numero, data, valor);
		ContratoService contServ = new ContratoService(new PaypalService());
		
		contServ.processarContrato(con, parcelas);
		
		System.out.println("Parcelas:");
		
		for(int i = 0; i < con.getParcela().size(); i++) {
			System.out.println(sdf.format(con.getParcela().get(i).getDataVencimento())+" - "+con.getParcela().get(i).getValor());
		}
	}

}
