public class BMW extends Car implements AdditionalFunctions {

    private int coolSystem;
    private String version;


    @Override
    public int accelerate() {
        return 300;
    }

    @Override
    public boolean moveBody() {
        return true;
    }
}
