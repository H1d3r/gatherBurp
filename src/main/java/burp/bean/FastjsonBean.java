package burp.bean;

public class FastjsonBean {
    private Integer id;
    private String type;
    private String value;

    public FastjsonBean() {
    }

    public FastjsonBean(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
