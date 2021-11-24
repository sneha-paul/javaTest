package com.example.stringtest;

public abstract class StringUtil {

    public static boolean isEmpty(String value) {
        if (value == null) {
            return true;
        } else {
            if(value.length() == 0) {
                return true;
            }
            return false;
        }
    }

    public static String capitalize(String string) {
        return Character.toUpperCase(string.charAt(0)) + string.substring(1);
    }
}
