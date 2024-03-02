public class Main {
    public static void main(String[] args) {
        FamilyTree myFamilyTree = new FamilyTree();
        myFamilyTree.buildTree();

        System.out.println("En person: " + myFamilyTree.getCurrentName());
        System.out.println("Personens mor: " + myFamilyTree.lookUpParentName("mother"));
        System.out.println("Personens far: "+myFamilyTree.lookUpParentName(""));

    }
}
