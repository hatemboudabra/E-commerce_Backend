package com.bezkoder.springjwt.controllers;

import com.bezkoder.springjwt.models.Commande;
import com.bezkoder.springjwt.payload.request.CommandeRequest;
import com.bezkoder.springjwt.services.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/commande")
public class CommandeController {
    @Autowired
    CommandeService commandeService;
    @PostMapping(path = "/addCommande")
    public Commande addCommande(@RequestBody CommandeRequest commandeRequest) throws Exception{ return commandeService.addCommande(commandeRequest);}
  @PutMapping(path = "/updateComm")
  public void updateCommande(@RequestBody long id, long idLigne){ commandeService.updateCommande(id,idLigne);}

    @GetMapping(path = "/getallCommande")
    List<Commande> gettall(){
        return commandeService.getAllCommande();
    }
}
