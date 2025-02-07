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
