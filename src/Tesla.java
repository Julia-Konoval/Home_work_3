public class Tesla extends Car implements AdditionalFunctions {
    private String automotiveElectronicSystem = ("Hey, driver! Relax!");
    private String healthyFoodMiniBar = ("Don`t be an alcoholic");


    @Override
    public int accelerate() {
        return 270;
    }

    @Override
    public boolean moveBody() {
        return true;
    }
}

