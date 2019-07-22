public class Mazda extends Car implements AdditionalFunctions {
    private int extraseats = 2;
    private int heatSystem = 40;

    @Override
    public int accelerate() {
        return 250;
    }

    @Override
    public boolean moveBody() {
        return true;
    }
}
