import java.util.ArrayList;
import java.util.List;

public class Manufacturer
{
    private String name;
    private List<CarModel> carModels;

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

    public CarModel getMostExpensiveCarModel()
    {
        CarModel mostExpensiveCarModel = null;
        for (CarModel model : carModels)
        {
            if (mostExpensive == null || model.getSalesPrice() > mostExpensive.getSalesPrice())
            {
                mostExpensive = model;
            }
        }
        return mostExpensiveCarModel;
    }

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

    public void setName(String name)
    {
        this.name = name;
    }

    public void setCarModels(List<CarModel> carModels)
    {
        this.carModels = carModels;
    }

    public void addCarModel(CarModel carModel)
    {
        this.carModels.add(carModel);
    }
}
