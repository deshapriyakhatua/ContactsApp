package com.example.contacts;

public class ContactsList {
    String imageLink;
    String name;
    String country;
    String mobile;

    public ContactsList(String imageLink, String name, String country, String mobile){
        this.imageLink=imageLink;
        this.name=name;
        this.country=country;
        this.mobile=mobile;
    }

    public String getImageLink() {
        return imageLink;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getMobile() {
        return mobile;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
