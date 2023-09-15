package patterns.abtractFactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveEmitirContratoPF() {
        FabricaAbstrata fabrica = new FabricaPF();
        Cliente cliente = new Cliente(fabrica);

        assertEquals("Contrato de Pessoa Física", cliente.emitirContrato());
    }

    @Test
    void deveEmitirDistratoPF() {
        FabricaAbstrata fabrica = new FabricaPF();
        Cliente cliente = new Cliente(fabrica);

        assertEquals("Distrato de Pessoa Física", cliente.emitirDistrato());

    }

    @Test
    void deveEmitirProcuracaoPF() {

        FabricaAbstrata fabrica = new FabricaPF();
        Cliente cliente = new Cliente(fabrica);

        assertEquals("Procuracao de Pessoa Física", cliente.emitirProcuracao());

    }

    @Test
    void deveEmitirContratoPJ() {
        FabricaAbstrata fabrica = new FabricaPJ();
        Cliente cliente = new Cliente(fabrica);

        assertEquals("Contrato de Pessoa Jurídica", cliente.emitirContrato());

    }

    @Test
    void deveEmitirDistratoPJ() {
        FabricaAbstrata fabrica = new FabricaPJ();
        Cliente cliente = new Cliente(fabrica);

        assertEquals("Distrato de Pessoa Jurídica", cliente.emitirDistrato());
    }

    @Test
    void deveEmitirProcuracaoPJ() {

        FabricaAbstrata fabrica = new FabricaPJ();
        Cliente cliente = new Cliente(fabrica);

        assertEquals("Procuracao de Pessoa Jurídica", cliente.emitirProcuracao());
    }
}