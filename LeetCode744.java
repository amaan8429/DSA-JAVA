public class LeetCode744 {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] <= target)
                start = mid + 1; // If the current letter is less than or equal to the target, move the start index to the right.
            else
                end = mid - 1; // If the current letter is greater than the target, move the end index to the left.
        }
        // If start exceeds the array length, wrap around to the first character.
        if (start == letters.length)
            return letters[0];
        // Otherwise, return the character at the start index.
        return letters[start];
    }
}
