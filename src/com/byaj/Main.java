package com.byaj;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Instructor has courses
        // Course has students
        // Students just is name and id number

        ArrayList<Pet> pets = new ArrayList<Pet>();

        Pet listspet = new Pet("Scottie", "Dog", "Mutt");

        Customer jada = new Customer();
        jada.setName("Jada");
        jada.setPhone("5551212");



        Pet apet = new Pet("Tiger", "Cat", "Calico");
        jada.addPet(apet);
        ArrayList<Pet> pets2 = new ArrayList<Pet>();
        pets2.add(apet);
        jada.setPets(pets2);

    }
}
