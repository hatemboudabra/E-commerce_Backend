package com.bezkoder.springjwt.services;

import com.bezkoder.springjwt.models.Facture;
import com.bezkoder.springjwt.payload.request.FactureRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FactureService {
    void addFacture(FactureRequest factureRequest);
    Facture getFacture(Long id);
    List<Facture> getAllFacture();
}
