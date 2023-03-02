import ecs100.*;

public class TemperatureCalculator {
    public static void main(String[] args) {
        // This is so that the method code can match the lecturer's without having to use BlueJ.
        var i = new TemperatureCalculator();
        i.printFormula();
        i.doFahrenheitToCelsius();
    }

    public void printFormula() {
        UI.println("Celsius = ((Fahrenheit - 32) * 5) / 9");
    }

    public void doFahrenheitToCelsius() {
        double fahrenheit = UI.askDouble("Fahrenheit (°F): ");
        double celsius = ((fahrenheit - 32) * 5) / 9;
        UI.println(fahrenheit + "°F = " + celsius + "°C");
    }
}
