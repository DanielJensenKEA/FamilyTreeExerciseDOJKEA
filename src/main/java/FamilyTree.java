public class FamilyTree {
    //*** ATTRIBUTES ***//
    // Et familietræ har en person, som det laves på baggrund af.
    private Person current;

    //*** CONSTRUCTOR ***//
    // Når et familietræ skabes, kalder den sin metode buildTree.
    // Kald metoden i konstruktøren.
    public FamilyTree() {
        buildTree();

    }

    //*** METHODS ***//
    // Familietræ objektet har en metode (BuildTree), som bygger hele stamtræet og angiver den person træet laves ud fra (current). Derudover har den også nogle metoder, der gør det muligt at se navnet på den pågældende person (getCurrentName), personens forældre (lookUpParentName) og at bevæge sig op i træet fra den pågældende person (moveToAncestor).
    // Udfyld den nødvendige kode i buildTree og getCurrentName metode. De andre er udfyldt.

    public void buildTree() {
    // Lav til at starte med tre person objekter: et som repræsenterer den person, som træet skal laves på baggrund, et til dens far og et til dens mor. Giv dem hver især variabel navne, som afspejler deres egentlig navn.
    // Eksempel: Person hans = new Person("Hans");

    // Lav derefter to nye person objekter, der repræsenterer morens mor og fra

    // Lav derefter to nye person objekter, der repræsenterer farens mor og fra

    // Sidst så tilskriv den pågældendes person, som repræsenterer den person træet skal laves på baggrund af, til variablen current.
        Person hans = new Person("Hans");
        //Hans' forældre
        Person dorte = new Person("Dorte");
        Person phillip = new Person("Phillip");

        //Dortes forældre
        Person martin = new Person("Martin");
        Person miriam = new Person("Miriam");

        //Phillips forældre
        Person konrad = new Person("Konrad");
        Person laura = new Person("Laura");

        hans.setFather(phillip);
        hans.setMother(dorte);
        current = hans;

    }
    public String getCurrentName() {
        return current.getName();

    }

    // Skriv kommentarer til følgende metode, der beskriver hvad den gør
    //Metode med String parent som parameter. If-sætning => Hvis parent er lige med "mother" vil den bruge mothers getter metode
    //til at returnere dennes stringnavn. Hvis denne if-sætning ikke opfyldes, returneres fathers navn gennem getter-metode.
    public String lookUpParentName(String parent) {

        if (parent.equals("mother")) {
            return current.getMother().getName();
        }
        else {
            return current.getFather().getName();
        }
    }

    // Skriv kommentarer til følgende metode, der beskriver hvad den gør
    //Tager String ancestor som parameter. "Vælger" eller returnerer current variablens mor, hvis ifsætning opfyldes.
    //Else returnerer current variablens far.
    public void moveToAncestor(String ancestor) {
        if (ancestor.equals("mother")) {
            current = current.getMother();
        }
        else {
            current = current.getFather();
        }
    }

}
