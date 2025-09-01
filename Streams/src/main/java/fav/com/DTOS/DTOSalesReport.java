package fav.com.DTOS;


public class DTOSalesReport {
    private String productName;
    private int amount;
    private Double totalFacture;

    public DTOSalesReport(String productName, int amount, Double totalFacture) {
        this.productName = productName;
        this.amount = amount;
        this.totalFacture = totalFacture;
    }

    public DTOSalesReport() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Double getTotalFacture() {
        return totalFacture;
    }

    public void setTotalFacture(Double totalFacture) {
        this.totalFacture = totalFacture;
    }

    @Override
    public String toString() {
        return "DTOSalesReport{" +
                "productName='" + productName + '\'' +
                ", amount=" + amount +
                ", totalFacture=" + totalFacture +
                '}';
    }
}
