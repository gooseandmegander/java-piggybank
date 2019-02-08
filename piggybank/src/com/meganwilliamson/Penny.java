package com.meganwilliamson;

public class Penny implements Money
{
    public final double value = 0.01;
    public int count = 0;

    public Penny()
    {
        this.count += 1;
    }

    public Penny(int n)
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

    public String getName()
    {
        return "Penny";
    }
}
