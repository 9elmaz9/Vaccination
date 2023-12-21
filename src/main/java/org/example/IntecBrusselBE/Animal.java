package org.example.IntecBrusselBE;

import java.util.HashMap;
import java.util.Map;

public abstract class Animal implements Treatable, Vaccinateable {
    private Map<Disease, Boolean> isVaccinated = new HashMap<>() {
        {
            put(Disease.POLIO, false);
            put(Disease.HEPATITISA, false);
            put(Disease.FLUE, false);
            put(Disease.CHICKENPOCKS, false);
        }
    };

    private boolean isClean;
    private int age;
    private String name;
    private int animalNumber;


    public Animal() {
    }

    public Animal(boolean isClean, int age, String name, int animalNumber) {
        this.isVaccinated = isVaccinated;
        this.isClean = isClean;
        this.age = age;
        this.name = name;
        this.animalNumber = animalNumber;
    }

    public Map<Disease, Boolean> getIsVaccinated() {
        return isVaccinated;
    }


    public boolean isClean() {
        return isClean;
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getAnimalNumber() {
        return animalNumber;
    }

    public void setAnimalNumber(int animalNumber) {
        this.animalNumber = animalNumber;
    }


    // zorgt ervoor dat een animal clean gemaakt wordt.
    @Override
    public void treatAnimal(Animal animal) { //  impl !
     //   isClean = true;
    // System.out.println("Animal is treated " + isClean);
        //System.out.println(isClean);
        if(animal instanceof Treatable){
            ((Treatable)animal).treatAnimal();
        }else {
            System.out.println("Treatment not availbl");
        }

    }

    //() zal een dier vaccineren voor een bepaalde ziekte
    @Override
    public void vaccinateAnimal(Disease disease) {
        isVaccinated.replace(disease, true);
        System.out.println(this.toString());
    }



    @Override
    public String toString() {
        return
                "isVaccinated= " + isVaccinated +
                        ", isClean= " + isClean +
                        ", age =" + age +
                        ", name='" + name + '\'' +
                        ", animalNumber= " + animalNumber +
                        '}';
    }
}




