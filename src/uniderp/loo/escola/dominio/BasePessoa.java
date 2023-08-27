package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public class BasePessoa {

    protected int Codigo;
    protected String Nome;
    protected String Endereco;
    protected String Telefone;
    protected LocalDate DataNascimento;
    protected String Rg;
    protected String Cpf;
    protected LocalDate DataInsercao;
    
    public int getCodigo() {
        return Codigo;
    }
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public String getEndereco() {
        return Endereco;
    }
    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }
    public String getTelefone() {
        return Telefone;
    }
    public void setTelefone(String telefone) {
        this.Telefone = telefone;
    }
    public LocalDate getDataNascimento() {
        return DataNascimento;
    }
    public void setDataNascimento(LocalDate DataNascimento) {
        this.DataNascimento = DataNascimento;
    }
    public String getRg() {
        return Rg;
    }
    public void setRg(String Rg) {
        this.Rg = Rg;
    }
    public String getCpf() {
        return Cpf;
    }
    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }
    public LocalDate getDataInsercao() {
        return DataInsercao;
    }
    public void setDataInsercao(LocalDate DataInsercao) {
        this.DataInsercao = DataInsercao;
    }

    public BasePessoa(int Codigo, String Nome, String Endereco, String Telefone, LocalDate DataNascimento, String Rg,
            String Cpf, LocalDate Data, String Registro, LocalDate Contratacao, String Matricula, LocalDate DataMatricula) {
        this.Codigo = Codigo;
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
        this.DataNascimento = DataNascimento;
        this.Rg = Rg;
        this.Cpf = Cpf;
        this.DataInsercao = Data;
    }
    
    

}
