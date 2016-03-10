package cput.ac.za.domain;

/**
 * Created by student on 2016/03/10.
 */
public class Vehicle
{
    private int regNum;
    private String name;

    public Vehicle(int regNum, String name) {
        this.regNum = regNum;
        this.name = name;
    }

    public Vehicle() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegNum() {
        return regNum;
    }

    public void setRegNum(int regNum) {
        this.regNum = regNum;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "regNum=" + regNum +
                ", name='" + name + '\'' +
                '}';
    }
}
