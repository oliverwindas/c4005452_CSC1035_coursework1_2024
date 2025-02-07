/**
 * Represents a car model with its details.
 */

public class CarModel
{
    private String name;
    private double weight;
    private double salesPrice;
    private int numberSold;
    private String type; // "either hatchback, saloon or estate" as per the brief

    /**
     * Constructs a CarModel based off given brief.
     *
     * @param name       name of the car model
     * @param weight     weight of the car model
     * @param salesPrice sales price of the car model
     * @param numberSold number of units sold
     * @param type       type of the car model
     */

    public CarModel(String name, double weight, double salesPrice, int numberSold, String type)
    {
        this.name = name;
        this.weight = weight;
        this.salesPrice = salesPrice;
        this.numberSold = numberSold;
        this.type = type;
    }

    // Getters

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

    // Setters

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
