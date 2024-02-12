package com.ShopAndStock.shoppingCart.Service;


import com.ShopAndStock.shoppingCart.entities.Product;
import com.ShopAndStock.shoppingCart.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

//encargada de las operaciones CRUD junto con manejo de excepciones
public class ProductService {


    @Autowired
    ProductRepository pr;

    //Create product
    public void addProduct(){

    }

    //Delete an entire product
    public void deleteProduct(int id){

    }


    //Edit product
    public void editProduct(int id, Product product){

    }

    //List products
    public void listAllProducts(){

    }


}
