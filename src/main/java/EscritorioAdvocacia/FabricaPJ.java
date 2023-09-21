package EscritorioAdvocacia;

public class FabricaPJ implements FabricaAbstrata{
    @Override
    public Contrato criarContrato() {
        return new ContratoPJ();
    }

    @Override
    public Procuracao criarProcuracao() {
        return new ProcuracaoPJ();
    }

    @Override
    public Distrato criarDistrato() {
        return new DistratoPJ();
    }
}
