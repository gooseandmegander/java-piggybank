package com.meganwilliamson;

public class Main
{
    public static void main(String[] args)
    {
        // create piggybank
        Bank piggybank = new Bank();

        // add currency to it
        piggybank.add(new Quarter());
        piggybank.add(new Dime());
        piggybank.add(new Dollar(5));
        piggybank.add(new Nickel(3));
        piggybank.add(new Dime(7));
        piggybank.add(new Dollar());
        piggybank.add(new Penny(10));

        // print amount of each currency in bank
        piggybank.printContents();

        // print total bank value
        System.out.println("The piggybank holds $" + piggybank.getTotal());
    }
}
