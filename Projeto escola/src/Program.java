import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
				
				Scanner sc = new Scanner(System.in);
				
				
				
				
				Boolean laco = true;
				
				System.out.println("===========================================");
				System.out.println("=                                         =");
				System.out.println("=        SEJAM BEM VINDO A ESCOLA         =");
				System.out.println("=                                         =");
				System.out.println("===========================================");
				System.out.println();
					
				System.out.println("===========================================");
				System.out.println("=ENTRE COM SUA OP��O SUA OP��O DE USUARIO =");
				System.out.println("===========================================");
				
				
				while (laco) {
					
					System.out.println();
					System.out.println("******************************************");
					System.out.println("* 1 - Alunos                              *");	
					System.out.println("* 2 - Professores                          *");
				   	System.out.println("******************************************");
					
					System.out.print("Digite sua op��o: ");
					String resposta = sc.nextLine();
					System.out.println();
					
					switch ( resposta) {
					
					case "1" :
						Aluno.acessoALuno();

						break;
					case "2" :
						Professor.AcessoProfessor();

						break;
					
					default:
						System.out.println("");
						System.out.println("Op��o invalida por favor digite novamente...");
						System.out.println("");
						System.out.print("Digite sua op��o: ");
						resposta = sc.nextLine();
					
						
						sc.close();
					}
				}
				Professor.limpaTela();
			}
		}
		
		
	


