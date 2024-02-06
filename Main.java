public class Main {
    public static void main(String[] args) {
        // Opretter et dynamisk array til at indeholde strenge
        DynamicArray<String> dynamicArray = new DynamicArray<>();

        // Tilføjer nogle strenge til arrayet
        dynamicArray.add("Harry");
        dynamicArray.add("Ron");
        dynamicArray.add("Hermoine");

        // Udskriver størrelsen på arrayet
        System.out.println("Array contains " + dynamicArray.size() + " elements");

        // Udskriver alle elementerne i arrayet
        for (int i = 0; i < dynamicArray.size(); i++) {
            System.out.println("#" + i + ": " + dynamicArray.get(i));
        }

        // Fjerner et element fra arrayet
        dynamicArray.remove(1);

        // Udskriver størrelsen på arrayet efter fjernelsen
        System.out.println("Array contains " + dynamicArray.size() + " elements");

        // Udskriver alle elementerne i arrayet igen efter fjernelsen
        for (int i = 0; i < dynamicArray.size(); i++) {
            System.out.println("#" + i + ": " + dynamicArray.get(i));
        }

        // Rydder arrayet
        dynamicArray.clear();

        // Udskriver størrelsen på arrayet efter at have ryddet det
        System.out.println("Array contains " + dynamicArray.size() + " elements");
    }
}
