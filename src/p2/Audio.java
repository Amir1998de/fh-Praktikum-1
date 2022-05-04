package p2;

public class Audio extends Medium{
String interpret;
int dauer;
public Audio(String title,int jahr,String interpret,int dauer){
    super(title,jahr);
    this.interpret=interpret;
    this.dauer=dauer;

}


    @Override
    void druckeDaten() {
        System.out.println(
                "ID=" + id + title + "von" + interpret+
                "aus"+jahr+
                "Spieldauer: "+dauer+"sek"
                );
    }
}
