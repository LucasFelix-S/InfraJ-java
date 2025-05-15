package view;
import java.util.Scanner;

import controller.InicialController;

public class TelaInicial {
	
	static Scanner entrada = new Scanner(System.in);
	static InicialController coletaOpcao = new InicialController();
	
	public static void home() {
        System.out.println("  ___        __               _ ");
        System.out.println(" |_ _|_ __  / _|_ __ __ _    | |");
        System.out.println("  | || '_ \\| |_| '__/ _` |_  | |");
        System.out.println("  | || | | |  _| | | (_| | |_| |");
        System.out.println(" |___|_| |_|_| |_|  \\__,_|\\___/ ");
        System.out.println("                                 ");
        System.out.println("             0.2.0               \n");
        
        System.out.println("| para uma introdução aos comandos digite: /comandos");
        
        System.out.println("\n[+] == OPÇÕES DO SISTEMA ==");
        System.out.println(" | ");
        System.out.println(" | 1 - Monitoramento do Sistema Operacional");
        System.out.println(" | 2 - Monitoramento de Hardware");
        System.out.println(" | 3 - Processos e Serviços");
        System.out.println(" | 4 - Invenário de Equipamentos");
        System.out.println(" | 5 - Gerenciar Contabilidade do TI");
        System.out.println(" | 6 - Sair do Sistema");
        
        System.out.print("\n>> ");
        String opcao = entrada.nextLine();
        coletaOpcao.validaOpcao(opcao);
        
        entrada.close();
        
	}
}