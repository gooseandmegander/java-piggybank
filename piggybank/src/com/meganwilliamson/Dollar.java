package com.meganwilliamson;

public class Dollar
{
    public double value = 1;
    public int count;

    public Dollar()
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
