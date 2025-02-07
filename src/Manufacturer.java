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
}
