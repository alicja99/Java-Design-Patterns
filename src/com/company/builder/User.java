package com.company.builder;

public class User {
    /**
     * @param firstName required
     * @param lastName  required
     * other are optional
     */

    private final String firstName;
    private final String lastName;
    private final String address;
    private final String phone;
    private final String email;
    private final String gender;
    private final int age;

    public User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.address = builder.address;
        this.phone = builder.phone;
        this.email = builder.email;
        this.gender = builder.gender;
        this.age = builder.age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private String address;
        private String phone;
        private String email;
        private String gender;
        private int age;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder address(String address){
            this.address = address;
            return this;
        }

        public UserBuilder phone(String phone){
            this.phone = phone;
            return this;
        }

        public UserBuilder email(String email){
            this.email = email;
            return this;
        }

        public UserBuilder gender(String gender){
            this.gender = gender;
            return this;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        public User build() {
            User user =  new User(this);
            return user;
        }
    }

}

