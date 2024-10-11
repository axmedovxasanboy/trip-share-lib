package uz.tripshare.domain.common;

import uz.tripshare.domain.BaseClass;
import uz.tripshare.domain.enumerators.UserRole;

import java.util.List;

public class User extends BaseClass {
    private String name;
    private String username;
    private String email;
    private String phoneNumber;
    private UserRole role;
    private List<Integer> createdTrips;
    private List<Integer> joinedTrips;
    private Integer addressId;

    public User(String name, String username, String email, String phoneNumber, UserRole role, List<Integer> createdTrips, List<Integer> joinedTrips, Integer addressId) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.role = role;
        this.createdTrips = createdTrips;
        this.joinedTrips = joinedTrips;
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

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public List<Integer> getCreatedTrips() {
        return createdTrips;
    }

    public void setCreatedTrips(List<Integer> createdTrips) {
        this.createdTrips = createdTrips;
    }

    public List<Integer> getJoinedTrips() {
        return joinedTrips;
    }

    public void setJoinedTrips(List<Integer> joinedTrips) {
        this.joinedTrips = joinedTrips;
    }

    public Integer getAddress() {
        return addressId;
    }

    public void setAddress(Integer addressId) {
        this.addressId = addressId;
    }
}
