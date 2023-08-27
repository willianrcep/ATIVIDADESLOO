package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public class Professor extends BasePessoa {
    
    public Professor(int Codigo, String Nome, String Endereco, String Telefone, LocalDate DataNascimento, String Rg,
            String Cpf, LocalDate Data, String Registro, LocalDate Contratacao, String Matricula,
            LocalDate DataMatricula) {
                super(Codigo, Nome, Endereco, Telefone, DataNascimento, Rg, Cpf, Data, Registro, Contratacao, Matricula, DataMatricula);
                this.Registro = Registro;
                this.Contratacao = Contratacao;
        }
    private String Registro;
    private LocalDate Contratacao;
    
    public String getRegistro() {
        return Registro;
    }
    public void setRegistro(String Registro) {
        this.Registro = Registro;
    }
    public LocalDate getContratacao() {
        return Contratacao;
    }
    public void setContratacao(LocalDate Contratacao) {
        this.Contratacao = Contratacao;
    }

}
