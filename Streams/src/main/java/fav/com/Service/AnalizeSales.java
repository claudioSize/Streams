package fav.com.Service;

import fav.com.Entitys.Product;
import fav.com.Entitys.Sale;

import java.util.*;
import java.util.stream.Collectors;

public class AnalizeSales {



    public double getTotalOfSales(List<Sale> list){

        return list.stream().mapToDouble(sale->sale.getAmount() * sale.getProductId().getPrice()).sum();
    }
    public Map<String, Integer> getMostSaleProducts(List<Sale> list){
        Map<String, Integer> sum = list.stream().collect(Collectors
                .groupingBy(sale -> sale.getProductId().getId(), Collectors.summingInt(Sale::getAmount)));

        return sum.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue,Comparator.reverseOrder())).limit(3)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));
    }
    public double getTicket(List<Sale> list){

        double saleSum = list.stream().mapToDouble(
                sale -> sale.getProductId().getPrice() * sale.getAmount()
        ).sum();

        return  saleSum / list.size();
    }
    public Map<String, Double> getSaleOfCountry(List<Sale> list){

        Map<String, Double> response = list.stream().collect(Collectors
                .groupingBy(sale -> sale.getClientId().getCountry(), Collectors.summingDouble(sale-> sale.getProductId().getPrice())));
        return response;
    }
    public Optional<Product> getFactureBestAmount(List<Sale> list){
        Map<String,Double> mostSale = list.stream().collect(Collectors.groupingBy(
                sale -> sale.getProductId().getName(), Collectors.summingDouble(sale -> sale.getProductId().getPrice() * sale.getAmount())
        ));
        List<String> mapToFind = mostSale.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue,Comparator.reverseOrder()))
                .limit(1).map(Map.Entry::getKey).toList();
        List<Sale> saleR = list.stream().filter(sale -> sale.getProductId().getName().equals(mapToFind.get(0))).toList();
        return Optional.ofNullable(saleR.get(0).getProductId());
    }
    /*
    //codigo de ia para comparar la logica es la misma pero con metodos de stream
    public Optional<Product> getFactureBestAmount(List<Sale> list) {
    return list.stream()
        .collect(Collectors.groupingBy(
            sale -> sale.getProductId(),
            Collectors.summingDouble(sale -> sale.getProductId().getPrice() * sale.getAmount())
        ))
        .entrySet()
        .stream()
        .max(Map.Entry.comparingByValue())
        .map(Map.Entry::getKey);
}
     */

}
