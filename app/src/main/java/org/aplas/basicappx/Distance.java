package org.aplas.basicappx;

public class Distance {

    private double meter;

    public Distance() {
        meter = 0;
    }

    void setMeter(double a){
        meter = a;
    }

    void setInch(double a){
        meter = a / 39.3701;
    }

    void setMile(double a){
        meter = a / 0.000621371;
    }

    void setFoot(double a){
        meter = a / 3.28084;
    }

    double getMeter(){
        return meter;
    }

    double getInch(){
        return meter * 39.3701;
    }

    double getMile(){
        return meter * 0.000621371;
    }

    double getFoot(){
        return meter * 3.28084;
    }

    public double convert(String oriUnit, String convUnit, double value) {
        switch (oriUnit) {
            case "Mtr":
                setMeter(value);
            case "Inc":
                setInch(value);
                break;
            case "Mil":
                setMile(value);
                break;
            case "Ft":
                setFoot(value);
                break;
        }

        switch (convUnit) {
            case "Mtr":
                value = getMeter();
                break;
            case "Inc":
                value = getInch();
                break;
            case "Mil":
                value = getMile();
                break;
            case "Ft":
                value = getFoot();
                break;
        }
        return value;
    }
}
