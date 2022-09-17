public class Main {
    public static void main(String[] args) {
        int num1 = 139;
        int num2 = 29;
        int num3 = 19;

        int largestNum = num1;
        if(largestNum<num2){
            largestNum = num2;
        }
        if(largestNum<num3){
            largestNum = num3;
        }
        System.out.println("Largest Number: "+largestNum);
    }
}