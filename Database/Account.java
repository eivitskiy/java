public class Account {
    private int id;
    private String creation_date;
    private String login;
    private String name;

    public Account (int id, String creation_date)
    {
        this.id = id;
        this.creation_date = creation_date;
    }

    public int getId()
    {
        return this.id;
    }
    
    public String getCreationDate()
    {
        return this.creation_date;
    }

    public String getLogin()
    {
        return this.login;
    }

    public void setLogin(String login)
    {
        this.login = login;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
