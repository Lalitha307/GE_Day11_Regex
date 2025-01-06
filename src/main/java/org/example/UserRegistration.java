package org.example;
// UC1: Validate First Name
public class UserRegistration {
    // Method to validate first name
    public boolean validateFirstName(String firstName) {
        String regex = "^[A-Z][a-zA-Z]{2,}$"; // Starts with uppercase and at least 3 characters
        return firstName.matches(regex);
    }

    // Method to validate last name (UC2)
    public boolean validateLastName(String lastName) {
        String regex = "^[A-Z][a-zA-Z]{2,}$"; // Starts with uppercase and at least 3 characters
        return lastName.matches(regex);
    }

    // Method to validate email (UC3)
    public boolean validateEmail(String email) {
        String regex = "^[a-zA-Z0-9]+([._+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$"; // Valid email regex
        return email.matches(regex);
    }

    // Method to validate mobile number (UC4)
    public boolean validateMobileNumber(String mobileNumber) {
        String regex = "^[0-9]{1,3} [0-9]{10}$"; // Country code followed by space and 10-digit number
        return mobileNumber.matches(regex);
    }


    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        System.out.println("First Name Validation:");
        System.out.println(userRegistration.validateFirstName("John")); // Should return true
        System.out.println(userRegistration.validateFirstName("jo"));   // Should return false
        System.out.println("Last Name Validation:");
        System.out.println(userRegistration.validateLastName("Doe"));  // Should return true
        System.out.println(userRegistration.validateLastName("do"));   // Should return false

        System.out.println("Email Validation:");
        System.out.println(userRegistration.validateEmail("abc.xyz@bl.co.in")); // Should return true
        System.out.println(userRegistration.validateEmail("abc@.com.my"));     // Should return false
        System.out.println("Mobile Number Validation:");
        System.out.println(userRegistration.validateMobileNumber("91 9919819801")); // Should return true
        System.out.println(userRegistration.validateMobileNumber("919919819801"));  // Should return false
    }
}