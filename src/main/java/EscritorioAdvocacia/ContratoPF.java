package EscritorioAdvocacia;

public class ContratoPF implements Contrato{
    @Override
    public String emitir() {
        return "Contrato de Pessoa Física";
    }
}
