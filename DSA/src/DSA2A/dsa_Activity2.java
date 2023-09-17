package DSA2A;

import java.util.Scanner;

class Swap {
    public int big(int[] arr) {
        int big = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[big]) {
                big = i;
            }
        }

        return big;
    }

    public int small(int[] arr) {
        int small = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[small]) {
                small = i;
            }
        }

        return small;
    }

    public void display(int[] inputArr, int[] outputArr) {
        System.out.print("Input Array: ");
        for (int num : inputArr) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Output Array (after swapping): ");
        for (int num : outputArr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

public class dsa_Activity2 {

    public static void main(String[] args) {
        final int size = 10;
        int[] arr = new int[size];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter " + size + " integers: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        Swap swapper = new Swap();
        int largest = swapper.big(arr);
        int smallest = swapper.small(arr);

        // Swap the elements directly
        int temp = arr[largest];
        arr[largest] = arr[smallest];
        arr[smallest] = temp;

        swapper.display(arr, arr); // Display both input and output arrays


    }
}
