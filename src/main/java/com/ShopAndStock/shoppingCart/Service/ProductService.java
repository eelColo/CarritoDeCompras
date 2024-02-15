package com.ShopAndStock.shoppingCart.Service;


import com.ShopAndStock.shoppingCart.entities.Product;
import com.ShopAndStock.shoppingCart.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//encargada de las operaciones CRUD junto con manejo de excepciones
@Service
public class ProductService {


    @Autowired
    ProductRepository pr;

    //Create product
    public void addProduct(Product product){



        pr.save(product);
    }

    //Delete an entire product
    public void deleteProduct(Long id){




        pr.deleteById(id);

    }


    //Edit product
    public void editProduct(Long id, Product product){




        Product newProd = pr.findById(id).orElseThrow();

        newProd.setName(product.getName());
        newProd.setDescription(product.getDescription());
        newProd.setPrice(product.getPrice());
        newProd.setStock(product.getStock());

        pr.save(newProd);


    }

    //List products
    public List<Product> listAllProducts(){

        return pr.findAll();
    }

    //FindById
    public Product findProductById(Long id){


        return pr.findById(id).orElse(null);
    }


}
