package Park;

public class Park {
    private final String name;
    private Attraction[] attractions;

    public Park(String name) {
        this.name = name;
    }

    public void setAttractions(Attraction[] attractions) {
        this.attractions = attractions;
    }

    public class Attraction {
        private final String name;
        private final String workingHours;
        private final double cost;

        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void displayInfo() {
            System.out.println("Attraction: " + name);
            System.out.println("Working hours: " + workingHours);
            System.out.println("Cost: " + cost);
            System.out.println("------------------------");
        }
    }
}







