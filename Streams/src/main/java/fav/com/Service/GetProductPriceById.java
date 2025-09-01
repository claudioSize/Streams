package fav.com.Service;

import fav.com.Entitys.Product;

import java.util.List;

public class GetProductPriceById {





    public Double GetProductPriceById(String key, List<Product> list){


        return list.stream().filter(product -> product.getId().equalsIgnoreCase(key))
                .mapToDouble(Product::getPrice).sum();
    }
}
