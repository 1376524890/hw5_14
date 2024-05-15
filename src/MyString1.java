public class MyString1 {
    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = new char[chars.length];
        System.arraycopy(chars, 0, this.chars, 0, chars.length);
    }

    public char charAt(int index) {
        if (index < 0 || index >= chars.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        if (begin < 0 || begin >= chars.length || end < 0 || end > chars.length || begin > end) {
            throw new IndexOutOfBoundsException("Invalid substring range");
        }
        char[] subChars = new char[end - begin];
        System.arraycopy(chars, begin, subChars, 0, end - begin);
        return new MyString1(subChars);
    }

    public MyString1 toLowerCase() {
        char[] lowerCaseChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                lowerCaseChars[i] = (char) (chars[i] + 32);
            } else {
                lowerCaseChars[i] = chars[i];
            }
        }
        return new MyString1(lowerCaseChars);
    }

    public boolean equals(MyString1 s) {
        if (s.length() != this.length()) {
            return false;
        }
        for (int i = 0; i < this.length(); i++) {
            if (this.charAt(i) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static MyString1 valueOf(int i) {
        // Count the number of digits
        int length = 0;
        int temp = i;
        while (temp != 0) {
            temp /= 10;
            length++;
        }

        // Create char array to store digits
        char[] chars = new char[length];
        for (int j = length - 1; j >= 0; j--) {
            chars[j] = (char) ('0' + (i % 10));
            i /= 10;
        }

        return new MyString1(chars);
    }
}

