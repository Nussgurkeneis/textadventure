
/**
 *
 */
public class Raum
{
    private int RaumID;
    private int[] Nachbarraeume;
    private String Beschreibung;
    private Moebel[] Einrichtung;
    
    public Raum(int raum_id, int[] raum_nachbarn, String raum_beschreibung, Moebel[] raum_einrichtung) // raum_einrichtung macht zum constructen vllt nicht unbedingt Sinn, man muesste halt alle Moebel vorher machen
    {
     this.RaumID = raum_id;
     this.Nachbarraeume = raum_nachbarn;
     this.Beschreibung = raum_beschreibung;
     this.Einrichtung = raum_einrichtung;
    }
}
