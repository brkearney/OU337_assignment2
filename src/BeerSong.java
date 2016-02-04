public class BeerSong {

    public static void Ninety_Nine_Bottles_Of_Beer()
    {
        for (int i=99; i>0; i--)
        {
            if (i != 1)
            {
                if (i!= 2)
                {
                    System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer\nTake one down, pass it around, " + (i - 1) + " bottles of beer on the wall.\n");
                }
                else
                {
                    System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer\nTake one down, pass it around, " + (i - 1) + " bottle of beer on the wall.\n");
                }
            }
            else
            {
                System.out.println(i + " bottle of beer on the wall, " + i + " bottle of beer\nTake it down, pass it around, no more bottles of beer on the wall.");
            }
        }
    }

    public static void main(String[] args){
        Ninety_Nine_Bottles_Of_Beer();
    }
}
