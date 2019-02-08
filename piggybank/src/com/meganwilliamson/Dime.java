package com.meganwilliamson;

public class Dime
{
    public double value = 0.10;
    public int count;

    public Dime()
    {
        this.count = 1;
    }

    public double getValue()
    {
        return value;
    }

    public int getCount()
    {
        return count;
    }

    public void setCount(int n)
    {
        this.count += n;
    }
}
