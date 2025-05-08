package view;
import java.util.Scanner;

public class TelaMonitoramentoSo {
	static Scanner entrada = new Scanner(System.in);
	
	public static void monitoramento() {
		System.out.println("\n[+] == TELA DE MONITORAMENTO DO SISTEMA OPERACIONAL ==");
		
		while(true) {	
			System.out.print("\n>> ");
			String comando = entrada.nextLine();
			
			if (comando.equals("/exit")) {
				System.exit(0);
			}
		}

	
	}
}