import java.util.Scanner;
public class marksheet {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double marks,sum = 0;
        for(int i =1;i<=5;i++){
            System.out.println("Enter Subject " + i + " Marks :: ");
            marks = inp.nextDouble();
            sum += marks;
        
        }
        System.out.println("Total Marks "+ sum);
        double per = (sum/500)*100;
        System.out.println("Percentage " + per);
}
}
