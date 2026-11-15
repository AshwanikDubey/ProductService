package com.fake.store.services.impl;

import com.fake.store.dto.Category;
import com.fake.store.dto.FakeStoreDto;
import com.fake.store.dto.Productdto;
import com.fake.store.services.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductServiceImpl implements ProductService {
    RestTemplate restTemplate;
    public ProductServiceImpl( RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Override
    public Productdto getProductById(Long id) {

        FakeStoreDto fkdto = restTemplate.getForObject("https://fakestoreapi.com/products/"+id, FakeStoreDto.class);
        return convertFakeStoreDtoToProduct(fkdto);
    }
    private Productdto convertFakeStoreDtoToProduct(FakeStoreDto fkdto){
        Productdto pr = new Productdto();
        if(fkdto != null){
            pr.setId(fkdto.getId());
            pr.setTitle(fkdto.getTitle());
            pr.setPrice(fkdto.getPrice());
            pr.setDescription(fkdto.getDescription());
            Category category = new Category();
            category.setId(fkdto.getId());
            category.setCategoryName(fkdto.getCategory());
            pr.setCategory(category);
        }
        return pr;
    }
}
