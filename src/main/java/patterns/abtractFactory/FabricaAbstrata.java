package patterns.abtractFactory;

public interface FabricaAbstrata {

    Contrato criarContrato();
    Procuracao criarProcuracao();
    Distrato criarDistrato();
}
