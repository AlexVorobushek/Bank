package org.example;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<Client, Integer> balanceByClient = new HashMap<Client, Integer>();

    public int getClientBalance(Client client){
        return balanceByClient.get(client);
    }
    public boolean sendMoney(Client fromClient, Client toClient, int amount, String passwd){
        if (amount <= 0) return false;
        if (!fromClient.isTruePasswd(passwd)) return false;

        int fromClientBalance = getClientBalance(fromClient);
        int toClientBalance = getClientBalance(toClient);

        if (fromClientBalance < amount) return false;
        balanceByClient.put(fromClient, fromClientBalance-amount);
        balanceByClient.put(toClient, toClientBalance+amount);


        return true;
    }
    public Client createClient(String firstName, String secondName, int baseBalance, String passwd){
        if (baseBalance < 0) baseBalance = 0;
        Client client = new Client(firstName, secondName, passwd);
        balanceByClient.put(client, baseBalance);
        return client;
    }
}
