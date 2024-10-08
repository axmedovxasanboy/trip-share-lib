package uz.tripshare.domain.common;

import uz.tripshare.domain.BaseClass;

import java.util.List;

public class User extends BaseClass {
    private String name;
    private String username;
    private String email;
    private String phoneNumber;
    private String role;
    private List<Integer> trips;
    private Integer addressId;

    public User(String name, String username, String email, String phoneNumber, String role, List<Integer> trips, Integer addressId) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.role = role;
        this.trips = trips;
        this.addressId = addressId;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Integer> getTrips() {
        return trips;
    }

    public void setTrips(List<Integer> trips) {
        this.trips = trips;
    }

    public Integer getAddress() {
        return addressId;
    }

    public void setAddress(Integer addressId) {
        this.addressId = addressId;
    }
}
