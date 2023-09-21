package EscritorioAdvocacia;

public class FabricaPF implements FabricaAbstrata{
    @Override
    public Contrato criarContrato() {
        return new ContratoPF();
    }

    @Override
    public Procuracao criarProcuracao() {
        return new ProcuracaoPF();
    }

    @Override
    public Distrato criarDistrato() {
        return new DistratoPF();
    }
}
