package patterns.abtractFactory;

public class ProcuracaoPJ implements Procuracao{

    @Override
    public String emitir() {
        return "Procuracao de Pessoa Jurídica";
    }
}
