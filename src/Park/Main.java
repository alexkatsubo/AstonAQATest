package Park;

public class Main {
    public static void main(String[] args) {
        Park park = new Park("Smolyanka");

        Park.Attraction[] attractions = new Park.Attraction[5];
        attractions[0] = park.new Attraction("Air Racing", "12.00  - 21.00", 5.50);
        attractions[1] = park.new Attraction("Fun Racing", "11.00 - 22.00", 5.00);
        attractions[2] = park.new Attraction("Zodiac", "12.00 - 21.00", 4.50);
        attractions[3] = park.new Attraction("Mix", "11.30 - 20.30", 7.50);
        attractions[4] = park.new Attraction("Ferris wheel", "9.00 - 22.00", 10.00);

        park.setAttractions(attractions);

        for (Park.Attraction attraction : attractions) {
            attraction.displayInfo();
        }
    }
}
