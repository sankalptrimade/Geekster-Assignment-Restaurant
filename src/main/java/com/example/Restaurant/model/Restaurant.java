package com.example.Restaurant.model;

public class Restaurant {
    private int id;
    private String name;
    private String address;
    private long contact;
    private String speciality;
    private int totalStaffs;
    private boolean selfService;
    private int avgIncome;

    public Restaurant() {
    }

    public Restaurant(int id, String name, String address, long contact, String speciality, int totalStaffs, boolean selfService, int avgIncome) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.speciality = speciality;
        this.totalStaffs = totalStaffs;
        this.selfService = selfService;
        this.avgIncome = avgIncome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getTotalStaffs() {
        return totalStaffs;
    }

    public void setTotalStaffs(int totalStaffs) {
        this.totalStaffs = totalStaffs;
    }

    public boolean getSelfService() {
        return selfService;
    }

    public void setSelfService(boolean selfService) {
        this.selfService = selfService;
    }

    public int getAvgIncome() {
        return avgIncome;
    }

    public void setAvgIncome(int avgIncome) {
        this.avgIncome = avgIncome;
    }


    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact=" + contact +
                ", speciality='" + speciality + '\'' +
                ", totalStaffs=" + totalStaffs +
                ", selfService=" + selfService +
                ", avgIncome=" + avgIncome +
                '}';
    }
}
