package org.example.IntecBrusselBE;

import java.util.Map;
import java.util.Objects;

public class Dog extends Animal {
    private boolean hasFoulBreath;

    public Dog(boolean isClean, int age, String name, int animalNumber, boolean hasFoulBreath) {
        super(isClean, age, name, animalNumber);
        this.hasFoulBreath = false;
    }

    public Dog() {
    }

    public boolean isHasFoulBreath() {
        return hasFoulBreath;
    }

    public void setHasFoulBreath(boolean hasFoulBreath) {
        this.hasFoulBreath = hasFoulBreath;
    }

    // Implementing Treatable Interface
    @Override
    public void treatAnimal() {
        //super.treatAnimal(); // Call the base class method
        //hasFoulBreath = false;
        setHasFoulBreath(false);
    }

    @Override
    public String toString() {
        return "Dog name:" + getName() + ",age:" + getAge() + " ,Animal number:" + getAnimalNumber() + " , hasFoulBreath- " + hasFoulBreath + " , isClean-" + isClean() + ", getIsVaccinated " + getIsVaccinated();

    }
}
