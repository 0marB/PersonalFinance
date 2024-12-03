package ThreeDPrinter;

public class Prints {
    private double weight;
    private String filamentType;
    private String color;
    private double nozzleMeasurement;
    private int nozzleTemperature;
    private int bedTemperature;
    private String printName;

    public Prints(double weight, String ft, String color, double nm, int nt, int bt, String pn) {
        this.weight = weight;
        this.filamentType = ft;
        this.color = color;
        this.nozzleMeasurement = nm;
        this.nozzleTemperature = nt;
        this.bedTemperature = bt;
        this.printName = pn;
    }

    public String toString() {
        return printName + " " + nozzleTemperature + " " + bedTemperature+ " " + color + "" + weight;
    }
}
