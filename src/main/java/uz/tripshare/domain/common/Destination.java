package uz.tripshare.domain.common;


import uz.tripshare.domain.BaseClass;

import java.util.List;

public class Destination extends BaseClass {
    private String description;
    private String location;
    private List<Activity> activities;

    public Destination(String description, String location, List<Activity> activities) {
        this.description = description;
        this.location = location;
        this.activities = activities;
    }

    public Destination() {
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

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }
}
