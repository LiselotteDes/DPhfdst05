package be.vdab.taken;
public class Main {
    public static void main(String[] args) {
        Stereoketen stereoketen = new Stereoketen();
        stereoketen.start();
        stereoketen.startRadio();
        stereoketen.stop();
        stereoketen.start();
        stereoketen.startCDSpeler();
    }
    
}
