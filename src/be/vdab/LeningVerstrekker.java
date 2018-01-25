package be.vdab;
import java.math.BigDecimal;
/*
Deze class speelt de rol van 'façade' en heeft het moeilijk algoritme in zich.
*/
public class LeningVerstrekker {
    public boolean isLeningGoedgekeurd(Persoon persoon) {
        return persoon.getBeroepsinkomsten().getMaandWedde().compareTo(BigDecimal.valueOf(2500)) >= 0
                && persoon.getRekening().getSaldo().compareTo(BigDecimal.ZERO) > 0
                && persoon.getLeningen().isEmpty();
    }
}
