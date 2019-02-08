package com.meganwilliamson;

public class Quarter implements Money
{
    public final double value = 0.25;
    public int count = 0;

    public Quarter()
    {
        this.count += 1;
    }

    public Quarter(int n)
    {
        this.count += n;
    }

    public void add()
    {
        this.count += 1;
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
