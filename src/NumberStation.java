import java.util.Scanner;


public class NumberStation {
    public int NumSt() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int numberOfWStation;
        do {
            System.out.print("Введите количество станций: ");
            numberOfWStation = sc.nextInt();
            if (numberOfWStation < 1 || numberOfWStation > 20) {
                System.out.println("Неверное значение, введите пожалуйста от 1 до 20");
            } else {
                break;
            }
        } while (i < 10);
        return numberOfWStation;
    }

}
