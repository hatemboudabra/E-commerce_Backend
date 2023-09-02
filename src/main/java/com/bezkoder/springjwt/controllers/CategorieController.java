package com.bezkoder.springjwt.controllers;

import com.bezkoder.springjwt.models.Categorie;
import com.bezkoder.springjwt.services.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/categorie")
public class CategorieController {
    @Autowired
    CategorieService categorieService;
    @PostMapping(path = "/addCatt")
 public void addCatt(@RequestBody String name){
        categorieService.addcategorie(name);
    }
    @PutMapping(path = "/updateCat")
    public void updateCat(@RequestBody long id, String name){categorieService.updateCategorie(id,name);}
    @GetMapping(path = "/getallCat")
    List<Categorie> getallCat(){
        return categorieService.getAllCategorie();
    }
}
