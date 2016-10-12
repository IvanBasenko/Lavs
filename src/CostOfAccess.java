
public class CostOfAccess {

    public void CostOfAcc( double costOfInternetPerWStation, double costOfPowerPerWStation, int numberOfWStation) {
        double costOfAccess;
        costOfAccess = (costOfInternetPerWStation + costOfPowerPerWStation) * numberOfWStation;
        System.out.println("Стоимость подключения интренета: " + costOfAccess);
    }

}
