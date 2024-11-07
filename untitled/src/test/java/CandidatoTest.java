import org.example.Candidato;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CandidatoTest {

    @Test
    public void testIdadeInsuficiente() {
        Candidato candidato = new Candidato(17, 3, false, false, 60000);
        assertEquals("Empréstimo negado: idade insuficiente.", candidato.verificarElegibilidade());
    }

    @Test
    public void testEmpregoInstavel() {
        Candidato candidato = new Candidato(18, 1, false, false, 60000);
        assertEquals("Empréstimo negado: emprego instável.", candidato.verificarElegibilidade());
    }

    @Test
    public void testCreditoNegativo() {
        Candidato candidato = new Candidato(18, 2, true, false, 60000);
        assertEquals("Empréstimo negado: histórico de crédito negativo.", candidato.verificarElegibilidade());
    }

    @Test
    public void testRendaInsuficienteParaAutonomos() {
        Candidato candidato = new Candidato(18, 2, false, true, 49999);
        assertEquals("Empréstimo negado: renda insuficiente para autônomos.", candidato.verificarElegibilidade());
    }

    @Test
    public void testEmprestimoAprovadoAutonomo() {
        Candidato candidato = new Candidato(18, 2, false, true, 50000);
        assertEquals("Empréstimo aprovado.", candidato.verificarElegibilidade());
    }

    @Test
    public void testEmprestimoAprovadoNaoAutonomo() {
        Candidato candidato = new Candidato(18, 2, false, false, 60000);
        assertEquals("Empréstimo aprovado.", candidato.verificarElegibilidade());
    }
}