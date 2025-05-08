package view;

public class TelaComandos {
	
	public static void comandos() {
		System.out.println("\n[+] == LISTA DE COMANDOS DO SISTEMA ==\n");
		
		System.out.println("/exit  	 \t sai do sistema \n");
		
		System.out.println("/comandos \t lista todos os comandos do sistema \n");
		
		System.out.println("/infoso \t lista informações do sistema operacional (por completo) ");
		System.out.println("/infoso -p \t lista um parâmetro específico do /infoso, exemplo: /infoso -so (mostra qual o SO em uso). [p] é parâmetro \n");
		
		System.out.println("/infohw \t lista informações do hardware (por completo)");
		System.out.println("/infohw -p \t Lista um parâmetro específico do /infohw, exemplo: /infohw -cpu (lista informações da CPU). [p] é parâmetro \n");
		
		
		System.out.println("...");
		
		// Preciso continuar listando os comandos conforme ir criando e ideializando os próximos!
		
	}
}