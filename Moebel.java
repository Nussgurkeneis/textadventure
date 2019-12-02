public class Moebel
{
    public String Name;
    private String Beschreibung;
    
    public Moebel(String moebel_name, String moebel_beschreibung)
    {
     this.Name = moebel_name;
     this.Beschreibung = moebel_beschreibung;
    }
    
    public void anschauen() {
     System.out.println(this.Name + ": " + this.Beschreibung);
    }
}
