import java.util.ArrayList;
public class Karte
{
    public ArrayList<Raum> RaumNr = new ArrayList<Raum>();
    
    public Karte(ArrayList<Raum> liste) {
        for (int i = 0; i < liste.size(); i++) {
            this.RaumNr.add(liste.get(i));
        }
    }
}
