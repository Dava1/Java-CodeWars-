package com.company;

public class SimpleEncryption {

    public static String encrypt(final String text, final int n) {
        if (text == null || n <= 0) return text;
        StringBuilder result = new StringBuilder(text);
        StringBuilder temporary = new StringBuilder(text);
        int numbersOfIteration = 0;
        for (int i = 0; i < n; i++) {
            result = encryptStep(result.toString());
        }
        return result.toString();
    }

    private static StringBuilder encryptStep(String text) {
        StringBuilder forWork = new StringBuilder(text);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (i % 2 != 0) {
                result.append(forWork.charAt(i));
            }
        }
        for (int i = 0; i < text.length(); i++) {
            if (i % 2 == 0) {
                result.append(forWork.charAt(i));
            }
        }
        return result;
    }

    public static String decrypt(final String encryptedText, final int n) {
        if (encryptedText == null) return encryptedText;
        StringBuilder result = new StringBuilder(encryptedText);
        for (int i = 0; i < n; i++) {
            result = descrypterStep(result.toString());
        }
        return result.toString();
    }

    private static StringBuilder descrypterStep(String encryptedText) {
        int length = encryptedText.length();
        int step = length / 2;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < step; i++) {
            result.append(encryptedText.charAt(step + i));
            result.append(encryptedText.charAt(i));
        }
        if (length % 2 == 1) {
            result.append(encryptedText.charAt(length - 1));
        }
        return result;
    }

}
