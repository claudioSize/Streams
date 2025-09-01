package fav.com.Service;

import fav.com.Entitys.Client;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class GetClientsOfList {



    public List<String> getClientsNameOfList(List<Client> list){

        List<String> response = list.stream().map(client -> {
            client.setName(client.getName().toUpperCase());
            return client.getName();
        }).distinct().sorted().toList();



        return response;
    }

}
