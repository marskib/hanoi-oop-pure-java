public class Utilities {
    //Columns to place the stacks A,B,C
    public static int kA = 15;
    public static int kB = 40;
    public static int kC = 65;
    //
    public static byte Wd = 20; //Wiersz dolny
    public static byte SzerPdst = 24; //width of the widest disk; should be even
    //public static char pattern = '#';
    public static char pattern = (char)230;

    public static void gotoXY(int x, int y)
    {
        Console.CursorLeft = x;
        Console.CursorTop = y;
    }
}
