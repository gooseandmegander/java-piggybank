package com.meganwilliamson;

public class Dollar implements Money
{
    public final double value = 1;
    public int count = 0;

    public Dollar()
    {
        this.count += 1;
    }

    public Dollar(int n)
    {
        this.count += n;
    }

    public double getValue()
    {
        return value;
    }

    public int getCount()
    {
        return count;
    }

    public double getTotal()
    {
        return this.count * this.value;
    }
}
