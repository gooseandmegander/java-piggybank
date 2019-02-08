package com.meganwilliamson;

public class Penny
{
    public double value = 0.01;
    public int count;

    public Penny()
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
