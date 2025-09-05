package Labs.O1B;

public class Main {
    public static void main(String[] args) {
        
        int grade = 99;

        if(grade < 50){
            System.out.println("Fail");
        }
        else if(grade <= 60){
            System.out.println("Pass");
        }
        else if(grade <=70){
            System.out.println("Merit");
        }
        else if(grade <= 100){
            System.out.println("Distinction");
        }

    }
}
