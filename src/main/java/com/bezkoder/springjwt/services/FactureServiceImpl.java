package com.bezkoder.springjwt.services;

import com.bezkoder.springjwt.models.Commande;
import com.bezkoder.springjwt.models.Facture;
import com.bezkoder.springjwt.payload.request.FactureRequest;
import com.bezkoder.springjwt.repository.CommandeRepo;
import com.bezkoder.springjwt.repository.FactureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactureServiceImpl implements FactureService {
    @Autowired
    FactureRepo factureRepo;
    @Autowired
    CommandeRepo commandeRepo;

    @Override
    public void addFacture(FactureRequest factureRequest) {
        Facture facture = new Facture();
        facture.setDate_facture(factureRequest.getDate_facture());
        facture.setRemise(factureRequest.getRemise());
        Commande commande = commandeRepo.findById(factureRequest.getIdcommande()).get();
        facture.setCommande(commande);
        facture = factureRepo.save(facture);
        commande.setFacture(facture);
        commandeRepo.save(commande);
    }

    @Override
    public Facture getFacture(Long id) {
        return factureRepo.findById(id).get();
    }

    @Override
    public List<Facture> getAllFacture() {
        return factureRepo.findAll();
    }
}
