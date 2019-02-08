package com.meganwilliamson;

public class Nickle
{
    public double value = 0.05;
    public int count;

    public Nickle()
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
