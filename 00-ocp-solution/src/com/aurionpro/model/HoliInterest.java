package com.aurionpro.model;

public class HoliInterest implements IFestivalInterest {

    @Override
    public double getInterestRate() {
        return 7.5;
    }
    
    @Override
    public String toString() {
        return "HoliInterest [Interest Rate=" + getInterestRate() + "%]";
    }
}
