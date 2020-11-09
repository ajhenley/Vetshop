package com.byaj;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String phone;
    private ArrayList<Pet> pets = new ArrayList<Pet>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    public void addPet(Pet newpet)
    {
        pets.add(newpet);
    }
}
