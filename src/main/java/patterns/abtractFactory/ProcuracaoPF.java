package patterns.abtractFactory;

public class ProcuracaoPF implements Procuracao{

    @Override
    public String emitir() {
        return "Procuracao de Pessoa Física";
    }
}
