package fav.com.Service;

import fav.com.Entitys.Product;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.LongToDoubleFunction;

public class MapProductByCategory {




    public Map<String, List<Product>> mapByCategory(String category, List<Product> list){

        Map<String, List<Product>> response = new HashMap<>();
        response.put(category, list.stream().filter(product -> product.getCategory()
                .equalsIgnoreCase(category)).toList());
        return response;

    }
    public Map<String, Long> countMap(String category, List<Product> list){
        Long size = list.stream().filter(product -> product.getCategory().equalsIgnoreCase(category))
                .count();
        Map<String, Long> response = new HashMap<>();
        response.put(category, size);
        return response;

    }


}
