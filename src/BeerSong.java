public class BeerSong {

    public void Ninety_Nine_Bottles_Of_Beer(int count)
    {
        if (count != 1)
        {
            System.out.println(count + "bottles of beer on the wall, " + count + " bottles of beer\nTake one down, pass it around, " + (count - 1) + " bottles of beer on the wall.");
        }
        else
        {
            System.out.println(count + "bottles of beer on the wall, " + count + " bottles of beer\nTake it down, pass it around, no more bottles of beer on the wall.");
        }
    }

    public static void main(String[] args){
        for (int i=99; i>0; i--)
        {
            Ninety_Nine_Bottles_Of_Beer(i);
        }
    }
}
