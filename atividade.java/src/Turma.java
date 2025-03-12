import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nometurma;
    private List<Aluno> alunos;

    public Turma(String nometurma) {
        this.nometurma = nometurma;
        this.alunos = new ArrayList<>();
    }
    public String getNomeTurma() {
        return nometurma;
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void listarAlunos() {
        System.out.println("Alunos da Turma " + this.nometurma + ":");
        for (Aluno aluno : this.alunos) {
            System.out.println("- " + aluno.getNome() + " : " + aluno.getMatricula());
        }
    }
}
