package uz.tripshare.domain.common;


import uz.tripshare.domain.BaseClass;
import uz.tripshare.domain.enumerators.Category;

public class Activity extends BaseClass {
    private String name;
    private String description;
    private String location;
    private Double price;
    private Category category;

    public Activity(String name, String description, String location, Double price, Category category) {
        this.name = name;
        this.description = description;
        this.location = location;
        this.price = price;
        this.category = category;
    }

    public Activity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
