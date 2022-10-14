package com.dummies.bio.data;

public class Bio {
    String name;
    String hobbeys;
    public  Bio() {}
    public Bio(String name, String hobbeys) {
        this.name = name;
        this.hobbeys = hobbeys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobbeys() {
        return hobbeys;
    }

    public void setHobbeys(String hobbeys) {
        this.hobbeys = hobbeys;
    }
}
