import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 */
public class Parser
{
    private Scanner scan = new Scanner(System.in);
    public String input;
    
    private ArrayList<String> gehen = new ArrayList<String>();
    private ArrayList<String> benutzen = new ArrayList<String>();
    private ArrayList<String> schauen = new ArrayList<String>();
    
    public Parser()
    {
        this.gehen.add("geh");
        this.gehen.add("gehe");
        this.gehen.add("lauf");
        this.gehen.add("laufe");
        this.gehen.add("renn");
        this.gehen.add("renne");
        
        this.benutzen.add("benutz");
        this.benutzen.add("benutze");
        this.benutzen.add("nutz");
        this.benutzen.add("nutze");
        
        this.schauen.add("schau");
        this.schauen.add("schaue");
        this.schauen.add("guck");
        this.schauen.add("sieh");
        
    }
    
    public boolean parse(Raum aktuellerRaum) {
        this.input = scan.nextLine(); 
        
        if (this.input.contains("beenden")) {
            return false;
        }
        
        for (int i = 0; i < this.gehen.size(); i++) {
            //System.out.print(this.input + " " + this.gehen.get(i) + " -");        //nur für Debugging
            if (this.input.contains(this.gehen.get(i))) {
                System.out.println("du gehst.");                                    //platzhalter. ok, tbh das ist alles irgendwie platzhalter.
                return true;                                                             //beendet parse() wenn ein Wort gefunden wurde.
            }
        }
        
        for (int i = 0; i < this.benutzen.size(); i++) {
            if (this.input.contains(this.benutzen.get(i))) {
                System.out.println("du benutzt etwas.");
                return true;                                                             //beendet parse() wenn ein Wort gefunden wurde.
            }
        }
        
        for (int i = 0; i < this.schauen.size(); i++) {    
            if (this.input.contains(this.schauen.get(i))) {
                for (int j = 0; j < aktuellerRaum.Einrichtung.size(); j++) {
                    if (this.input.contains(aktuellerRaum.Einrichtung.get(j).Name)) {
                        aktuellerRaum.Einrichtung.get(j).anschauen();
                        return true;
                    }
                }
            }
        }
    return true;
    }

    
}
