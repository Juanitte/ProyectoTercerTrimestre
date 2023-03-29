package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    /**
     * Method that validates the format of an international telephone number.
     * @param phoneNumber , the number to validate.
     * @return a true boolean if it's valid, or false if it's not.
     */
    public static boolean validatePhoneNumber(String phoneNumber) {
        boolean isValid=false;

        if (phoneNumber.matches("^\\+(?:[0-9]●?){6,14}[0-9]$")) {
            isValid = true;
        }
        return isValid;
    }

    /**
     * Method that validates the format of an email.
     * @param email , the email to validate.
     * @return a true boolean if it's valid, or false if it's not.
     */
    public static boolean validateEmail(String email) {
        boolean isValid = false;

        if (email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            isValid=true;
        }

        return isValid;
    }

}
