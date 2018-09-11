package com.example.gor.showcase.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Offer {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("des")
    @Expose
    private String des;
    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("btn")
    @Expose
    private String btn;
    @SerializedName("btn2")
    @Expose
    private String btn2;
    @SerializedName("browser")
    @Expose
    private Boolean browser;
    @SerializedName("enabled")
    @Expose
    private Boolean enabled;
    @SerializedName("desc_full")
    @Expose
    private String descFull;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBtn() {
        return btn;
    }

    public void setBtn(String btn) {
        this.btn = btn;
    }

    public String getBtn2() {
        return btn2;
    }

    public void setBtn2(String btn2) {
        this.btn2 = btn2;
    }

    public Boolean getBrowser() {
        return browser;
    }

    public void setBrowser(Boolean browser) {
        this.browser = browser;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getDescFull() {
        return descFull;
    }

    public void setDescFull(String descFull) {
        this.descFull = descFull;
    }

}
