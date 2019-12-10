import java.util.ArrayList;

public class Spieler extends Printer
{
    private ArrayList<Item> Inventar = new ArrayList<Item>();
    public int Ort;

    public Spieler()
    {

    }

    public void insInventar(Item itm) {     //fuegt Items ins Inventar hinzu
        this.Inventar.add(itm);
    }
    public void liesInventar() {                            //schreibt den Inhalt des Inventars in die Konsole
        this.println("[Inventar]------------------"); //Deko
        this.println("");
        
        for (int i = 0; i < this.Inventar.size(); i++) {            //für jedes Item im Inventar
            this.println(this.Inventar.get(i).Name/* + ": " + this.Inventar.get(i).Beschreibung*/);      //gib das Item in einer Zeile aus
        }
        
        this.println("");                             //Deko
        this.println("----------------------------");
    }
}