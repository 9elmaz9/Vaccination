package org.example.IntecBrusselBE;

public interface Treatable {
    public void treatAnimal();

    // zorgt ervoor dat een animal clean gemaakt wordt.
    void treatAnimal(Animal animal);

    //treatAnimal() zorgt ervoor dat een animal clean gemaakt wordt. Indien je aan het werken bent met een
    //cat, dog of monkey, zorg er dan voor dat de treatAnimal methode ook de hyperactivity, de longnails en de
    //foulbreath problemen oplost. (op false zet)


}
