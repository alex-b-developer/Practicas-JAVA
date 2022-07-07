public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Solar System:\n");

        SolarSystem Solar = new SolarSystem();

        for(int i = 0; i < Solar.getOrbits().size(); i++) {
            System.out.print(Solar.getOrbits().get(i).id() + " - ");
            System.out.println(Solar.getOrbits().get(i).name());
        }

        System.out.println("Please select the ID of first planet to compare\n");

        System.out.println("Please select the ID of Second planet to compare\n");

        Planet planet1 = Solar.getOrbits().get(1);
        Planet planet2 = Solar.getOrbits().get(5);

        Double gravAtrr = Solar.getGravitationalAttraction(planet1, planet2);

        System.out.print("\n" + "The Gravitational attraction between ");
        System.out.println(planet1.name() + " and " + planet2.name() + " is: ");
        System.out.println(gravAtrr);

    }


}