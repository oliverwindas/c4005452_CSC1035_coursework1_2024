import java.util.ArrayList;
import java.util.List;

/**
 * Represents a system for car manufacturers for reporting.
 */

public class Reporting
{
    private List<Manufacturer> manufacturers;

    /**
     * Constructs a Reporting instance.
     */

    public Reporting()
    {
        this.manufacturers = new ArrayList<>();
    }

    /**
     * Adds a manufacturer to the reporting system.
     *
     * @param manufacturer the manufacturer to add
     */

    public void addManufacturer(Manufacturer manufacturer)
    {
        manufacturers.add(manufacturer);
    }

    /**
     * Returns the most expensive car model sold between all manufacturers.
     *
     * @return the most expensive CarModel
     */

    public CarModel getMostExpensiveCarModelSold()
    {
        CarModel mostExpensiveCarModel = null;

        for (Manufacturer manufacturer : manufacturers)
        {
            if (mostExpensiveCarModel == null
                    || (manufacturer.getMostExpensiveCarModel() != null
                    && manufacturer.getMostExpensiveCarModel().getSalesPrice()
                    > mostExpensiveCarModel.getSalesPrice()))
            {
                mostExpensiveCarModel = manufacturer.getMostExpensiveCarModel();
            }
        }

        return mostExpensiveCarModel;
    }

    /**
     * Returns the company with the largest
     * revenue in sales for that particular car type
     *
     * @param type the type of Car for sales
     * @return the company that sells the most of that model
     */

    public Manufacturer getLargestManufacterRevenueByType(String type)
    {
        Manufacturer largestManufacturerByType = null;

        for (Manufacturer manufacturer : manufacturers)
        {
            if (largestManufacturerByType == null
                    || (manufacturer != null
                    && manufacturer.getTotalRevenueByType(type)
                    > largestManufacturerByType.getTotalRevenueByType(type)))
            {
                largestManufacturerByType = manufacturer;
            }
        }

        return largestManufacturerByType;
    }

    /**
     * Returns a list of all car models over a certain price
     *
     * @param price the price for cars to be over
     * @return the list of those that satisfy.
     */


    public List<CarModel> getAllCarModelsOverPrice(double price)
    {
        List<CarModel> allCarModelsOver = new ArrayList<>();

        for (Manufacturer manufacturer : manufacturers)
        {
            allCarModelsOver.addAll(manufacturer.getListOfCarModelsOverPrice(price));
        }

        return allCarModelsOver;
    }

    public List<Manufacturer> getManufacturers()
    {
        return manufacturers;
    }
}
