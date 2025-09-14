/*
 * IT-2660 - Lab 1
 * Student Name: Mohammed Alchaieb
 * CRN: 84280
 */

public class Main {
  public static void main(String[] args) {
    int[] nums = {5, 9, 3, 12, 7, 3, 11, 5};

    int i = 0;
    while (i < nums.length) {
      System.out.print(nums[i] + " ");
      i++;
    }
    System.out.println();

    for (int j = nums.length - 1; j >= 0; j--) {
      System.out.print(nums[j] + " ");
    }
    System.out.println();

    System.out.println("First: " + nums[0]);
    System.out.println("Last: " + nums[nums.length - 1]);

    Lab1 lab = new Lab1();
    System.out.println("max(7,12) = " + lab.max(7, 12));
    System.out.println("min(7,12) = " + lab.min(7, 12));
    System.out.println("sum = " + lab.sum(nums));
    System.out.println("average = " + lab.average(nums));
    System.out.println("array max (rubric=min) = " + lab.max(nums));
    System.out.println("array min (rubric=max) = " + lab.min(nums));
  }
}

