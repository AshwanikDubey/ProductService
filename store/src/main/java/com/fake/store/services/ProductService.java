package com.fake.store.services;

import com.fake.store.dto.Productdto;

public interface ProductService {
    Productdto getProductById(Long id);
}
