package org.example;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Client client1 = bank.createClient("Ivan", "Ivanov", 100, "qwerty");
        Client client2 = bank.createClient("Oleg", "Anatolievich", 0, "1234");
        bank.sendMoney(client1, client2, 20, "qwerty");
        System.out.println(
                bank.getClientBalance(client1)
        );
        System.out.println(
                bank.getClientBalance(client2)
        );
    }
}