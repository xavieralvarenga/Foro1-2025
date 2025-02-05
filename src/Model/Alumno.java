package Model;

public class Alumno {
    private String name;
    private String carnet;

    public Alumno(String name, String carnet) {
        this.name = name;
        this.carnet = carnet;
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
