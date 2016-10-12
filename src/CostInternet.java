import java.util.Scanner;


public class CostInternet {

    public double CostInt(){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        double costOfInternetPerWStation;
        do {
            System.out.print("Введите стоимость подключения интренета на одну станцию: ");
            costOfInternetPerWStation = sc.nextDouble();
            if (costOfInternetPerWStation < 100 || costOfInternetPerWStation > 1000) {
                System.out.println("Неверное значение введите пожалуйста от 100 до 1000");
            } else {
                break;
            }
            i++;
        }while (i<10);
        return costOfInternetPerWStation;
    }
}
