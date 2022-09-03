import java.util.ArrayList;

public class Dados {

	
	public static ArrayList < Aluno > ListaAluno() {
		
		ArrayList < Aluno > listaAluno = new ArrayList < Aluno >(); 
			
		listaAluno.add(new Aluno("Matheus Anderson oliveira",261,new Materia(0, "Programacao"),0,new Turma(Periodo.MANHA,"Artes cenicas")));
		listaAluno.add(new Aluno("Franccesco Felipe ",268,new Materia(0, "Programacao"),0,new Turma(Periodo.MANHA,"Artes cenicas")));
		listaAluno.add(new Aluno("Micael Rodrigues",278,new Materia(0, "Programacao"),0,new Turma(Periodo.MANHA,"Artes cenicas")));
	
		
		return listaAluno;
	}
	
	
}