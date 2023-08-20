package com.domain.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.models.entities.Product;
import com.domain.services.ProductServices;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/products")
public class ProductController{

 @Autowired
 private ProductServices productServices;

 @PostMapping
 public Product create(@Valid @RequestBody Product product, Errors errors){
  if(errors.hasErrors()){
   for (ObjectError error : errors.getAllErrors()) {
    System.out.println(error.getDefaultMessage());
   }
   throw new RuntimeException("Validation erros");
  }
  return productServices.save(product);
 }

 @GetMapping
 public Iterable<Product> findAll(){
  return productServices.findAll();
 }

 @GetMapping("{id}")
 public Product findOne(@PathVariable("id") Long id){
  return productServices.findOne(id);
 }

 @PutMapping
 public Product update(@Valid @RequestBody Product product){
  return productServices.save(product);
 }

  @DeleteMapping("{id}")
 public void deleteById(@PathVariable("id") Long id){
   productServices.deleteOne(id);
 }

}