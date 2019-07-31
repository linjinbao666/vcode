package vcode.domin;

import java.io.Serializable;

public class Priv implements Serializable {
    private String privid;
    private String privname;
    private String description;

    public String getPrivid() {
        return privid;
    }

    public void setPrivid(String privid) {
        this.privid = privid;
    }

    public String getPrivname() {
        return privname;
    }

    public void setPrivname(String privname) {
        this.privname = privname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
