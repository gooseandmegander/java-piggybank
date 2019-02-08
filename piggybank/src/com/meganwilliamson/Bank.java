package com.meganwilliamson;

public class Bank
{
    public double total;

    public Bank()
    {
        this.total = 0;
    }

    public void add(Money money)
    {
        // add inserted money to bank total
        this.total += money.getTotal();
    }

    public double getTotal()
    {
        return total;
    }

}
