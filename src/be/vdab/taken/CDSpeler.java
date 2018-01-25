package be.vdab.taken;
public class CDSpeler implements Geluidsbron {
    @Override
    public void start() {
        System.out.println("CDSpeler gestart");
    }
    @Override
    public void stop() {
        System.out.println("CDSpeler gestopt");
    }
}
