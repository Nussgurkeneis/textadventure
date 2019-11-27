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
        
        
    }
    
    public void parse() {
        this.input = scan.nextLine(); 
        
        for (int i = 0; i < this.gehen.size(); i++) {
            //System.out.print(this.input + " " + this.gehen.get(i) + " -");        //nur für Debugging
            if (this.input.equals(this.gehen.get(i))) {
                System.out.println("du gehst.");                                    //platzhalter. ok, tbh das ist alles irgendwie platzhalter.
            }
        }
    }

    
}
