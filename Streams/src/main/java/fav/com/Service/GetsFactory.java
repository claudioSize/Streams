package fav.com.Service;

import fav.com.DTOS.DTOSalesReport;
import fav.com.Entitys.Client;
import fav.com.Entitys.Product;
import fav.com.Entitys.Sale;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class GetsFactory {

    private final GetProductsListByCategory getProductsListByCategory;
    private final GetClientWithNoEmail getClientWithNoEmail;
    private final ProductsFitlerBySubStrings productsFitlerBySubStrings;
    private final MapProductByCategory mapProductByCategory;
    private final GetClientsOfList getClientsOfList;
    private final AnalizeSales analizeSales;
    private final FindClientsByEmail findClientsByEmail;
    private final GetProductPriceById getProductPriceById;
    private final GetSalesReport salesReport;
    private final GetBuyClientAmount getBuyClientAmount;


    public GetsFactory(GetProductsListByCategory getProductsListByCategory, GetClientWithNoEmail getClientWithNoEmail, ProductsFitlerBySubStrings productsFitlerBySubStrings, MapProductByCategory mapProductByCategory, GetClientsOfList getClientsOfList, AnalizeSales analizeSales, FindClientsByEmail findClientsByEmail, GetProductPriceById getProductPriceById, GetSalesReport salesReport, GetBuyClientAmount getBuyClientAmount) {
        this.getProductsListByCategory = getProductsListByCategory;
        this.getClientWithNoEmail = getClientWithNoEmail;
        this.productsFitlerBySubStrings = productsFitlerBySubStrings;
        this.mapProductByCategory = mapProductByCategory;
        this.getClientsOfList = getClientsOfList;
        this.analizeSales = analizeSales;
        this.findClientsByEmail = findClientsByEmail;
        this.getProductPriceById = getProductPriceById;
        this.salesReport = salesReport;
        this.getBuyClientAmount = getBuyClientAmount;
    }

    public List<String> getProductsListByCategory(String category, List<Product> list){

        return getProductsListByCategory.productsByCategory(category, list);
    }

    public List<Client> getClientWithNoEmail(List<Client> list){


        return getClientWithNoEmail.getClientWithNoEmail(list);
    }
    public List<Product> filterBySubString(String request, List<Product> list){

        return productsFitlerBySubStrings.fitlerBySubStrings(request,list);
    }
    public Map<String, List<Product>> mapByCategory(String category, List<Product> list){

        return mapProductByCategory.mapByCategory(category,list);
    }
    public Map<String, Long> countMap(String category, List<Product> list) {

        return mapProductByCategory.countMap(category,list);
    }
    public List<String> getClientsNameOfList(List<Client> list){

        return getClientsOfList.getClientsNameOfList(list);
    }
    //Sales
    public double getTotalSales(List<Sale> list){

        return analizeSales.getTotalOfSales(list);
    }
    public Map<String, Integer> getMostSaleProducts(List<Sale> list){

        return analizeSales.getMostSaleProducts(list);
    }
    public double getSaleTicket(List<Sale> list){

        return analizeSales.getTicket(list);
    }
    public Map<String, Double> getSalesOfCountry(List<Sale> list){

        return analizeSales.getSaleOfCountry(list);
    }
    public Optional<Product> getMostFacture(List<Sale> list){

        return analizeSales.getFactureBestAmount(list);
    }
    //find metods
    public boolean findClientByEmail(String key, List<Client> list){

        return findClientsByEmail.findClientsByEmail(key,list);
    }
    public String getClientEmailById(String key, List<Client> list){

        return findClientsByEmail.getClientEmailById(key,list);
    }
    //
    public Double getProductPriceById(String k, List<Product> list){
        return getProductPriceById.GetProductPriceById(k,list);
    }
    //
    public List<DTOSalesReport> getSalesReports(List<Sale> list){
        return salesReport.getSalesReport(list);
    }
    //
    public List<Client> getClientBuyAmounts(List<Sale> list){
        return getBuyClientAmount.getClientListByAmount(list);
    }

}
