package morseTranslator;


import java.util.HashMap;

public class Logic {

    private String[] myInputArray;

    public void translateEnglish(String input) {
        String inputToUpper = input.toUpperCase();
        myInputArray = inputToUpper.split("");
        for (int i = 0; i < input.length(); i++) {
            System.out.print(myHashMap.get(myInputArray[i]));
            System.out.print(" ");
        }

    }

    public void translateMorse(String input) {
        myInputArray = input.split(" ");
        for (int i = 1; i < input.length(); i++) {
            System.out.print(reversedMyHashMap.get(myInputArray[i]));
        }
    }


    static HashMap<String, String> myHashMap = new HashMap<>();

    static {
        myHashMap.put(" ", "/");
        myHashMap.put("A", "*-");
        myHashMap.put("B", "-***");
        myHashMap.put("C", "-*-*");
        myHashMap.put("D", "-**");
        myHashMap.put("E", "*");
        myHashMap.put("F", "**-*");
        myHashMap.put("G", "--*");
        myHashMap.put("H", "****");
        myHashMap.put("I", "**");
        myHashMap.put("J", "*---");
        myHashMap.put("K", "-*-");
        myHashMap.put("L", "*-**");
        myHashMap.put("M", "--");
        myHashMap.put("N", "-*");
        myHashMap.put("O", "---");
        myHashMap.put("P", "*--*");
        myHashMap.put("Q", "--*-");
        myHashMap.put("R", "*-*");
        myHashMap.put("S", "***");
        myHashMap.put("T", "-");
        myHashMap.put("U", "**-");
        myHashMap.put("V", "***-");
        myHashMap.put("W", "*--");
        myHashMap.put("X", "-**-");
        myHashMap.put("Y", "-*--");
        myHashMap.put("Z", "--**");
        myHashMap.put("1", "*----");
        myHashMap.put("2", "**---");
        myHashMap.put("3", "***--");
        myHashMap.put("4", "****");
        myHashMap.put("5", "*****");
        myHashMap.put("6", "-****");
        myHashMap.put("7", "--***");
        myHashMap.put("8", "---**");
        myHashMap.put("9", "----*");
        myHashMap.put("0", "-----");
        myHashMap.put(".", "*-*-*-");
        myHashMap.put(",", "--**--");
        myHashMap.put("?", "**--**");
    }

    static HashMap<String, String> reversedMyHashMap = new HashMap<>();

    static {
        reversedMyHashMap.put(" ", "");
        reversedMyHashMap.put("/", " ");
        reversedMyHashMap.put("*-", "A");
        reversedMyHashMap.put("-***", "B");
        reversedMyHashMap.put("-*-*", "C");
        reversedMyHashMap.put("-**", "D");
        reversedMyHashMap.put("*", "E");
        reversedMyHashMap.put("**-*", "F");
        reversedMyHashMap.put("--*", "G");
        reversedMyHashMap.put("****", "H");
        reversedMyHashMap.put("**", "I");
        reversedMyHashMap.put("*---", "J");
        reversedMyHashMap.put("-*-", "K");
        reversedMyHashMap.put("*-**", "L");
        reversedMyHashMap.put("--", "M");
        reversedMyHashMap.put("-*", "N");
        reversedMyHashMap.put("---", "O");
        reversedMyHashMap.put("*--*", "P");
        reversedMyHashMap.put("--*-", "Q");
        reversedMyHashMap.put("*-*", "R");
        reversedMyHashMap.put("***", "S");
        reversedMyHashMap.put("-", "T");
        reversedMyHashMap.put("**-", "U");
        reversedMyHashMap.put("***-", "V");
        reversedMyHashMap.put("*--", "W");
        reversedMyHashMap.put("-**-", "X");
        reversedMyHashMap.put("-*--", "Y");
        reversedMyHashMap.put("--**", "Z");
        reversedMyHashMap.put("*----", "1");
        reversedMyHashMap.put("**---", "2");
        reversedMyHashMap.put("***--", "3");
        reversedMyHashMap.put("****-", "4");
        reversedMyHashMap.put("*****", "5");
        reversedMyHashMap.put("-****", "6");
        reversedMyHashMap.put("--***", "7");
        reversedMyHashMap.put("---**", "8");
        reversedMyHashMap.put("----*", "9");
        reversedMyHashMap.put("-----", "0");
        reversedMyHashMap.put("*-*-*-", ".");
        reversedMyHashMap.put("--**--", ",");
        reversedMyHashMap.put("**--**", "?");
    }
}

