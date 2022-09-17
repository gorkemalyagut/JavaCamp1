public class Main {
    public static void main(String[] args) {
        //For loop
        for (int i=2; i<10; i+=2){
            System.out.println(i);
        }
        System.out.println("For End");

        //While loop
        int i=2;
        while (i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("While End");

        //Do-While loop
        int j=2;
        do{
            System.out.println(j);
            j+=2;
        }while(j<10);

        System.out.println("Do-While End");
    }

}