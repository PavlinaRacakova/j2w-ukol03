package cz.czechitas.java2webapps.ukol3.entities;

import lombok.Getter;

@Getter
public class BusinessCard {

    private String name;
    private String company;
    private String street;
    private String townAndZipCode;
    private String address;
    private String email;
    private String phoneNumber;
    private String website;
    private String townAndZipCodeInReversedFormat;

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
        address = String.format("%s, %s", street, townAndZipCode);
        townAndZipCodeInReversedFormat = swapTownAndZipCode(townAndZipCode);
    }

    private String swapTownAndZipCode(String townAndZipCode) {
        String zipCode = townAndZipCode.substring(townAndZipCode.length() - 6).trim();
        return String.format("%s %s", townAndZipCode.replace(zipCode, ""), zipCode);
    }
}
