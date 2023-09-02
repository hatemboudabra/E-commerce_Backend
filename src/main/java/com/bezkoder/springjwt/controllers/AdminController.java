package com.bezkoder.springjwt.controllers;

import com.bezkoder.springjwt.models.Role;
import com.bezkoder.springjwt.models.User;
import com.bezkoder.springjwt.services.AdminServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    AdminServices adminServices;
@GetMapping(path = "/getAllUsers")
    List<User> getAllUsers(){
    return adminServices.getall();
}
@PostMapping(path = "/updateUser/{id}")
    void UpdatUser(@PathVariable Long id, @RequestBody String role){
    adminServices.UpdateROle(id,role);
}
@GetMapping(path = "/getAllRole")
    List<Role> getAllRole(){
    return adminServices.getAllROles();
}
}
