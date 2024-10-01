package uz.tripshare.domain.common;

import uz.tripshare.domain.BaseClass;
import uz.tripshare.domain.enumerators.TripStatus;
import uz.tripshare.domain.enumerators.TripType;

import java.time.LocalDate;
import java.util.List;

public class Trip extends BaseClass {
    private String title;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private Integer seats;
    private String special;
    private Integer ownerId;
    private List<Destination> destinations;
    private List<Stay> stays;
    private List<String> inclusions;
    private List<String> exclusions;
    private List<TripType> types;
    private TripStatus status;

    public Trip(String title, String description, LocalDate startDate, LocalDate endDate, Integer seats, String special, Integer ownerId, List<Destination> destinations, List<Stay> stays, List<String> inclusions, List<String> exclusions, List<TripType> types, TripStatus status) {
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.seats = seats;
        this.special = special;
        this.ownerId = ownerId;
        this.destinations = destinations;
        this.stays = stays;
        this.inclusions = inclusions;
        this.exclusions = exclusions;
        this.types = types;
        this.status = status;
    }

    public Trip() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public List<Destination> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<Destination> destinations) {
        this.destinations = destinations;
    }

    public List<Stay> getStays() {
        return stays;
    }

    public void setStays(List<Stay> stays) {
        this.stays = stays;
    }

    public List<String> getInclusions() {
        return inclusions;
    }

    public void setInclusions(List<String> inclusions) {
        this.inclusions = inclusions;
    }

    public List<String> getExclusions() {
        return exclusions;
    }

    public void setExclusions(List<String> exclusions) {
        this.exclusions = exclusions;
    }

    public List<TripType> getTypes() {
        return types;
    }

    public void setTypes(List<TripType> types) {
        this.types = types;
    }

    public TripStatus getStatus() {
        return status;
    }

    public void setStatus(TripStatus status) {
        this.status = status;
    }
}
