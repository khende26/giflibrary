package com.detroitlabs.giflibrary.model;

import sun.util.resources.cldr.teo.CalendarData_teo_KE;

public class Category {
    private int id;
    private String name;

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
    public Category(int id, String name) {
        this.id = id;
        this.name= name;
    }

}
