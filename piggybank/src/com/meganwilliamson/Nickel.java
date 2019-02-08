package com.meganwilliamson;

public class Nickel implements Money
{
    public final double value = 0.05;
    public int count = 0;

    public Nickel()
    {
        this.count += 1;
    }

    public Nickel(int n)
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
        return "Nickel";
    }
}
