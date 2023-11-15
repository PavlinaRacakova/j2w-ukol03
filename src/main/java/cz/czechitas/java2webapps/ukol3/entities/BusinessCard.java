package cz.czechitas.java2webapps.ukol3.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BusinessCard {

    private String name;
    private String company;
    private String street;
    private String townAndZipCode;
    private String email;
    private String phoneNumber;
    private String website;

    public BusinessCard() {
    }

    public BusinessCard(String name, String company, String street, String townAndZipCode, String email, String phoneNumber, String website) {
        this.name = name;
        this.company = company;
        this.street = street;
        this.townAndZipCode = townAndZipCode;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.website = website;
    }

    public String getTownAndZipCodeInReversedFormat() {
        String zipCode = townAndZipCode.substring(townAndZipCode.length() - 6).trim();
        return String.format("%s %s", zipCode, townAndZipCode.replace(zipCode, ""));
    }

    public String getAddress() {
        return String.format("%s, %s", street, townAndZipCode);
    }
}
