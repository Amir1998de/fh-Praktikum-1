package p2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Medienverwaltung {
     static List<Medium> media = new ArrayList<>();

    static int insgesamtEJ;
    public static void main(String[] args) {
        Medium audio1 = new Audio("A1",1998,"in1",30);
        Medium audio2 = new Audio("A2",2010,"in2",45);
        Medium bild1 = new Bild("B1",1980,"essen");
        Medium bild2 = new Bild("B2",2017,"dortmund");



        aufnehmen(audio1);
        aufnehmen(audio2);
        aufnehmen(bild1);
        aufnehmen(bild2);


        //zeigeMedien();
        sucheNeuesMedium();
        System.out.println(berechneErscheinungsjahr());



    }
        public static void aufnehmen (Medium medium){
            media.add(medium);

        }

        public static void zeigeMedien () {
            Iterator<Medium> it = media.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }

        }
        public static void sucheNeuesMedium () {
            Collections.sort(media);
            System.out.println(media.get(0));
        }

        public static double berechneErscheinungsjahr () {
            Iterator<Medium> it = media.iterator();
            while (it.hasNext()) {
                insgesamtEJ += it.next().jahr;
            }

            return insgesamtEJ / media.size();
        }

    }