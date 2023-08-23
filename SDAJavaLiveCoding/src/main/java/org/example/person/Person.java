package org.example.person;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {

    private String name;
    private String email;
    private String CNP;

    public Person(String name, String email, String cnp) {
        this.name = createNameWithPrefix(name);
        this.email = isEmailValid(email) ? email : null;
        this.CNP = isCnpValid(cnp) ? cnp : null;
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCNP() {
        return CNP;
    }

    public static boolean isCnpValid(String cnp) {
        String emailRegex = "^[1-9]\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])(0[1-9]|[1-4]\\d|5[0-2]|99)(00[1-9]|0[1-9]\\d|[1-9]\\d\\d)\\d$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(cnp);
        return matcher.matches();
    }

    public static String createNameWithPrefix(String name) {
        boolean seTerminaCuA = name.endsWith("a");

        final String prefix = seTerminaCuA ? "Ms" : "Mr";

        return prefix + " " + name;
    }

    public static boolean isEmailValid(String email) {
        String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";

        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", CNP='" + CNP + '\'' +
                '}';
    }
}