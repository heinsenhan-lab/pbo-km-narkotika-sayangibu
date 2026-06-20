package util;

public class InputHandler {

    public static boolean validasiString(String value) {
        return value != null && !value.trim().isEmpty();
    }

    public static int parseInt(String value) throws NumberFormatException {
        return Integer.parseInt(value);
    }

    public static double parseDouble(String value) throws NumberFormatException {
        return Double.parseDouble(value);
    }
}