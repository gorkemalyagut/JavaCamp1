public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] {1,2,5,7,9,0};
        int search = 6;
        boolean flag = false;

        for (int number : numbers){
            if(number == search){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("Sayı mevcuttur");
         } else {
            System.out.println("Sayı mevcuttur değildir");
        }
    }
}