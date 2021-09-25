package org.aplas.basicappx;

public class Weight {

    private double gram;

    public Weight() {
        gram = 0;
    }

    public void setGram(double a) {
        gram = a;
    }

    public void setOunce(double a) {
        gram = a * 28.3495231;
    }

    public void setPound(double a) {
        gram = a * 453.59237;
    }

    public double getGram() {
        return gram;
    }

    public double getOunce() {
        return gram / 28.3495231;
    }

    public double getPound() {
        return gram / 453.59237;
    }

    public double convert(String oriUnit, String convUnit, double value) {
        switch (oriUnit) {
            case "Grm":
                setGram(value);
            case "Onc":
                setOunce(value);
                break;
            case "Pnd":
                setPound(value);
                break;
        }

        switch (convUnit) {
            case "Grm":
                value = getGram();
                break;
            case "Onc":
                value = getOunce();
                break;
            case "Pnd":
                value = getPound();
                break;
        }
        return value;
    }
}
