package view;
import java.util.Scanner;
import controller.MonitoramentoSoController;

public class TelaMonitoramentoSo {
	
	static MonitoramentoSoController controlador = new MonitoramentoSoController();
	static Scanner entrada = new Scanner(System.in);
	
	public static void monitoramento() {
		System.out.println("\n[+] == TELA DE MONITORAMENTO DO SISTEMA OPERACIONAL ==");
		
		while(true) {	
			
			System.out.print("\n>> ");
			String comando = entrada.nextLine();				
			controlador.soController(comando);
			
			}
		}
	
	}
