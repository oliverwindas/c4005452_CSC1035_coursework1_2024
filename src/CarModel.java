import java.util.Objects;

public class CarModel
{
    private String name;
    private double weight;
    private double salesPrice;
    private int numberSold;
    private String type; // "either hatchback, saloon or estate" as per the brief

    public CarModel(String name, double weight, double salesPrice, int numberSold, String type)
    {
        this.name = name;
        this.weight = weight;
        this.salesPrice = salesPrice;
        this.numberSold = numberSold;
        this.type = type;
    }
}
