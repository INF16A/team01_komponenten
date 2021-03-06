package task01;

public class Application {
    public static void main(String[] args) {
        Scientist s1 = new Scientist(true);
        Scientist s2 = new Scientist(true);

        ProxyAccess pa = new ProxyAccess(s1);
        pa.addListener(s1);
        pa.setScientist(s2);
        pa.addListener(s2);

        pa.queryData(); //generate a new measurement
    }
}
