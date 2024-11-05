package edu.hitwh;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        String input1 = "bcabc";
        String output1 = solution.removeDuplicateLetters(input1);
        System.out.println("输入: " + input1 + "，输出: " + output1); // 输出: "abc"

        String input2 = "cbacdcbc";
        String output2 = solution.removeDuplicateLetters(input2);
        System.out.println("输入: " + input2 + "，输出: " + output2); // 输出: "acdb"
    }
}
// change 1
