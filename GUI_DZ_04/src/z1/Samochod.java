package Zajecze4.GUI_DZ_04.src.z1;

import java.util.Map;

public class Samochod {

    enum Marka{BMW, VOLVO, SKODA, MAZDA};

    private String nrRej;
    private Marka marka;

    public Samochod(String nrRej, Marka marka) {
        this.nrRej = nrRej;
        this.marka = marka;
    }

    public String getNrRej() {
        return nrRej;
    }

    @Override
    public String toString() {
        return marka + " " + nrRej;
    }
}
