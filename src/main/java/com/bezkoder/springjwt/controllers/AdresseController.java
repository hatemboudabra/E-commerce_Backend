package com.bezkoder.springjwt.controllers;

import com.bezkoder.springjwt.models.Adresse;
import com.bezkoder.springjwt.payload.request.AdresseRequest;
import com.bezkoder.springjwt.services.AdresseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/adresse")
public class AdresseController {
    @Autowired
    AdresseService adresseService;
    @PostMapping(path = "/addadresse")
    public void addadresse(@RequestBody AdresseRequest adresseRequest){adresseService.addAdresse(adresseRequest);}
    @GetMapping(path = "/getAllAdress")
    List<Adresse> getAllUsers(){return adresseService.getallAdresse();}


}
