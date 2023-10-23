
import java.util.HashMap;

public class MyHashMap {
    HashMap<String, String> hm =  new HashMap<>();

    public MyHashMap() {
        hm.put("A", "*-");
        hm.put("B", "-***");
        hm.put("C", "-*-*");
        hm.put("D", "-**");
        hm.put("E", "*");
        hm.put("F", "**-*");
        hm.put("G","--*");
        hm.put("H", "****");
        hm.put("I", "**");
        hm.put("J", "*---");
        hm.put("K", "-*-");
        hm.put("L", "*-**");
        hm.put("M", "--");
        hm.put("N", "-*");
        hm.put("O", "---");
        hm.put("P", "*--*");
        hm.put("Q", "--*-");
        hm.put("R", "*-*");
        hm.put("S", "***");
        hm.put("T", "-");
        hm.put("U", "**-");
        hm.put("V", "***-");
        hm.put("W", "*--");
        hm.put("X", "-**-");
        hm.put("Y", "-*--");
        hm.put("Z", "--**");
        hm.put("1", "*----");
        hm.put("2", "**---");
        hm.put("3", "***--");
        hm.put("4", "****-");
        hm.put("5", "*****");
        hm.put("6", "-****");
        hm.put("7", "--***");
        hm.put("8", "---**");
        hm.put("9", "----*");
        hm.put("0", "-----");
        hm.put(".", "*-*-*-");
        hm.put(",", "--**--");
        hm.put("?", "**--**");
        hm.put(" ", ";");
        hm.put(";", "");

    }
    public HashMap<String, String> getHM() {
        return hm;
    }

}
