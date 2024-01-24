public class DictionaryMetadata {
    private int id;
    private int domain_id;  // это поле ссылается на внешнюю таблицу, его сеттер я убрал, пояснения ниже в методе setDomain()
    private String base_name;
    private String table_name;
    private String seq_name;
    private String source;
    private String raw_metatdata;   //в оригинале тип данных jsonb - это битовый json, позволяет всякие битовые операции делать над собой средствами базы данных (json в свою очередь это строка)
    private String metadata;        //тоже тип данных jsonb
    private String code;
    private String urn;
    private String short_name;
    private String version_date;    //в оригинале тип данных timestamp(6) - это временная метка, число в скобках показывает точность (количетсво знаков за запятой)
    private String version;
    private String created_date;
    private String updated_date;
    private int creator_id;
    private boolean external;
    private boolean isPrivate;  // в оригинале колонка называется private, но это слово зарезервировано языком и использовать его нельзя
    private boolean latest;
    private PublishType publish_type;
    private boolean published;

    private Domain domain;  // это наше свойство для связи с внешней таблицей
    private Account creator;

    /*
     * в конструкторе мы принимаем только те поля таблицы,
     * которые в базе отмечены как NOT NULL (т.е. не могут принимать нулевые значения)
     * 
     * для остальных полей добавлены геттер и сеттер (т.к. свойства класса у нас приватные, изменять/читать их можем только методами изнутри класса)
     * соответственно для чтения поля будем использовать геттер (например метод getId())
     * а для записи значения сеттер (например setCode())
     */
    public DictionaryMetadata(
        int id,
        String base_name,
        String table_name,
        String created_date,
        String updated_date
    ) {
        this.setId(id);
        this.setBase_name(base_name);
        this.setTable_name(table_name);
        this.setCreated_date(created_date);
        this.setUpdated_date(updated_date);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDomain_id() {
        return domain_id;
    }

    public Domain getDomain() {
        return this.domain;
    }

    /*
     * вместо установки значения отдельного поля domain_id
     * мы будем сразу устанавливать значение свойства domain (соответствующего класса)
     * и заодно domain_id (будем брать его из переданного значения)
     */
    public void setDomain(Domain domain) {
        this.domain = domain;
        this.domain_id = domain.getId();
    }

    public String getBase_name() {
        return base_name;
    }

    public void setBase_name(String base_name) {
        this.base_name = base_name;
    }

    public String getTable_name() {
        return table_name;
    }

    public void setTable_name(String table_name) {
        this.table_name = table_name;
    }

    public String getSeq_name() {
        return seq_name;
    }

    public void setSeq_name(String seq_name) {
        this.seq_name = seq_name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getRaw_metatdata() {
        return raw_metatdata;
    }

    public void setRaw_metatdata(String raw_metatdata) {
        this.raw_metatdata = raw_metatdata;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public String getVersion_date() {
        return version_date;
    }

    public void setVersion_date(String version_date) {
        this.version_date = version_date;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(String updated_date) {
        this.updated_date = updated_date;
    }

    public boolean isExternal() {
        return external;
    }

    public void setExternal(boolean external) {
        this.external = external;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public boolean isLatest() {
        return latest;
    }

    public void setLatest(boolean latest) {
        this.latest = latest;
    }

    public PublishType getPublish_type() {
        return publish_type;
    }

    public void setPublish_type(PublishType publish_type) {
        this.publish_type = publish_type;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public void displayInfo() {
        System.out.printf(
            "ID: %d \t Base name: %s \t Created at: %s \t Domain: %s \t PublishType: %s \n",
            this.getId(),
            this.getBase_name(),
            this.getCreated_date(),
            (this.getDomain() == null) ? null : this.getDomain().getName(),
            this.getPublish_type()
        );
    }

    public void setCreator(Account creator)
    {
        this.creator = creator;

        this.creator_id = creator.getId();
    }

    public Account getCreator()
    {
        return this.creator;
    }
}
