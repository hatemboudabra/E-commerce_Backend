package com.bezkoder.springjwt.controllers;

import com.bezkoder.springjwt.models.Facture;
import com.bezkoder.springjwt.payload.request.FactureRequest;
import com.bezkoder.springjwt.services.FactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/facture")
public class FactureController {
    @Autowired
    FactureService factureService;
    @PostMapping(path = "/addfacture")
    public void addFacture(@RequestBody FactureRequest factureRequest) {factureService.addFacture(factureRequest);}

    @GetMapping(path = "/getallfact")
    List<Facture> gettall(){
        return factureService.getAllFacture();
    }
}
