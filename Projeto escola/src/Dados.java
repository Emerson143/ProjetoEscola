import java.util.ArrayList;

public class Dados {

	
	public static ArrayList < Aluno > _ListaAluno() {
		
		ArrayList < Aluno > listaAluno = new ArrayList < Aluno >(); 
			
		listaAluno.add(new Aluno("Franccesco Felipe ", 261, 0, new Turma(Periodo.MANHA,Curso.ARTES)));
		
	
		
		return listaAluno;
	}
	
	
}