package EscritorioAdvocacia;

public class ContratoPJ implements Contrato{

    @Override
    public String emitir() {
        return "Contrato de Pessoa Jurídica";
    }
}
