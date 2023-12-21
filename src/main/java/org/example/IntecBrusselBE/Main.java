package org.example.IntecBrusselBE;

import org.example.IntecBrusselBE.AnimalShelter;
import org.example.IntecBrusselBE.Cat;

import java.util.*;

//APP
public class Main {
    public static void main(String[] args) {

        AnimalShelter animalShelter = new AnimalShelter(0);


        Cat cat = new Cat(true, 4, "MANGO ", 1, true);
        Dog dog = new Dog(true, 15, "REX ", 2, true);
        Monkey monkey = new Monkey(true, 5, "ZEUS ", 3, true);
        Monkey monkey2 = new Monkey(true, 4, "BUSTER ", 4, true);
        Monkey monkey1 = new Monkey(true, 16, "PEPPER ", 5, true);
        Dog dog1 = new Dog(true, 2, "ATHENA ", 6, true);
        Cat cat4 = new Cat(true, 7, "PEARL ", 7, true);
        Dog dog2 = new Dog(true, 8, "SNOWY ", 8, true);
        Cat cat3 = new Cat(true, 21, "CLAW ", 9, true);
        Cat cat6 = new Cat(true, 11, "HULK ", 10, true);


        animalShelter.addAnimal(cat);
        animalShelter.addAnimal(dog);
        animalShelter.addAnimal(monkey);
        animalShelter.addAnimal(monkey2);
        animalShelter.addAnimal(monkey1);
        animalShelter.addAnimal(dog1);
        animalShelter.addAnimal(cat4);
        animalShelter.addAnimal(dog2);
        animalShelter.addAnimal(cat3);
        animalShelter.addAnimal(cat6);


        System.out.println("WE ARE GLAD TO WELCOME YOU TO OUR ANIMAL SHELTER");
        System.out.println("Here you can find information about all animals!");
        System.out.println("   |\\_._/|        |,\\__/|        |\\__/,|        |\\_._/|\n" +
                "   | o o |        |  o o|        |o o  |        | 0 0 |\n" +
                "   (  T  )        (   T )        ( T   )        (  T  )\n" +
                "  .^`-^-'^.      .^`--^'^.      .^`^--'^.      .^`-^-'^.\n" +
                "  `.  ;  .'      `.  ;  .'      `.  ;  .'      `.  ;  .'\n" +
                "  | | | | |      | | | | |      | | | | |      | | | | |\n" +
                " ((_((|))_))    ((_((|))_))    ((_((|))_))    ((_((|))_))");


        System.out.println();
        System.out.println("  All Animals in the Shelter:");
        animalShelter.printAnimals();
        System.out.println();


        System.out.println("\n❏ Animals Sorted  by Id:");
        animalShelter.sortAnimals();
        animalShelter.printAnimals();
        System.out.println();


        System.out.println("\n❏ Animals Sorted by Name:");
        animalShelter.sortAnimalByName();
        animalShelter.printAnimals();
        System.out.println();



        System.out.println("\n❏ Animals Sorted by Age:");
        animalShelter.sortAnimalByAge();
        animalShelter.printAnimals();
        System.out.println();



        System.out.println("\n❏ Treating All Animals:");
        animalShelter.treatAllAnimals();
       // animalShelter.treatAllAnimals();
        //animalShelter.printAnimals();
        System.out.println();

        System.out.println("\n❏ Animals Not Vaccinated for FLUE:");
        animalShelter.printAnimalsNotVaccinated(Disease.FLUE);
        System.out.println("\n❏ Animals Not Vaccinated for HEPATITISA:");
        animalShelter.printAnimalsNotVaccinated(Disease.HEPATITISA);
        System.out.println("\n❏ Animals Not Vaccinated for POLIO:");
        animalShelter.printAnimalsNotVaccinated(Disease.POLIO);
        System.out.println("\n❏ Animals Not Vaccinated for CHICKENPOCKS:");
        animalShelter.printAnimalsNotVaccinated(Disease.CHICKENPOCKS);
        System.out.println();


        System.out.println("\n❏ Finding Animal by ID '3':");
        Animal foundById = animalShelter.findAnimal(3);
        System.out.println(foundById);
        System.out.println();



        System.out.println("\n❏ Finding Animal by Name 'SNOWY':");
        String animalFind = dog2.toString();
        animalShelter.findAnimal(animalFind);
        System.out.println(animalFind);
        System.out.println();



        System.out.println("\n❏ Treating Animal by ID '3':");
        int animalNunToTreat = monkey.getAnimalNumber();
        animalShelter.treatAnimal(animalNunToTreat);
        System.out.println();



        System.out.println("\n❏ Treating Animal by Name 'MANGO':");
        String animalName = String.valueOf(cat);
        animalShelter.treatAnimal(String.valueOf(cat));
        System.out.println(animalName);
        System.out.println();



        System.out.println("\n❏ FindMing Oldest Animal:");
        Animal oldestAnimal = animalShelter.findOldestAnimal();
        if (oldestAnimal != null) {
            System.out.println(oldestAnimal);
        }
        System.out.println();



        System.out.println("\n❏ Total Number of Animals: " + animalShelter.countAnimals());
        System.out.println();


        System.out.println("We will  be glad to see you!!!");

    }
}