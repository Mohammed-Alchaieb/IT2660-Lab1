public class Lab1 {
  public int max(int a, int b) {
    if (a > b) return a;
    return b;
  }

  public int min(int a, int b) {
    if (a < b) return a;
    return b;
  }

  public int sum(int[] nums) {
    int total = 0;
    for (int n : nums) total += n;
    return total;
  }

  public int average(int[] nums) {
    int total = 0;
    for (int n : nums) total += n; // foreach
    return total / nums.length;    // returns int
  }

  // per rubric: return MIN value in the array
  public int max(int[] nums) {
    int m = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < m) m = nums[i];
    }
    return m;
  }

  // per rubric: return MAX value in the array
  public int min(int[] nums) {
    int m = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > m) m = nums[i];
    }
    return m;
  }

  public int increment(int num) {
    return ++num;
  }
}
