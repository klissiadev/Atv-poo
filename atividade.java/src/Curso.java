import java.util.ArrayList;

public class Curso {
    private String nome;
    private String codigo;
    private ArrayList<Aluno> alunos;
    private ArrayList<Materia> materias;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public Curso(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public void cadastrar_materia(String nome_materia) {
        Materia materia = new Materia(nome_materia, this.codigo);
        this.materias.add(materia);
    }

    public void matricular_aluno_materia(Aluno aluno, Materia materia) {
        aluno.setMaterias(materia);
    }

    public void trancar_aluno_materia(Aluno aluno, Materia materia) {
        aluno.getMaterias().remove(materia);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                ", alunos=" + alunos +
                ", materias=" + materias +
                '}';
    }
}
