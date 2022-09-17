public class Main {
    public static void main(String[] args) {
        char grade = 'G';

        switch (grade){
            case 'A':
                System.out.println("Grade A: You passed");
                break;
            case 'B':
                System.out.println("Grade B: You passed");
                break;
            case 'C':
                System.out.println("Grade C: You passed");
                break;
            case 'D':
                System.out.println("Grade B: You passed");
                break;
            case 'F':
                System.out.println("Grade F: Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}