/**
 * "Zaslepki", zeby dalo sie skompilowac...
 */
public class Console {
    public static boolean CursorVisible;
    public static int CursorLeft;
    public static int CursorTop;

    public static void Write(String str) {
        System.out.println(str);
    };
    public static void Write(Character chr) {};
    public static void WriteLine(String str) {
        //to juz nie jest zaslepka :)
        System.out.println(str);
    };
    public static void WriteLine() {};
    public static void Clear() {};
    public static void ReadKey() {};
}
