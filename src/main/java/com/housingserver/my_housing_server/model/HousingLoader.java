package com.housingserver.my_housing_server.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "housing_loaders")
public class HousingLoader {

    @Id
    private String id;
    private String name;
    private String city;
    private String state;
    private String photo;
    private int availableUnits;
    private boolean wifi;
    private boolean laundry;

    // Constructor
    public HousingLoader(String name, String city, String state, String photo, int availableUnits, boolean wifi, boolean laundry) {
        this.name = name;
        this.city = city;
        this.state = state;
        this.photo = photo;
        this.availableUnits = availableUnits;
        this.wifi = wifi;
        this.laundry = laundry;
    }

    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public String getState() { return state; }
    public void setState(String state) { this.state = state; }
    public String getPhoto() { return photo; }
    public void setPhoto(String photo) { this.photo = photo; }
    public int getAvailableUnits() { return availableUnits; }
    public void setAvailableUnits(int availableUnits) { this.availableUnits = availableUnits; }
    public boolean isWifi() { return wifi; }
    public void setWifi(boolean wifi) { this.wifi = wifi; }
    public boolean isLaundry() { return laundry; }
    public void setLaundry(boolean laundry) { this.laundry = laundry; }
}
