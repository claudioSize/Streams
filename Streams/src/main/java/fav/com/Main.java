package fav.com;

import fav.com.Entitys.Client;
import fav.com.Entitys.Product;
import fav.com.Entitys.Sale;
import fav.com.Service.*;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("P1", "Smartphone X", "Electrónica", 800.0);
        Product p2 = new Product("P2", "Cafetera Pro", "Hogar", 120.0);
        Product p3 = new Product("P3", "Lego Star", "Juguetes", 95.5);
        Product p4 = new Product("P4", "Auriculares Z", "Electrónica", 150.0);
        Product p5 = new Product("P5", "Silla Gamer", "Hogar", 300.0);
        Product p6  = new Product("P6",  "Tablet Alpha", "Electrónica", 450.0);
        Product p7  = new Product("P7",  "Robot Educativo", "Juguetes", 130.0);
        Product p8  = new Product("P8",  "Microondas Plus", "Hogar", 220.0);
        Product p9  = new Product("P9",  "Smartwatch Q", "Electrónica", 199.0);
        Product p10 = new Product("P10", "Dron Mini", "Juguetes", 180.0);
        Product p11 = new Product("P11", "Lampara LED Deco", "Hogar", 45.0);
        Product p12 = new Product("P12", "Consola Retro", "Electrónica", 320.0);
        Product p13 = new Product("P13", "Set Pintura Kids", "Juguetes", 60.0);
        Product p14 = new Product("P14", "Aspiradora Max", "Hogar", 275.0);
        Product p15 = new Product("P15", "Monitor 4K", "Electrónica", 520.0);
        Product p16 = new Product("P16", "Juego Mesa Strategy", "Juguetes", 55.5);
        Product p17 = new Product("P17", "Freidora Aire", "Hogar", 150.0);
        Product p18 = new Product("P18", "Camara Accion", "Electrónica", 310.0);
        Product p19 = new Product("P19", "Puzzle 1000", "Juguetes", 35.0);
        Product p20 = new Product("P20", "Plancha Vapor", "Hogar", 80.0);
        Product p21 = new Product("P21", "Teclado Mecánico", "Electrónica", 110.0);
        Product p22 = new Product("P22", "Muñeca Colección", "Juguetes", 140.0);
        Product p23 = new Product("P23", "Cafetera Slim", "Hogar", 95.0);
        Product p24 = new Product("P24", "Router WiFi 6", "Electrónica", 160.0);
        Product p25 = new Product("P25", "Set Bloques Creativos", "Juguetes", 88.0);


        Client c1 = new Client("C1", "Ana", "Argentina", "ana@mail.com");
        Client c2 = new Client("C2", "ana", "Peru", null);
        Client c3 = new Client("C3", "ana", "Chile", "maria@mail.com");
        Client c4 = new Client("C4", "Pedro", "Brasil", "pedro@mail.com");
        Client c5 = new Client("C5", "Lucia", "Argentina", null);
        Client c6  = new Client("C6",  "Jorge",  "Argentina", "jorge@mail.com");
        Client c7  = new Client("C7",  "Elena",  "Peru", null);
        Client c8  = new Client("C8",  "Raul",   "Chile", "raul@mail.com");
        Client c9  = new Client("C9",  "Sofia",  "Brasil", null);
        Client c10 = new Client("C10", "Diego",  "Argentina", "diego@mail.com");
        Client c11 = new Client("C11", "Carla",  "Peru", "carla@mail.com");
        Client c12 = new Client("C12", "Gonzalo","Chile", null);
        Client c13 = new Client("C13", "Rita",   "Brasil", "rita@mail.com");
        Client c14 = new Client("C14", "Hugo",   "Argentina", null);
        Client c15 = new Client("C15", "Nadia",  "Peru", "nadia@mail.com");
        Client c16 = new Client("C16", "Oscar",  "Chile", "oscar@mail.com");
        Client c17 = new Client("C17", "Bruno",  "Brasil", null);
        Client c18 = new Client("C18", "Laura",  "Argentina", "laura@mail.com");
        Client c19 = new Client("C19", "Marta",  "Peru", null);
        Client c20 = new Client("C20", "Pablo",  "Chile", "pablo@mail.com");
        Client c21 = new Client("C21", "Ines",   "Brasil", "ines@mail.com");
        Client c22 = new Client("C22", "Valeria","Argentina", null);
        Client c23 = new Client("C23", "Tomas",  "Peru", "tomas@mail.com");
        Client c24 = new Client("C24", "Gloria", "Chile", null);
        Client c25 = new Client("C25", "Emilia", "Bolivia", "emilia@mail.com");

        Sale v1  = new Sale("V1",  LocalDate.parse("2024-01-10"), p1, c1, 1);
        Sale v2  = new Sale("V2",  LocalDate.parse("2024-01-11"), p2, c1, 2);
        Sale v3  = new Sale("V3",  LocalDate.parse("2024-02-05"), p3, c2, 3);
        Sale v4  = new Sale("V4",  LocalDate.parse("2024-02-20"), p1, c3, 2);
        Sale v5  = new Sale("V5",  LocalDate.parse("2024-02-28"), p4, c4, 4);
        Sale v6  = new Sale("V6",  LocalDate.parse("2024-03-03"), p5, c5, 1);
        Sale v7  = new Sale("V7",  LocalDate.parse("2024-03-04"), p2, c2, 1);
        Sale v8  = new Sale("V8",  LocalDate.parse("2024-03-10"), p3, c3, 5);
        Sale v9  = new Sale("V9",  LocalDate.parse("2024-03-15"), p4, c1, 1);
        Sale v10 = new Sale("V10", LocalDate.parse("2024-03-20"), p1, c4, 1);
        Sale v11 = new Sale("V11", LocalDate.parse("2024-03-22"), p6,  c6,  2);
        Sale v12 = new Sale("V12", LocalDate.parse("2024-03-23"), p2,  c7,  1);
        Sale v13 = new Sale("V13", LocalDate.parse("2024-03-24"), p10, c8,  3);
        Sale v14 = new Sale("V14", LocalDate.parse("2024-03-25"), p9,  c9,  2);
        Sale v15 = new Sale("V15", LocalDate.parse("2024-03-26"), p15, c10, 1);
        Sale v16 = new Sale("V16", LocalDate.parse("2024-03-27"), p7,  c11, 4);
        Sale v17 = new Sale("V17", LocalDate.parse("2024-03-28"), p14, c12, 1);
        Sale v18 = new Sale("V18", LocalDate.parse("2024-03-29"), p1,  c13, 2);
        Sale v19 = new Sale("V19", LocalDate.parse("2024-03-30"), p18, c14, 1);
        Sale v20 = new Sale("V20", LocalDate.parse("2024-03-31"), p3,  c15, 2);
        Sale v21 = new Sale("V21", LocalDate.parse("2024-04-01"), p12, c16, 1);
        Sale v22 = new Sale("V22", LocalDate.parse("2024-04-02"), p17, c17, 2);
        Sale v23 = new Sale("V23", LocalDate.parse("2024-04-03"), p4,  c18, 1);
        Sale v24 = new Sale("V24", LocalDate.parse("2024-04-04"), p5,  c19, 1);
        Sale v25 = new Sale("V25", LocalDate.parse("2024-04-05"), p20, c20, 3);
        Sale v26 = new Sale("V26", LocalDate.parse("2024-04-06"), p21, c21, 2);
        Sale v27 = new Sale("V27", LocalDate.parse("2024-04-07"), p22, c22, 1);
        Sale v28 = new Sale("V28", LocalDate.parse("2024-04-08"), p23, c23, 2);
        Sale v29 = new Sale("V29", LocalDate.parse("2024-04-09"), p24, c24, 1);
        Sale v30 = new Sale("V30", LocalDate.parse("2024-04-10"), p25, c25, 5);

        List<Product> productList = List.of(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15
                ,p16,p17,p18,p19,p20,p21,p22,p23,p24,p25);

        List<Client> clientList = List.of(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16
                ,c17,c18,c19,c20,c21,c22,c23,c24,c25);

        List<Sale> salesList = List.of(v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12,v13,v14,v15
        ,v16,v17,v18,v19,v20,v21,v22,v23,v24,v25,v26,v27,v28,v29,v30);


        GetsFactory getsFactory = new GetsFactory(new GetProductsListByCategory(),new GetClientWithNoEmail()
                ,new ProductsFitlerBySubStrings(),new MapProductByCategory(),new GetClientsOfList()
                ,new AnalizeSales(),new FindClientsByEmail(),new GetProductPriceById(), new GetSalesReport(),
                new GetBuyClientAmount());
        //getsFactory.getClientWithNoEmail(clientList).stream().forEach(System.out::println);
        //getsFactory.getProductsListByCategory("Hogar",productList).stream().forEach(System.out::println);
        //getsFactory.filterBySubString("Ju",productList).stream().forEach(System.out::println);
        //System.out.println(getsFactory.mapByCategory("Electrónica",productList));
        //System.out.println(getsFactory.countMap("Electrónica",productList));
        //getsFactory.getClientsNameOfList(clientList).forEach(System.out::println);
        //System.out.println(getsFactory.getTotalSales(salesList));
        //System.out.println(getsFactory.getMostSaleProducts(salesList));
        //System.out.println(getsFactory.getSaleTicket(salesList));
        //System.out.println(getsFactory.getSalesOfCountry(salesList));
        //System.out.println(getsFactory.getMostFacture(salesList));
        //System.out.println(getsFactory.findClientByEmail("tomas", clientList));
        //System.out.println(getsFactory.getClientEmailById("c55", clientList));
        //System.out.println(getsFactory.getProductPriceById("p22", productList));
        //getsFactory.getSalesReports(salesList).forEach(System.out::println);
        //getsFactory.getClientBuyAmounts(salesList).forEach(System.out::println);
    }

}