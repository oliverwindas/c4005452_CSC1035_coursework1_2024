import java.util.ArrayList;
import java.util.List;

/**
 * Represents a car manufacturer with its car models.
 */

public class Manufacturer
{
    private String name;
    private List<CarModel> carModels;

    /**
     * Constructs a Manufacturer with the specified name.
     *
     * @param name the name of the manufacturer
     */

    public Manufacturer(String name)
    {
        this.name = name;
        this.carModels = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public List<CarModel> getCarModels()
    {
        return carModels;
    }

    /**
     * Returns the most expensive car model produced by the manufacturer.
     *
     * @return the most expensive CarModel
     */

    public CarModel getMostExpensiveCarModel()
    {
        CarModel mostExpensiveCarModel = null;
        for (CarModel model : carModels)
        {
            if (mostExpensiveCarModel == null || model.getSalesPrice() > mostExpensiveCarModel.getSalesPrice())
            {
                mostExpensiveCarModel = model;
            }
        }
        return mostExpensiveCarModel;
    }

    /**
     * Calculates total revenue for cars sold of a given type.
     *
     * @param type the type of car
     * @return total revenue
     */

    public double getTotalRevenueByType(String type)
    {
        double totalRevenue = 0;
        for (CarModel model : carModels)
        {
            if (model.getType().equals(type))
            {
                totalRevenue += (model.getSalesPrice()*model.getNumberSold());
            }
        }
        return totalRevenue;
    }

    /**
     * Compiles a list of all the CarModels over a certain price.
     *
     * @param price the price to be over
     * @return total revenue
     */

    public List<CarModel> getListOfCarModelsOverPrice(double price)
    {
        List<CarModel> CarModelsOver = new ArrayList<>();

        for (CarModel model : carModels)
        {
            if (model.getSalesPrice() > price)
            {
                CarModelsOver.add(model);
            }
        }


        return CarModelsOver;
    }

    /**
     * Sets the manufacturer name.
     *
     * @param name the name to set
     */

    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Sets the CarModel List to the manufacturer's list.
     *
     * @param carModels the car model to set
     */

    public void setCarModels(List<CarModel> carModels)
    {
        this.carModels = carModels;
    }

    /**
     * Adds a car model to the manufacturer's list.
     *
     * @param carModel the car model to add
     */

    public void addCarModel(CarModel carModel)
    {
        this.carModels.add(carModel);
    }
}
