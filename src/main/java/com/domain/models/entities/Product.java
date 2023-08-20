package com.domain.models.entities;

import java.io.Serializable;

import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tbl_books")
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
public class Product implements Serializable {
 //Primary Key
 @Id
 //Auto Increment
 @GeneratedValue(strategy = GenerationType.IDENTITY) 
 private long id;

 @NotEmpty(message =  "Name must not be null")
 @Column(name = "product_name", length = 100)
 private String name;

 @NotEmpty(message =  "Name must not be null")
 @Column(name = "product_description", length = 500)
 private String description;
 private String price;



}
