package org.example;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1, "fDveniatin");
        account.setFirstName("Фёдор");
        account.setLastName("Двенятин");

        System.out.println(account.getFullName());
    }
}