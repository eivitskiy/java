package org.example;

import java.util.Random;

public class Account {
    private final int id;
    private final String login;
    private String firstName;
    private String lastName;

    public Account (int id, String login)
    {
        this.id = id;
        this.login = login;
    }

    public int getId()
    {
        return this.id;
    }

    public String getLogin()
    {
        return this.login;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return this.firstName + ' ' + this.lastName;
    }

    public static String generateRandomString()
    {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 16;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }

        return buffer.toString();
    }

    public void throwableMethod() throws Exception {
        throw new Exception("qwerty");
    }
}
