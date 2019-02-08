package com.meganwilliamson;

import java.util.ArrayList;

public class Bank
{
    public double total;
    public ArrayList<Money> drawer = new ArrayList<>();


    public Bank()
    {
        this.total = 0;
    }

    public void add(Money money)
    {
        // add inserted money to bank total
        this.total += money.getTotal();
        // add money to drawer
        this.drawer.add(money);
    }

    public double getTotal()
    {
        return total;
    }

    public void printContents()
    {
        drawer.forEach(denomination -> System.out.println(denomination.getCount() + " " + denomination.getName()));
    }



}
