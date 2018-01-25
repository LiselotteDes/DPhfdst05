package be.vdab.taken;
/*
Deze class dient als façade.
*/
public class Stereoketen {
    private Versterker versterker = new Versterker();
    private Equalizer equalizer = new Equalizer();
    private Radio radio = new Radio();
    private CDSpeler cdSpeler = new CDSpeler();
    private Geluidsbron huidigeGeluidsbron;
    private boolean gestart;
    
    public void start() {
        versterker.start();
        equalizer.start();
        if(huidigeGeluidsbron != null) {
            huidigeGeluidsbron.start();
        }
        gestart = true;
    }
    
    public void stop() {
        versterker.stop();
        equalizer.stop();
        if (huidigeGeluidsbron != null) {
            huidigeGeluidsbron.stop();
        }
        gestart = false;
    }
    
    public void startRadio() {
        if(gestart) {
            if(huidigeGeluidsbron != null) {
                huidigeGeluidsbron.stop();
            }
            radio.start();
            huidigeGeluidsbron = radio;
        }
    }
    public void startCDSpeler() {
        if(gestart) {
            if(huidigeGeluidsbron != null) {
                huidigeGeluidsbron.stop();
            }
            cdSpeler.start();
            huidigeGeluidsbron = cdSpeler;
        }
    }
}
