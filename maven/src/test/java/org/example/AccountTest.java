package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account account;

    @BeforeEach
    void setUp() {
        account = new Account(1, "fDveniatin");
    }

    @Test
    void getLogin() {
    }

    @Test
    void getFirstName() {
        String firstName = "Фёдор";
        account.setFirstName(firstName);

        assertEquals(firstName, account.getFirstName());
    }

    @Test
    void getLastName() {
        String lastName = "Двенятин";
        account.setLastName(lastName);

        assertEquals(lastName, account.getLastName());
    }

    @Test
    void getFullName() {
        String firstName = "Фёдор";
        account.setFirstName(firstName);
        String lastName = "Двенятин";
        account.setLastName(lastName);
        String fullName = firstName + " " + lastName;

        assertEquals(fullName, account.getFullName());
    }
}