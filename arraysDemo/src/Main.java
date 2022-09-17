public class Main {
    public static void main(String[] args) {
        String[] std = new String[3];
        std[0] = "gorkem";
        std[1] = "Alex";
        std[2] = "bekir";
        //std[4] = "ahmet";

        for (int i = 0; i < std.length; i++) {
            System.out.println(std[i]);
        }

        System.out.println("---------------------");

        for (String s : std) {
            System.out.println(s);
        }

    }
}