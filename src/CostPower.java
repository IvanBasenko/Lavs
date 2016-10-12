import java.util.Scanner;


public class CostPower {
    public double CostPwt(){
        Scanner sc = new Scanner(System.in);
        int i =0;
        double costOfPowerPerWStation;
        do {
            System.out.print("Введите стоимость подключения питания на одну станцию: ");
            costOfPowerPerWStation = sc.nextDouble();
            if (costOfPowerPerWStation < 50 || costOfPowerPerWStation > 500) {
                System.out.println("Неверное значение введите пожалуйста от 50 до 500");
            } else {
                break;
            }
            i++;
        }while (i<10);
        return costOfPowerPerWStation;
    }
}
