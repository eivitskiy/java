public class Database {
    public static void main(String[] args) {
        DictionaryMetadata dm1 = new DictionaryMetadata(1, "Сущность1", "table_1", "2023-01-16 23:29:53", null);
        dm1.setPublish_type(PublishType.RECORD);

        dm1.displayInfo();

        DictionaryMetadata dm2 = new DictionaryMetadata(2, "Сущность2", "table_2", "2023-01-16 23:37:01", null);
        dm2.setDomain(new Domain(1, "ya.ru"));
        dm2.displayInfo();

        System.out.println(dm1 == dm2);

        Account acc = new Account(1, "2024-01-22 14:33:00");
        dm2.setCreator(acc);
    }
}