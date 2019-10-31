import maths.exos.algos.*;

import java.util.List;

public class SumTwo {

    public static void main(String[] args)
    {
        Solution solution = new Solution();

        int[] elements = new int[7];

        elements[0] = 7;
        elements[1] = 4;
        elements[2] = 9;
        elements[3] = 1;
        elements[4] = 5;
        elements[5] = 6;
        elements[6] = 8;

        int[] results = solution.twoSum(elements, 17);
        System.out.println(results[0] + " " + results[1]);

        int[] s = new int[8];
        s[0] = -1;
        s[1] = 0;
        s[2] = 1;
        s[3] = 2;
        s[4] = -1;
        s[5] = -4;
        s[6] = -3;
        s[7] = -9;

        List resx = solution.threeSum(s);
        System.out.println(resx);
    }

}
