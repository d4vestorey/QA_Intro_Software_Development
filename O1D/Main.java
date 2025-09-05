package Labs.O1D;

public class Main {
    public static void main(String[] args) {
        
        int[] numbers = {1,3,-5,7,0,4,6,8};

        //sum the numbers in the array
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        System.out.println("The sum of the numbers is: " + sum);

        //average the numbers in the array
        int average = 0;
        for(int number : numbers) {
            average += number;
        }
        average /= numbers.length;
        System.out.println("The average of the numbers is: " + average);

        //find the minimum number in the array
        int min = numbers[0];
        for(int number : numbers) {
            if(number < min) {
                min = number;   
            }
        }
        System.out.println("The minimum number is: " + min);

        //find the maximum number in the array
        int max = numbers[0];
        for(int number : numbers) {
            if(number > max) {
                max = number;   
            }          
        } System.out.println("The maximum number is: " + max);

        //find the index of 0 in the array
        int index = -1; //-1 means not found
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 0) {
                index = i;
                break; //exit the loop once we find the first occurrence

            }
        } System.out.println("The index of 0 is: " + index);
    
    
        String[] students = {"Alice", "Bob", "Charlie", "David", "Eve"};
        int[] scores = {85, 92, 78, 90, 88};

        for(int i = 0; i < students.length; i++) {
            String grade = getGrade(scores[i]);
            System.out.println(students[i] + " scored " + scores[i] + " and received a grade of " + grade);
        }

        int years = returnTime(100);
        System.out.println("It will take " + years + " years to double the investment.");

        multiplicationTable();

    }
    
    static String getGrade(int score) {
        if(score >= 90) {
            return "A";
        } else if(score >= 80) {
            return "B";
        } else if(score >= 70) {
            return "C";
        } else if(score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    static int returnTime(int amount){
        int years = 0;
        int startAmount = amount;
        int newAmount = 0;
        int interestRate = 5;

        while(newAmount <= 200){
            newAmount = startAmount + (startAmount / interestRate);
            years++;
            startAmount = newAmount;            
        }

        return years;
    }

    static void multiplicationTable(){
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                System.out.printf("%5d",(i * j));
            } //%5d means “print an integer right-aligned in a space of width 5” → keeps columns square and neat.
            System.out.println();
            //println() to move to the next line after each row
        }
    }

}

