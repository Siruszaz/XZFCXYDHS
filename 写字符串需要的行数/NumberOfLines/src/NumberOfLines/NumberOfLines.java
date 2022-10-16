package NumberOfLines;

public class NumberOfLines {
    public int[] numberOfLines(int[] widths, String s) {
    int[] ans = new int[2];
    ans[0] = 1;
    for (char arr : s.toCharArray()) {
        ans[1] += widths[arr - 'a'];
        if (ans[1] > 100) {
            ans[1] = widths[arr - 'a'];
            ans[0]++;
        }
    }
    return ans;
  }
}
