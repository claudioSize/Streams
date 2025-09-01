package fav.com.Service;

import fav.com.Entitys.Product;

import java.util.List;

public class GetProductsListByCategory {


    public List<String> productsByCategory(String category, List<Product> productsList){

        List<String> newList = productsList.stream().
                filter(product -> product.getCategory().equals(category))
                .map(Product::getName).toList();

        return newList;
    }


}
