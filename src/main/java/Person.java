public class Person {
    //*** ATTRIBUTES ***//
    // En person har følgende egenskaber (attributes) et navn (String), en mor (Person) og en far (Person).
    // Angiv de nødvendige attributes

    private String name;
    private Person mother;
    private Person father;

    //*** CONSTRUCTOR ***//
    // når et person objekt skabes, så gives det et navn (som argument), og det er det eneste.
    // Ret konstruktøren, så den den kan modtage og angive et navn til personen
    public Person(String name) {
        this.name = name;

    }

    //*** METHODS ***//
    // Person objektet skal gøre det muligt at angive (set) sin mor og sin far. Derudover skal en person kunne gøre det muligt at hente (get) sit eget navn, samt sin mor og fars navn.
    // Udfyld metoderne med den nødvendige kode.

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public String getName() {
        return name;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }


}
