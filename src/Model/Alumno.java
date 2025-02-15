package Model;

public class Alumno {
    private String carnet;
    private String name;

    public Alumno(String carnet, String name) {
        this.carnet = carnet;
        this.name = name;
    }

    public String getCarnet() {
        return carnet;
    }

    public String getName() {
        return name;
    }
}
