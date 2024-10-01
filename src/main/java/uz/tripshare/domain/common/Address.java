package uz.tripshare.domain.common;


import uz.tripshare.domain.BaseClass;

public class Address extends BaseClass {
    private String country;   // davlat
    private String region;     // viloyat
    private String district;   // tuman
    private String street;    // kocha va uy raqami

    public Address(String country, String region, String district, String street) {
        this.country = country;
        this.region = region;
        this.district = district;
        this.street = street;
    }

    public Address() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
