import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Professor {

	Dados _dados = new Dados();
	static ArrayList<Aluno> _listaAluno = Dados._ListaAluno();
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
			System.out.println("*     Lancar nota do aluno               *");
			System.out.println("******************************************");

			
			String resposta;
			
			while(true){
				
				System.out.println();
				System.out.print("Digite 1 para lan�a notas, ou 2 para voltar ao menu principal.");
				resposta = sc.nextLine();
				
				if(resposta.equals("2") ) {
					return;
					
				}
				System.out.println();
				
				
			switch (resposta) {

			case "261":
				System.out.println("Aluno: " + Dados._ListaAluno().get(0).getName());
				System.out.print("Dados do aluno: " + Dados._ListaAluno().get(0).getTurma().toString());

				NotaDoAluno(0);
				System.out.print("Nota do aluno: " + _listaAluno.get(0).getPresenca());

				break;
				
			case "268":
				System.out.println("Aluno: " + Dados._ListaAluno().get(1).getName());
				System.out.print("Dados do aluno: " + Dados._ListaAluno().get(1).getTurma().toString());

				NotaDoAluno(1);
				System.out.print("Nota do aluno: " + _listaAluno.get(1).getPresenca());
				break;
			case "278":
				System.out.println("Aluno: " + Dados._ListaAluno().get(2).getName());
				System.out.print("Dados do aluno: " + Dados._ListaAluno().get(2).getTurma().toString());

				NotaDoAluno(2);
				System.out.print("Nota do aluno: " + _listaAluno.get(2).getPresenca());

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
	}


	public static void NotaDoAluno(int n) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Digite a nota do 1 bismeste: ");	
		int codigo = sc.nextInt();
		System.out.println("Digite a nota do 2 bismeste: ");	
		int codigo1 = sc.nextInt();
		System.out.println("Digite a nota do 3 bismeste: ");	
		int codigo2 = sc.nextInt();
		System.out.println("Digite a nota do 4 bismeste: ");	
		int codigo3 = sc.nextInt();
		
		int valorTotal= (codigo+codigo1+codigo2+codigo3) /4;
		

		
		_listaAluno.get(n).setPresenca(valorTotal);
	}

}