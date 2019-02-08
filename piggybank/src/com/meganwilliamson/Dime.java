package com.meganwilliamson;

public class Dime implements Money
{
    public final double value = 0.10;
    public int count = 0;

    public Dime()
    {
        this.count += 1;
    }

    public Dime(int n)
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
        return "Dime";
    }
}
