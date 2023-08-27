package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public class Aluno extends BasePessoa{

  
    private String Matricula;
    private LocalDate DataMatricula;

    public String getMatricula() {
        return Matricula;
    }
    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }
    public LocalDate getDataMatricula() {
        return DataMatricula;
    }
    public void setDataMatricula(LocalDate DataMatricula) {
        this.DataMatricula = DataMatricula;
    }

      public Aluno(int Codigo, String Nome, String Endereco, String Telefone, LocalDate DataNascimento, String Rg,
            String Cpf, LocalDate Data, String Registro, LocalDate Contratacao, String Matricula, LocalDate DataMatricula) {
            super(Codigo, Nome, Endereco, Telefone, DataNascimento, Rg, Cpf, Data, Registro, Contratacao, Matricula, DataMatricula);
            this.Matricula = Matricula;
            this.DataMatricula = DataMatricula;
               
    }
    
}
