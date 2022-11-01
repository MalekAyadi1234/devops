package tn.esprit.rh.achat.services;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.rh.achat.entities.Produit;
import tn.esprit.rh.achat.services.IProduitService;

import java.util.List;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProduitServiceTest {

    @Autowired
    IProduitService ps;

    @Test
    @Order(1)
    public void testRetrieveAllUsers() {
        List<Produit> listProduits = ps.retrieveAllProduits();
        Assertions.assertEquals(0, listProduits.size());
    }


}
