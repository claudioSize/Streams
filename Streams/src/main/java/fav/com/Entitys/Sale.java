package fav.com.Entitys;

import java.time.LocalDate;

public class Sale {
    private String id;
    private LocalDate date;
    private Product productId;
    private Client clientId;
    private int amount;

    public Sale(String id, LocalDate date, Product productId, Client clientId, int amount) {
        this.id = id;
        this.date = date;
        this.productId = productId;
        this.clientId = clientId;
        this.amount = amount;
    }

    public Sale() {
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", productId=" + productId +
                ", clientId=" + clientId +
                ", amount=" + amount +
                '}';
    }
}
