package com.agenciacristal.New.Crud.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service public class ProductService {

    HashMap<String, Object> data;
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    public List<Product> getProducts() {
        return this.productRepository.findAll();
    }

    public ResponseEntity<Object> newProduct(Product product) {
        Optional<Product> res = productRepository.findProductByName(product.getName());
        data = new HashMap<>();


        if(res.isPresent() && product.getId()==null){
            data.put("error", true);
            data.put("message", "Product already exists with that name");
            return new ResponseEntity<>(
                    data,
                    HttpStatus.CONFLICT
            );
        }
        data.put("message", "The update was successful.");
        if(product.getId()!=null){
            data.put("message", "It was updated successfully.");
        }
        productRepository.save(product);
        data.put("data", product);

        return new ResponseEntity<>(
                data,
                HttpStatus.CREATED
        );
    }

    public ResponseEntity<Object> deleteProduct(Long id){
        data = new HashMap<>();
        boolean exist=this.productRepository.existsById(id);
        if(!exist){
            data.put("error", true);
            data.put("message", "No exists a product with that id");
            return new ResponseEntity<>(
                    data,
                    HttpStatus.CONFLICT
            );
        }
        productRepository.deleteById(id);
        data.put("message", "Product deleted");
        return new ResponseEntity<>(
                data,
                HttpStatus.ACCEPTED
        );
    }
}
