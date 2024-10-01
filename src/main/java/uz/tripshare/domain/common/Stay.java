package uz.tripshare.domain.common;

import uz.tripshare.domain.BaseClass;
import uz.tripshare.domain.enumerators.StayType;

public class Stay extends BaseClass {
    private String name;
    private String review;
    private Double rating;
    private Double price;
    private Integer rooms;
    private Integer travellers;
    private StayType type;

    public Stay(String name, String review, Double rating, Double price, Integer rooms, Integer travellers, StayType type) {
        this.name = name;
        this.review = review;
        this.rating = rating;
        this.price = price;
        this.rooms = rooms;
        this.travellers = travellers;
        this.type = type;
    }

    public Stay() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    public Integer getTravellers() {
        return travellers;
    }

    public void setTravellers(Integer travellers) {
        this.travellers = travellers;
    }

    public StayType getType() {
        return type;
    }

    public void setType(StayType type) {
        this.type = type;
    }
}
