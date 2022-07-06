public class Planet {

    public String id;
    public String name;
    public Double diameter;
    public Double massKg;
    public Double kmFromSun;

    public Planet(String id, String name, Double diameter, Double masskg, Double kmFromSun){

        this.id = id;
        this.name = name;
        this.diameter = diameter;
        this.kmFromSun = kmFromSun;
    }

    public String id() {
        return id;
    }

    public String name() {
        return name;
    }

    public Double diameter() {
        return diameter;
    }

    public Double massKg(){
        return massKg;
    }

    public Double kmFromSun() {
        return kmFromSun;
    }

    public Double volume() {
        Double v = (4/3) * pi * (diameter()/2)3;
        return v;
    }

    public Double density() {
        Double density = massKg()/volume();
        return density;
    }
}
