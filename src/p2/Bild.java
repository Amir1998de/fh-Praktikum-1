package p2;

public class Bild extends Medium{
    int Erscheinungsjahr;
    String ort;

    public Bild(String title,int jahr,String ort) {
        super(title,jahr);
        this.ort=ort;

    }


    @Override
    void druckeDaten() {
        System.out.println( "ID=" + id  + title +
                "aufgenommen im Jahr"+jahr+
                "in"+ort+
                '}');
    }
}
