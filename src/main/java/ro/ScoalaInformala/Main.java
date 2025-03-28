package ro.ScoalaInformala;


public class Main {
    public static void main(String[] args) {
        SalesRepresentative[] representatives = {   //Examples
                new SalesRepresentative("Boty", 20, 1000),
                new SalesRepresentative("Mihai", 8, 650),
                new SalesRepresentative("Ion", 16, 850),
                new SalesRepresentative("Andrei", 14, 500),
                new SalesRepresentative("Vasile", 12, 380)
        };
        System.out.println("Before sorting: ");
        printRepresentatives(representatives);

        BubbleSorter sorter = new BubbleSorter(); //Sort the representatives
        SalesRepresentative[] sortedRepresentatives = sorter.sort(representatives);

        System.out.println("\nAfter Sorting: ");
        printRepresentatives(sortedRepresentatives);
    }

    private static void printRepresentatives(SalesRepresentative[] representatives) {
        for (SalesRepresentative rep : representatives) {
            System.out.println(rep);
        }
    }
}