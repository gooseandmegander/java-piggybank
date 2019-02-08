package com.meganwilliamson;

public class Quarter
{
    public double value = 0.25;
    public int count;

    public Quarter()
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
