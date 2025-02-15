package Model;

public class Alumno {
    private String name;
    private String carnet;

    // Constructor arreglado
    public Alumno(String carnet, String name) {
        this.carnet = carnet;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
}
