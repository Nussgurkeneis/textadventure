import java.util.ArrayList;

public class Spieler
{
    private ArrayList<Item> Inventar = new ArrayList<Item>();
    private int Ort;

    public Spieler()
    {

    }

    public void insInventar(Item itm) {     //fuegt Items ins Inventar hinzu
        this.Inventar.add(itm);
    }
    public void liesInventar() {                            //schreibt den Inhalt des Inventars in die Konsole
        System.out.println("[Inventar]------------------"); //Deko
        System.out.println("");
        
        for (int i = 0; i < this.Inventar.size(); i++) {            //für jedes Item im Inventar
            System.out.println(this.Inventar.get(i).Name/* + ": " + this.Inventar.get(i).Beschreibung*/);      //gib das Item in einer Zeile aus
        }
        
        System.out.println("");                             //Deko
        System.out.println("----------------------------");
    }
}