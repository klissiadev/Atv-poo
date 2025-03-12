import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private String email;
    private ArrayList<Materia> materias;

    public Aluno() {}

    public Aluno(String nome, String matricula, String curso, String email) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(Materia materia) {
        this.materias.add(materia);
    }

    @Override
    public String toString() {
        return "Aluno " +
                "Nome: " + nome + '\'' +
                ", Matricula: " + matricula + '\'' +
                ", Curso: " + curso + '\'' +
                ", Email: " + email + '\'' +
                ", Materias: " + materias + '\'';
    }
}

