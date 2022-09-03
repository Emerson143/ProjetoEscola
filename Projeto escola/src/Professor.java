import java.util.Locale;
import java.util.Scanner;

public class Professor {

	private String name;
	private int id;

	public Professor(String name, int id) {

		this.name = name;
		this.id = id;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static void limpaTela() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public static void AcessoProfessor() {
		Scanner sc = new Scanner(System.in);

		Boolean laco = true;

		System.out.println("===========================================");
		System.out.println("=         BEM VINDO PROFESSOR             =");
		System.out.println("===========================================");

		while (laco) {

			System.out.println();
			System.out.println("******************************************");
			System.out.println("* 1-  Lancar nota do aluno               *");
			System.out.println("******************************************");

			System.out.print("Digite o ID do aluno: ");
			String resposta = sc.nextLine();
			System.out.println();

			switch (resposta) {

			case "261":
				System.out.println("Aluno: " + Dados._ListaAluno().get(0).getName());
				System.out.print("Dados do aluno: " + Dados._ListaAluno().get(0).getTurma().toString());
				
				notadoAluno(); 
				System.out.println();
				sc.nextInt();
				System.out.print("Dados do aluno: " + Dados._ListaAluno().get(0).getPresenca());
				break;
			case "268":
				System.out.println("Aluno: " + Dados._ListaAluno().get(1).getName().toString());
				break;
			case "278":
				System.out.println("Aluno: " + Dados._ListaAluno().get(2).getName().toString());

				break;

			default:
				System.out.println("");
				System.out.println("Op��o invalida por favor digite novamente...");
				System.out.println("");
				System.out.print("Digite sua op��o: ");
				resposta = sc.nextLine();

			}
		}

	}
	public static void  notadoAluno() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Digite a nota do aluno: ");
		int codigo = sc.nextInt();
		
		Dados._ListaAluno().get(0).setPresenca(codigo);              //.setPresenca(codigo);
		
	}
}
