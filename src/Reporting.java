import java.util.ArrayList;
import java.util.List;

public class Reporting
{
    private List<Manufacturer> manufacturers;

    public Reporting()
    {
        this.manufacturers = new ArrayList<>();
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
}
