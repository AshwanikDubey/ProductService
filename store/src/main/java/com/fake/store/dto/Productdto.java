package com.fake.store.dto;

import lombok.Data;

@Data
public class Productdto {
    private String id;
    private String title;
    private String price;
    private String description;
    private Category category;
}
