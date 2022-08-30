package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Id;


@Data

@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id

    private int id;
    private String name;
    private int quantity;
    private double price;
}
