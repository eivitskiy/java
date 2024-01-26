package org.example;

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
}
