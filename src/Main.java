/////////////////////////////
class WriteBufferFile extends File{
    private byte[] tablica;
    private int currentSize;

    public WriteBufferFile(String name, int N) throws FileNotFoundExc
    {super(name); this.tablica = new byte[N], currentSize=0;}

    public void write(byte b) throws NotFreeSpaceExc{
        if (currentSize < tablica.length)
        {
            tablica[currentSize] = b;
            currentSize++;
            return;
        }
        for(byte bytee: tablica){
            super.write(bytee);
        }
        currentSize = 0;
    }

    //metody read i close są dziedziczone
}
////////////////////////////////////////////////////////////////////////////////////////////////
class Stos implements FILO{
    private Lista lista;

    public Stos(Lista lista){
        this.lista = lista;
    }

    public Stos(){
        this.lista = new Lista();
    }

    public void push(int i) throws IndexOutOfRangeException{
        if (this.lista.maxRozmiar() <= this.lista.rozmiar()){
            //maxRozmiar traktujemy jako metode
            throw new IndexOutOfRangeException();
        }
        this.lista.dodajOstatni(i);
    }

    public void pop() throws IndexOutOfRangeException{
        if (this.empty()){
            //maxRozmiar traktujemy jako metode
            throw new IndexOutOfRangeException();
        }
        this.lista.usunOstatni();
    }

    public int top(){
        if (this.empty())throws IndexOutOfRangeException{
            //maxRozmiar traktujemy jako metode
            throw new IndexOutOfRangeException();
        }
        return this.lista.czytajOstatni();
    }

    public boolean empty(){
        return this.lista.rozmiar() == 0;
    }

}
//////////////////////////////////////////////////////////////////////////////////
class Zwierze {
    private string name;
    private string color;

    public Zwierze(string name, string color) {
        this.name = name;
        this.color = color;
    }

    public bool zna(Zwierze z1) {
        return false;
    }

    public Zwierze kopia() {
        return new Zwierze(this.name, this.color);
    }
}

class Krolik extends Zwierze {
}

class Lis extends Zwierze {
}

class Las {
    private ArrayList<Zwierze> list;
    private int x;
    private int y;

    public Las(int x, int y) {
        this.x = x;
        this.y = y;
        this.list = new ArrayList<Zwierze>();
    }

    public void dodajMieszkanca(Zwierze z1) {
        this.list.Add(z1);
    }

    public int policzZwierzeta() {
        var counter = 0;

        for (var i : this.list) {
            counter++;
        }

        return counter;
    }
}
////////////////////////////////////////////////////////////////////////
#include <string.h>

class Zadanie {
    private:
    string tekst;

    public:
    Zadanie(string tekst) {
        this.tekst = tekst;
    }

    operator +(string tekst) {
        this.tekst += tekst;
    }

    int suma_kontrolna() {
        int sum = 0;

        for (int i = 0; i <= tekst.length(); i++) {
            sum += (int)tekst[i];
        }

        return sum % 256;
    }
}
////////////////////////////////////////////////////////////////////////////////////
public class Przycisk{

}

public class Przycisk2D extends Przycisk{

    private Stirng tekst;

    public Przycisk2D(String napis)
    {
        tekst=napis;
    }

    public void nastepnaKontrolka (Przycisk p)
    {

    }

    public void kopia()
    {
    }

}
public class Przycisk3D extends Przycisk2D{

    private int x,y;

    public Przycisk3D(String napis, int k, int a)
    {
        super(napis);
        x=k;
        a=y;
    }


}
public class Okno
{


}

public class OknoDialogowe extends Okno
{
    private int x,y;

    public OknoDialogowe(int k, int w)
    {
        x=k;
        w=y;
    }

    public void dodaj(Przycisk p1)
    {

    }


}
///////////////////////////////////////////////////////////////////////////////
class LILO{

    private int [] tablica;
    private int indeks;
    public LILO(int rozmiar)
    {
        tablica= new table[rozmiar];
        indeks =0;

    }


    public boolean czyPusta()
    {
        return indeks==0;
    }

    public dodaj (int element) throws IndexOutOfRangeException
    {
        if(indeks+1 >= tablica.size() ) {
            throw new IndexOutOfRangeException();

        }
        tablica[indeks]=element;
        indeks+=1;

    }
    public usun (int element)
    {


        System.arraycopy(tablica, 1, tablica, 0, rozmiar-1)
        indeks-=1;

/////// inny sposob
        for(int i=1; i<=tablica.size; i++)
        {
            tablicaPom[i-1]= tablica[i];

        }
////////

    }

    public int odczytOstatniegoEl()
    {
        return tablica[0];

    }