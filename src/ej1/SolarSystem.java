package ej1;

import java.util.ArrayList;

public class SolarSystem {

    private static final Double gravityConstant = 6.67d;
    private ArrayList<Planet> orbits;

    public SolarSystem(){
        this.orbits = new ArrayList<Planet>();

        this.orbits.add(new Planet("1", "Mercury", 4879d, 0.330d, 57.9d));
        this.orbits.add(new Planet("2", "Venus", 12104d, 4.87d, 108.2d));
        this.orbits.add(new Planet("3", "Earth", 12756d, 5.97d, 149.6d));
        this.orbits.add(new Planet("4", "Mars", 6792d, 0.642d, 228.0d));
        this.orbits.add(new Planet("5", "Jupiter", 142984d, 1898d, 778.5d));
        this.orbits.add(new Planet("6", "Saturn", 120536d, 568d, 1432.0d));
        this.orbits.add(new Planet("7", "Uranus", 51118d, 86.8d, 2867.0d));
        this.orbits.add(new Planet("8", "Neptune", 49528d, 102d, 4515.0d));
        this.orbits.add(new Planet("9", "Pluto", 2376d, 0.0130d, 5906.4d));
    }

    public ArrayList<Planet> getOrbits() {
        return orbits;
    }

    public Double getGravitationalAttraction(Planet planet1, Planet planet2){
        Double d = getPlanetDistance(planet1, planet2);
        return gravityConstant * planet1.massKg() * planet2.massKg() / d;
    }

    public Double getPlanetDistance(Planet planet1, Planet planet2){
        Double d = null;
        if (planet1.kmFromSun() > planet2.kmFromSun()){
            d = planet1.kmFromSun() - planet2.kmFromSun();
        }else if (planet1.kmFromSun() < planet2.kmFromSun()){
            d = planet2.kmFromSun() - planet1.kmFromSun();
        }
        return d;
    }
}
