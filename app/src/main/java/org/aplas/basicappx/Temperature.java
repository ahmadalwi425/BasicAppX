package org.aplas.basicappx;

public class Temperature {

    private double celcius;

    public Temperature() {
        celcius = 0;
    }

    public void setCelcius(double a){
        celcius = a;
    }

    public void setFahrenheit(double a){
        celcius = (a - 32) / 9 * 5;
    }

    public void setKelvins(double a){
        celcius = a - 273.15;
    }

    public double getCelcius(){
        return celcius;
    }

    public double getFahrenheit(){
        return (celcius * 9/5) + 32;
    }

    public double getKelvins(){
        return celcius + 273.15;
    }

    public double convert(String oriUnit, String convUnit, double value) {
        switch (oriUnit) {
            case "°C":
                setCelcius(value);
            case "°F":
                setFahrenheit(value);
                break;
            case "K":
                setKelvins(value);
                break;
        }

        switch (convUnit) {
            case "°C":
                value = getCelcius();
                break;
            case "°F":
                value = getFahrenheit();
                break;
            case "K":
                value = getKelvins();
                break;
        }
        return value;
    }
}
