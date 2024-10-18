import java.util.*;

public class latihan4 {
  private static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    double fahrenheit;
    double celcius;
    double varFarenhait;
    double varCelcius;
    System.out.println("1, Hitung Farenhaeit to celsius");
    System.out.println("2, Hitung Celsius To Farenhait");
    System.out.println("pilih yang mau di ukur 1/2");
    int OptinalValue = getOption();
    if (OptinalValue==1) {
      System.out.println("User Sedang Memilih -> Farenheit TO Celsius ");
      Separator2();
      varCelcius = getCelsius();
      varFarenhait = calculateFahrenheit(varCelcius);
      displayResult2(varCelcius, varFarenhait);
    }else if(OptinalValue==2) {
      System.out.println("User Sedang Memilih -> Celsius TO Farenheit");
      Sparator();
      fahrenheit = getFahrenheit();
      celcius = calculateCelcius(fahrenheit);
      displayResult(fahrenheit, celcius);
    }
  }

  private static void Sparator() {
    System.out.println("================Farenheit to celsius==================");
  }
  private static void Separator2() {
    System.out.println("================celsius to Farenhheit==================");
  }

  private static int getOption() {
    int OptinalVal;
    System.out.println("Enter 1 for celcius to farenheit");
    OptinalVal = input.nextInt();
    return OptinalVal;
  }

  private static double getFahrenheit() {
    double fahrenheit;
    System.out.println("Enter fahrenheit temperature:");
    fahrenheit = input.nextDouble();
    return fahrenheit;
  }

  // hitung rumus dari farenhait -> celsius
  private static double calculateCelcius(double fahrenheit) {
    double celcius;
    celcius = (fahrenheit - 32) * 5 / 9;
    return celcius;
  }

  // Fungsi celsius
  private static double getCelsius() {
    double celsius;
    System.out.println("Enter celsius temperature:");
    celsius = input.nextDouble();
    return celsius;
  }

   // rumus dari celsius -> farenheit
  private static double calculateFahrenheit(double celcius) {
    double fahrenheit;
    fahrenheit = (celcius * 9 / 5) + 32;
    return fahrenheit;
  }

  // Hasil dari fahrenhait -> celcius
  private static void displayResult(double fahrenheit, double celcius) {
    System.out.println(fahrenheit + " Fahrenheit is " +
    celcius + " celcius");
  }

  // Hasil dari celcius -> fahrenhet 
  private static void displayResult2(double celcius, double fahrenheit) {
    System.out.println(celcius + " celcius is " +
    fahrenheit + " fahrenheit");
  }
}