public class Main {
    public static void main(String[] args) {
        String msg = "Bugün hava çok güzel.";
        System.out.println(msg);

        System.out.println("Eleman sayısı: " + msg.length());
        System.out.println("5. eleman : " + msg.charAt(4));
        System.out.println(msg.concat(" Yaşasın!"));
        System.out.println(msg.startsWith("A"));
        System.out.println(msg.endsWith("."));
        char[] charArr = new char[5];
        msg.getChars(0,5,charArr,0);
        System.out.println(charArr);
        System.out.println(msg.indexOf("av"));
        System.out.println(msg.lastIndexOf("a"));

        String newMsg = msg.replace(' ','-');
        System.out.println(newMsg);
        System.out.println(msg.substring(2, 5));

        for(String word: msg.split(" ")){
            System.out.println(word);
        }

        System.out.println(msg.toLowerCase());
        System.out.println(msg.toUpperCase());
        System.out.println(msg.trim());



    }
}