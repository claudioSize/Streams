package fav.com.Service;

import fav.com.Entitys.Client;
import fav.com.Entitys.Sale;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GetBuyClientAmount {

    public List<Client> getClientListByAmount(List<Sale> list){
        List<Sale> newSaleList = new ArrayList<>();
        List<Client> response = new ArrayList<>();
        list.stream().collect(Collectors
                        .groupingBy(sale -> sale, Collectors.summingInt(Sale::getAmount)))
                .entrySet().stream().forEach(
                        entry -> {
                            Sale sale = entry.getKey();
                            double actualPrice = sale.getProductId().getPrice();
                            sale.getProductId().setPrice(entry.getValue() * actualPrice);
                            newSaleList.add(sale);
                        }
                );
        newSaleList.stream().sorted(Comparator.comparing(sale -> sale.getProductId().getPrice(),Comparator.reverseOrder()))
                .forEach(
                        sale -> {
                            response.add(sale.getClientId());
                        }
                );

        return response;
    }
}
