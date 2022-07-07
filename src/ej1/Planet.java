package ej1;

public class Planet {

    private String id;
    private String name;
    private Double diameterKm;
    private Double massKg;
    private Double kmFromSun;

    public Planet(String id, String name, Double diameterKm, Double massKg, Double kmFromSun){

        this.id = id;
        this.name = name;
        this.massKg = massKg;
        this.diameterKm = diameterKm;
        this.kmFromSun = kmFromSun;
    }

    public String id() {
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
        //Double v = (4/3) * pi * (diameter()/2)3;
        Double v = (4/3) * 3.1416 * (diameter()/2);
        return v;
    }

    public Double density() {
        Double density = massKg()/volume();
        return density;
    }
}
