package p2;

import java.time.LocalDate;
import java.util.Comparator;
import java.time.LocalDate;

abstract class Medium implements Comparable {
    private Medienverwaltung medienverwaltung;
    final int id ;
    static int counter=0;
    int jahr;
    String title;
    public Medium(String title,int jahr){
        this.jahr=jahr;
        this.title=title;
        id=counter++;

    }


    public int getErscheinungsjahr(){
       // return this.Erscheinungsjahr;
        return 0;
    }

    public int alter(){
        LocalDate date = LocalDate.now();
        return date.getYear() - this.jahr;
    }

    abstract void druckeDaten();

    @Override
    public String toString() {
        return "Medium{" +
                "id=" + id +
                ", title=" + title +
                "jahr"+jahr+
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Medium m = (Medium) o;
        if (this.jahr > m.jahr)
            return 1;
        else if (this.jahr < m.jahr)
            return -1;
        return 0;
    }
}
