/*
 * IT-2660 - Lab 1
 * Student Name: Mohammed Alchaieb
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
    System.out.println("array max = " + lab.max(nums));
    System.out.println("array min = " + lab.min(nums));
  }
}

class Lab1 {
  public int max(int a, int b) {
    if (a > b) return a;
    else return b;
  }

  public int min(int a, int b) {
    if (a < b) return a;
    else return b;
  }

  public int sum(int[] nums) {
    int total = 0;
    for (int n : nums) total += n;
    return total;
  }

  public double average(int[] nums) {
    int total = 0;
    for (int n : nums) total += n;
    return (double) total / nums.length;
  }

  public int max(int[] nums) {
    int m = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > m) m = nums[i];
    }
    return m;
  }

  public int min(int[] nums) {
    int m = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < m) m = nums[i];
    }
    return m;
  }

  public int increment(int num) {
    return ++num;
  }
}
