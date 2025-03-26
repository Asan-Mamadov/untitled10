public class Main2 {
    public static void main(String[] args){
        double gradus = 36.50;
        double kelvin = gradus + 273.15;
        double fahrenheit = gradus * 1.80 + 32.00;

        double[] result = {kelvin, fahrenheit};


        System.out.println(kelvin);
        System.out.println(fahrenheit);
        for (int i = 0;i < result.length;i++){
            System.out.println("Массивдин ичиндеги элемент:" + result[i]);
        }
    }
}


class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 +32.00;
        double[] result = {kelvin,fahrenheit};

        return result;
    }
}