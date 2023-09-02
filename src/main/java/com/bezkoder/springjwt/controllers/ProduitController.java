package com.bezkoder.springjwt.controllers;

import com.bezkoder.springjwt.models.Produit;
import com.bezkoder.springjwt.payload.request.ProduitRequest;
import com.bezkoder.springjwt.services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/produit")
public class ProduitController {
    @Autowired
    ProduitService produitService;
    @PostMapping(path = "/addproduit")
    public void addproduit(@RequestBody ProduitRequest produitRequest){produitService.addProd(produitRequest);}
    @PutMapping(path = "/updateproduit")
    public void updateproduit(@RequestBody long id , ProduitRequest produitRequest){produitService.updateProd(id,produitRequest);}
    @GetMapping(path = "/getallproduit")
    List<Produit>  gettall() {return produitService.getAllProd();}
}
