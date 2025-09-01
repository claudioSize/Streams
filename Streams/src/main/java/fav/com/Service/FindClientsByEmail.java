package fav.com.Service;

import fav.com.Entitys.Client;

import java.util.List;
import java.util.Optional;

public class FindClientsByEmail {




    public Boolean findClientsByEmail(String key, List<Client> list){

        Optional<Client> response = list.stream().filter(client -> Optional.ofNullable(client.getEmail()).isPresent())
                .filter(client -> client.getEmail().equals(key))
                .findFirst();

        return response.isPresent();
    }

    public String getClientEmailById(String key, List<Client> list){

        return list.stream().filter(client -> client.getId().equalsIgnoreCase(key))
                .map(client -> {
                    if (client.getEmail() == null){
                        return "NO_EMAIL";
                    }
                    return client.getEmail();
                }).findFirst()
                .orElse("Id no existe");

    }

}
