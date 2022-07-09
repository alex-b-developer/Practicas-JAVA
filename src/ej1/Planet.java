package ej1;

public class Planet {

    private static int nextId = 1;
    private Integer id;
    private String name;
    private Double diameterKm;
    private Double massKg;
    private Double kmFromSun;

    /**
     *
     * @param name
     * @param diameterKm
     * @param massKg
     * @param kmFromSun
     */
    public Planet(String name, Double diameterKm, Double massKg, Double kmFromSun){

        this.id = Planet.nextId;
        Planet.nextId++;

        this.name = name;
        this.massKg = massKg;
        this.diameterKm = diameterKm;
        this.kmFromSun = kmFromSun;
    }

    public Integer id() {
        return id;
    }

    public String name() {
        return name;
    }

    public Double diameter() {
        return diameterKm;
    }

    public Double massKg(){
        return massKg;
    }

    public Double kmFromSun() {
        return kmFromSun;
    }

    public Double volume() {
        Double v = (4/3) * 3.1416 * (diameter()/2);
        return v;
    }

    public Double density() {
        Double density = massKg()/volume();
        return density;
    }
}
