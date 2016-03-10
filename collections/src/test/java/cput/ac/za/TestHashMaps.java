package cput.ac.za;

import cput.ac.za.domain.Vehicle;
import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;

/**
 * Created by student on 2016/03/10.
 */
public class TestHashMaps
{

    Vehicle vehicle;
    Vehicle vehicle2;
    Vehicle vehicle3;
    @BeforeMethod
    public void setUpVehicle() throws Exception {
        vehicle = new Vehicle(15524,"BMW");
        vehicle2 = new Vehicle(14578,"VW");
        vehicle3 = new Vehicle(19871,"KIA");

    }



    @Test
    public void testVehicle() throws Exception
    {
        HashMap <Integer, String> carType = new HashMap<Integer, String>();

        carType.put(vehicle.getRegNum(),vehicle.getName());
        carType.put(vehicle2.getRegNum(),vehicle.getName());
        carType.put(vehicle3.getRegNum(),vehicle.getName());

        Assert.assertEquals(15524,vehicle.getRegNum());

        System.out.println(carType);

        System.out.println(carType.size());

        carType.remove(15524);

        System.out.println(carType);

        System.out.println(carType.size());

        carType.clear();

        System.out.println(carType);

        System.out.println(carType.size());
    }
}
