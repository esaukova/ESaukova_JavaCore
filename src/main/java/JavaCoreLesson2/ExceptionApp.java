package JavaCoreLesson2;

import java.util.Scanner;

public class ExceptionApp {

    public static int SIZE = 4;

    public static void checkArraySize (String[][] array) throws MyArraySizeException {
        if (array.length != SIZE || array[0].length != SIZE) {
            throw new MyArraySizeException("Wrong array length!");
        }
    };

    public static int checkArrayData (String[][] array) throws MyArrayDataException {

        int sum = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException("Wrong data format inside " + i + "x" + j + " cell!");
                }
            }
        }

        System.out.println("Summary of array elements:  " + sum);
        return sum;
    }

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length:");
        int size = input.nextInt();
        String array[][] = new String[size][size];
        checkArraySize(array);
        System.out.println("Enter data:");
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    System.out.print("arr[" + i + "][" + j + "]:");
                    array[i][j] = input.next();
                }

            }
        checkArrayData(array);
    }
}
