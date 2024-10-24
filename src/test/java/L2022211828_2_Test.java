

import edu.hitwh.Solution2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution2Test {

    private final Solution2 solution = new Solution2();


    @Test
    public void testRemoveDuplicateLetters_AllUnique() {
        String input = "abcdef";
        String expected = "abcdef";
        String result = solution.removeDuplicateLetters(input);
        assertEquals(expected, result);
    }

    @Test
    public void testRemoveDuplicateLetters_AllSame() {
        String input = "aaaaaa";
        String expected = "a";
        String result = solution.removeDuplicateLetters(input);
        assertEquals(expected, result);
    }

    @Test
    public void testRemoveDuplicateLetters_MixedDuplicates() {
        String input = "abacabad";
        String expected = "abcd"; // 字典序最小
        String result = solution.removeDuplicateLetters(input);
        assertEquals(expected, result);
    }

    @Test
    public void testRemoveDuplicateLetters_EmptyString() {
        String input = "";
        String expected = "";
        String result = solution.removeDuplicateLetters(input);
        assertEquals(expected, result);
    }

    @Test
    public void testRemoveDuplicateLetters_LongString() {
        String input = "leetcode";
        String expected = "letcod"; // 字典序最小
        String result = solution.removeDuplicateLetters(input);
        assertEquals(expected, result);
    }

    @Test
    public void testRemoveDuplicateLetters_SingleCharacter() {
        String input = "z";
        String expected = "z";
        String result = solution.removeDuplicateLetters(input);
        assertEquals(expected, result);
    }

    @Test
    public void testRemoveDuplicateLetters_VariedCharacters() {
        String input = "bbcaac";
        String expected = "bac"; // 字典序最小
        String result = solution.removeDuplicateLetters(input);
        assertEquals(expected, result);
    }
}
