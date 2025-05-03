package view;
import java.util.Scanner;
import controller.TelaInicialController;

public class TelaInicial {
	static Scanner entrada = new Scanner(System.in);
	static TelaInicialController coletaOpcao = new TelaInicialController();
	
	public static void home() {
        System.out.println("  ___        __               _ ");
        System.out.println(" |_ _|_ __  / _|_ __ __ _    | |");
        System.out.println("  | || '_ \\| |_| '__/ _` |_  | |");
        System.out.println("  | || | | |  _| | | (_| | |_| |");
        System.out.println(" |___|_| |_|_| |_|  \\__,_|\\___/ ");
        System.out.println("                                 ");
        System.out.println("             0.1.0               ");
        
        System.out.println("\n[+] == OPÇÕES DO SISTEMA ==");
        System.out.println(" | ");
        System.out.println(" | 1 - Diagnóstico Rápido");
        System.out.println(" | 2 - Monitoramento do Sistema");
        System.out.println(" | 3 - Análise de Hardware");
        System.out.println(" | 4 - Processos e Serviços");
        System.out.println(" | 5 - Invenário de Equipamentos");
        System.out.println(" | 6 - Gerenciar Contas de TI");
        System.out.println(" | 7 - Lista de Comandos");
        System.out.println(" | 8 - Sair do Sistema");
        
        System.out.print("\n>> ");
        int opcao = entrada.nextInt();
        coletaOpcao.validaOpcao(opcao);

	}
}