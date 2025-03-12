import java.util.ArrayList;

public class Universidade {
    String nome;
    ArrayList<Curso> cursos = new ArrayList<Curso>();
    ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public Universidade(){};

    public Universidade(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void cadastrar_aluno(Aluno aluno){
        this.alunos.add(aluno);
        for (Curso curso : this.cursos) {
            if(curso.getCodigo().equals(aluno.getCurso())){
                curso.setAlunos(aluno);
            }
        }
    }

    public void cadastrar_curso(Curso curso){
        this.cursos.add(curso);
    }

    public void jubilar_aluno(Aluno aluno){
        this.alunos.remove(aluno);
    }

    public void desligar_curso(Curso curso){
        this.cursos.remove(curso);
    }

    @Override
    public String toString() {
        return "Universidade{" +
                "nome='" + nome + '\'' +
                ", cursos=" + cursos +
                ", alunos=" + alunos +
                '}';
    }

    public void listarcursos() {
        System.out.println("Cursos:");
        for (Curso curso : this.cursos) {
            System.out.println("- " + curso.getNome() + " : " + curso.getCodigo());
        }
    }

    public void listaralunos() {
        System.out.println("Alunos Cadastrados:");
        for (Aluno aluno: this.alunos) {
            System.out.println("- " + aluno.getNome() + " : " + aluno.getMatricula());
        }
    }
}
