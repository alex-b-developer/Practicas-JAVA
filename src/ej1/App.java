package ej1;

import ej4.KeyReader;

/**
 * [This is the app to get the Gravitational Attraction between 2 planets.
 *
 * @version [    1.01.001 2022-07-04]
 *
 * @author [Alexander Betancur - alexbetbu@gmail.com]
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Solar System:\n");

        SolarSystem Solar = new SolarSystem();
        int input1;
        int input2;

        for(int i = 0; i < Solar.getOrbits().size(); i++) {
            System.out.print(Solar.getOrbits().get(i).id() + " - ");
            System.out.println(Solar.getOrbits().get(i).name());
        }

        System.out.println();

        input1 = KeyReader.readUserInt("Please select the ID of first planet to compare\n");
        input2 = KeyReader.readUserInt("Please select the ID of Second planet to compare\n");
        Planet planet1 = null;
        Planet planet2 = null;

        for (int i = 0; i < Solar.getOrbits().size(); i++ ){
            if (Solar.getOrbits().get(i).id() == input1){
                planet1 = Solar.getOrbits().get(i);
            }
            if (Solar.getOrbits().get(i).id() == input2){
                planet2 = Solar.getOrbits().get(i);
            }
        }

        try{
            Double gravAtrr = Solar.getGravitationalAttraction(planet1, planet2);
            System.out.print("\n" + "The Gravitational attraction between ");
            System.out.println(planet1.name() + " and " + planet2.name() + " is: ");
            System.out.println(gravAtrr);
            System.out.println("Bye!");
        }catch(Exception e){
            System.out.println("I'm sorry but those Planets doesn't exist. Bye!");
        }
    }
}