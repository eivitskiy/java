public class Domain {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Domain(int id, String name)
    {
        this.setId(id);
        this.setName(name);
    }
}
