import java.util.ArrayList;
import java.util.List;

public class Reporting
{
    private List<Manufacturer> manufacturers;

    public Reporting()
    {
        this.manufacturers = new ArrayList<>();
    }

    public void addManufacturer(Manufacturer manufacturer)
    {
        manufacturers.add(manufacturer);
    }

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

    public List<CarModel> getAllCarModelsOverPrice(double price)
    {
        List<CarModel> allCarModelsOver = new ArrayList<>();

        for (Manufacturer manufacturer : manufacturers)
        {
            allCarModelsOver.addAll(manufacturer.getListOfCarModelsOverPrice(price));
        }

        return allCarModelsOver;
    }
}
