package com.example.productservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
   Long id;
   String title;
   Double price;
   Category category;
}
