public abstract class Printer
{
    private int timeout = 40;
    
    public Printer()
    {

    }

    public void print(String input)
    {
        String[] buchstaben;
        buchstaben = input.split("");
        for (int i = 0; i < buchstaben.length; i++) {
            System.out.print(buchstaben[i]);
            try{Thread.sleep(this.timeout);}catch(InterruptedException ie){}
        }
    }
    
    public void println(String input)
    {
        String[] buchstaben;
        buchstaben = input.split("(?!^)");
        for (int i = 0; i < buchstaben.length; i++) {
            System.out.print(buchstaben[i]);
            try{Thread.sleep(this.timeout);}catch(InterruptedException ie){}
        }
        System.out.println("");
    }
}
