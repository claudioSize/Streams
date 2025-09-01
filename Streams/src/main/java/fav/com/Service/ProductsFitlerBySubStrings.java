package fav.com.Service;

import fav.com.Entitys.Product;

import java.util.List;

public class ProductsFitlerBySubStrings {


    public List<Product> fitlerBySubStrings(String request, List<Product> list){

        List<Product> response = list.stream().filter(product -> product.getName().toLowerCase().contains(request.toLowerCase()))
                .toList();

        return response;

    }

}
