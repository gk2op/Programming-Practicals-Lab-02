package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name = "product1")
public class ProductEntity {
    @GeneratedValue(strategy = GenerationType.AUTO) 
    @Id
    int id;
    String ProductName;
    String ProductQuentity;
    String  Price;
}
