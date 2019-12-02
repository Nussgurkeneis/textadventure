import java.util.ArrayList;
public class Raum
{
    private int RaumID;
    public ArrayList<Integer> Nachbarraeume = new ArrayList<Integer>();
    private String Beschreibung;
    public ArrayList<Moebel> Einrichtung = new ArrayList<Moebel>();
    
    public Raum(int raum_id, ArrayList<Integer> raum_nachbarn, String raum_beschreibung, ArrayList<Moebel> raum_einrichtung) // raum_einrichtung macht zum constructen vllt nicht unbedingt Sinn, man muesste halt alle Moebel vorher machen
    {
     this.RaumID = raum_id;
     this.Nachbarraeume = raum_nachbarn;
     this.Beschreibung = raum_beschreibung;
     this.Einrichtung = raum_einrichtung;
    }
    
    public void anschauen(){
        System.out.println(this.Beschreibung);
    }
}
