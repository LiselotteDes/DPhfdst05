package be.vdab.taken;
public class Radio implements Geluidsbron {
    @Override
    public void start() {
        System.out.println("radio gestart");
    }
    @Override 
    public void stop() {
        System.out.println("radio gestopt");
    }
}
