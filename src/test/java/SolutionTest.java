import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void maxProfitExample1() {
    assertEquals(5, sol.maxProfit(new int[]{7,1,5,3,6,4}));
  }
  @Test
  void maxProfitExample2() {
    assertEquals(0, sol.maxProfit(new int[]{7,6,4,3,1}));
  }
}