package algorithms.strings.camelcase;

public class Solution {

    public static void main(String[] args) {
        System.out.println(camelcase("saveChangesInTheEditor"));
    }

    static int camelcase(String s) {
        return s.split("(?<!^)(?=[A-Z])").length;
    }
}
