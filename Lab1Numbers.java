import java.util.Scanner;

public class Lab1Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] integernumbers;
        System.out.println("Enter in the list of numbers, separated by spaces. Enter n for default range (1-100) and hit enter for the end of the list: ");
        String userSingleInput = input.nextLine();
        
            if( userSingleInput.equals("n") ) {
                integernumbers = new int[100];
                for( int i = 1; i <= 100; i++ ) {
                    integernumbers[i-1] = i;
                }
            } else {
                String[] userInput = userSingleInput.split(" ");
                for( String num : userInput ) {
                    System.out.println(num);
                }
                integernumbers = new int[userInput.length];
                for( int i = 0; i < userInput.length; i++ ) {
                    integernumbers[i] = Integer.parseInt(userInput[i]);
                }
            }
        System.out.println("Even Numbers:");
        printEvenNumbers(integernumbers);
        System.out.println("Odd Numbers:");
        printOddNumbers(integernumbers);
        System.out.println("Sum of numbers:");
        printSum(integernumbers);
        System.out.println("Largest Prime Number:");
        printLargestPrimeNumber(integernumbers);
        System.out.println("Perfect Square Numbers:");
        printPerfectSquareNumbers(integernumbers);

        input.close();
        
        
    }

    public static void printEvenNumbers(int[] numbers) {
        for( int i = 0; i < numbers.length; i++ ) {
            if( numbers[i] % 2 == 0 ) {
                System.out.println(numbers[i]);
            }
        }
    }
    public static void printOddNumbers(int[] numbers) {
        for( int i = 0; i < numbers.length; i++ ) {
            if( numbers[i] % 2 != 0 ) {
                System.out.println(numbers[i]);
            }
        }
    }

    public static void printSum(int[] numbers) {
        int sum = 0;
        for( int i = 0; i < numbers.length; i++ ) {
            sum += numbers[i];
        }
        System.out.println("Sum: " + sum);
    }

    public static void printLargestPrimeNumber(int[] numbers) {
        int largestPrime = -1;
        for( int i = 0; i < numbers.length; i++ ) {
            if( isPrime(numbers[i]) && numbers[i] > largestPrime ) {
                largestPrime = numbers[i];
            }
        }
        if( largestPrime != -1 ) {
            System.out.println(largestPrime);
        } else {
            System.out.println("No prime numbers found.");
        }
    }

    public static boolean isPrime(int num) {
        if( num <= 1 ) {
            return false;
        }
        for( int i = 2; i <= Math.sqrt(num); i++ ) {
            if( num % i == 0 ) {
                return false;
            }
        }
        return true;
    }

    public static void printPerfectSquareNumbers(int[] numbers) {
        for( int i = 0; i < numbers.length; i++ ) {
            if( isPerfectSquare(numbers[i]) ) {
                System.out.println(numbers[i]);
            }
        }
    }

    public static boolean isPerfectSquare(int num) {
        if(Math.round(Math.sqrt(num))==Math.sqrt(num)) {
            return true;
        } else {
            return false;
        }
    }

}