package ru.netology;

public class Main {

    private static final String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." +
            " Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in" +
            " voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        WordChecker wordChecker = new WordChecker(lorem);
        //System.out.println(wordChecker.hasWord("ut"));
        System.out.println("Contains 'dolor': " + wordChecker.hasWord("dolor"));
        System.out.println("Contains 'abc': " + wordChecker.hasWord("abc"));
    }
}
