package Aggregator;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    void deveExibirPerfilInstagram() {
        AbstractFactory factory = new InstagramFactory();
        Client client = new Client(factory);

        assertEquals("Perfil de Instagram", client.displayProfile());
    }

    @Test
    void deveExibirPerfilLinkedin() {
        AbstractFactory factory = new LinkedinFactory();
        Client client = new Client(factory);

        assertEquals("Perfil profissional", client.displayProfile());
    }

    @Test
    void deveExibirPostInstagram() {
        AbstractFactory factory = new InstagramFactory();
        Client client = new Client(factory);

        assertEquals("Post de foto", client.displayPost());
    }


    @Test
    void deveExibirPostLinkedin() {
        AbstractFactory factory = new LinkedinFactory();
        Client client = new Client(factory);

        assertEquals("Post profissional", client.displayPost());
    }

}