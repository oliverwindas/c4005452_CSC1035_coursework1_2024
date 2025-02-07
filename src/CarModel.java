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

    public String getName()
    {
        return name;
    }

    public double getWeight()
    {
        return weight;
    }

    public double getSalesPrice()
    {
        return salesPrice;
    }

    public int getNumberSold()
    {
        return numberSold;
    }

    public String getType()
    {
        return type;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public void setSalesPrice(double salesPrice)
    {
        this.salesPrice = salesPrice;
    }

    public void setNumberSold(int numberSold)
    {
        this.numberSold = numberSold;
    }

    public void setType(String type)
    {
        this.type = type;
    }


}
