
import java.time.LocalDate;

import uniderp.loo.escola.dominio.Aluno;
import uniderp.loo.escola.dominio.Professor;

public class App {
    public static void main(String[] args) throws Exception {
 

        Professor P1= new Professor(0, null, null, null, null, null, null, null, null, null, null, null);
        
            P1.setCodigo(1);
            P1.setNome("marcos");
            P1.setEndereco("Av");
            P1.setDataNascimento(LocalDate.of(1993,9,23));
            P1.setRg("001931");
            P1.setCpf("05144412441");
            P1.setDataInsercao(LocalDate.now());

        Aluno A1= new Aluno(0, null, null, null, null, null, null, null, null, null, null, null);
        
            A1.setCodigo(1);
            A1.setNome("marcos");
            A1.setEndereco("Av");
            A1.setDataNascimento(LocalDate.of(1993,9,23));
            A1.setRg("001931");
            A1.setCpf("05144412441");
            A1.setDataInsercao(LocalDate.now());
       
    }

    
}
