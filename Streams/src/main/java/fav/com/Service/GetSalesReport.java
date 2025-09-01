package fav.com.Service;

import fav.com.DTOS.DTOSalesReport;
import fav.com.Entitys.Product;
import fav.com.Entitys.Sale;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GetSalesReport {




    public List<DTOSalesReport> getSalesReport(List<Sale> list){
        List<DTOSalesReport> response = new ArrayList<>();

        list.stream().collect(Collectors
                .groupingBy(Sale::getProductId, Collectors.summingInt(Sale::getAmount)))
                .entrySet().stream().forEach(
                        entry -> {
                            DTOSalesReport dto = new DTOSalesReport();
                            dto.setProductName(entry.getKey().getName());
                            dto.setAmount(entry.getValue());
                            dto.setTotalFacture(Double.parseDouble(String.valueOf(entry.getValue() * entry.getKey().getPrice())));
                            response.add(dto);
                        }
                );

        return response;
    }
}
