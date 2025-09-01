package fav.com.Service;

import fav.com.Entitys.Client;

import java.util.List;
import java.util.Optional;

public class GetClientWithNoEmail {



    public List<Client> getClientWithNoEmail(List<Client> list){

        List<Client> listResponse = list.stream()
                .filter(client -> Optional.ofNullable(client.getEmail()).isEmpty())
                .map(client -> {
                    if (Optional.ofNullable(client.getEmail()).isEmpty()){
                        client.setEmail("");
                    }
                    return client;

                }).toList();
        return listResponse;
    }

}
