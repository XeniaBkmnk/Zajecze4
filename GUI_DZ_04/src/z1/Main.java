package Zajecze4.GUI_DZ_04.src.z1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public
   class Main {

    public static void main(String[] args) {
        Osoba kowalski = new Osoba("Jan", "Kowalski");
        Osoba nowak = new Osoba("Adam", "Nowak");
        Osoba krawczyk = new Osoba("Bartosz", "Krawczyk");
        Osoba heniek = new Osoba("Kierownik", "Heniek");

        Samochod skoda1 = new Samochod("WA00001", Samochod.Marka.SKODA);
        Samochod skoda2 = new Samochod("SC36010", Samochod.Marka.SKODA);
        Samochod mazda1 = new Samochod("WA01234", Samochod.Marka.MAZDA);
        Samochod mazda2 = new Samochod("DW01ASD", Samochod.Marka.MAZDA);
        Samochod bmw = new Samochod("WA12690", Samochod.Marka.BMW);
        Samochod volvo = new Samochod("KR60606", Samochod.Marka.VOLVO);

        Map<Osoba, List<Samochod>> mapaSamochodow = new HashMap<>();

        mapaSamochodow.put(kowalski, new ArrayList<>());
        mapaSamochodow.get(kowalski).add(skoda1);
        mapaSamochodow.get(kowalski).add(bmw);

        mapaSamochodow.put(nowak, new ArrayList<>());
        mapaSamochodow.get(nowak).add(mazda2);

        mapaSamochodow.put(krawczyk, new ArrayList<>());
        mapaSamochodow.get(krawczyk).add(volvo);
        mapaSamochodow.get(krawczyk).add(mazda1);
        mapaSamochodow.get(krawczyk).add(skoda2);

        mapaSamochodow.put(heniek, new ArrayList<>());

        /*
         * Jan Kowalski -> SKODA WA00001, BMW WA12690
         * Adam Nowak -> MAZDA DW01ASD
         * Bartosz Krawczyk -> VOLVO KR60606, MAZDA WA01234, SKODA SC36010
         * Kierownik Heniek -> [Brak samochodów]
         *
         * Samochody, których numery rejestracyjne zaczynają się na WA:
         * SKODA WA00001
         * BMW WA12690
         * MAZDA WA01234
         * */

        for (Map.Entry<Osoba, List<Samochod>> entry : mapaSamochodow.entrySet())
            if (entry.getValue().isEmpty())
                System.out.println(entry.getKey() + " -> [Brak samochodów]");
            else
                System.out.println(entry.getKey() + " -> " + entry.getValue().toString().replaceAll("[\\[\\]]", ""));

        System.out.println("Samochody, których numery rejestracyjne zaczynają się na WA:");

        for (List<Samochod> samochody : mapaSamochodow.values())
            for (Samochod samochod : samochody)
                if (samochod.getNrRej().startsWith("WA"))
                    System.out.println(samochod);

        for (Map.Entry<Osoba, List<Samochod>> entry : mapaSamochodow.entrySet())
            System.out.println(entry.getKey() +" posiada " + entry.getValue().size());
            // np: Jan  Kowalski  posiada 3 pojazdy


        System.out.println(mapaSamochodow.get(nowak).get(0));
        //  MAZDA  DW01ASD}

    }
}