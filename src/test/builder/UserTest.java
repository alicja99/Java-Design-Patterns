package test.builder;

import com.company.builder.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class UserTest {
        @Test
        public void createUserWithFirstNameLastNameAndGender() {

            User user = new User.UserBuilder("Jan", "Kowalski")
                    .gender("male")
                    .build();

            //
            assertEquals("Jan", user.getFirstName(), "First name should be Jan");
            assertEquals("Kowalski", user.getLastName(), "Last name should be Kowalski");
            assertEquals("male", user.getGender(), "gender should be male");
            assertEquals(0, user.getAge(), "Age should be null");
            assertNull(user.getEmail(), "Email should be null");
            assertNull(user.getPhone(), "Phone should be null");
        }

         @Test
         public void createUserWithOnlyFirstNameAndLastName() {
             User user  = new User.UserBuilder("Jan", "Kowalski")
                     .build();
             //

             assertEquals("Jan", user.getFirstName(), "First name should be Jan");
             assertEquals("Kowalski", user.getLastName(), "Last name should be Kowalski");
             assertEquals(0, user.getAge(), "Age should be null");
             assertNull(user.getEmail(), "Email should be null");
             assertNull(user.getGender(), "gender should be null");
             assertNull(user.getPhone(), "Phone should be null");
         }

        @Test
        public void createUserWithAllParameters() {
            User user  = new User.UserBuilder("Jan", "Kowalski")
                    .address("Fiołkowa 14")
                    .age(25)
                    .email("jan.kowalski@gmail.com")
                    .gender("male")
                    .phone("783456789")
                    .build();
            //
            assertEquals("Jan", user.getFirstName(), "First name should be Jan");
            assertEquals("Kowalski", user.getLastName(), "Last name should be Kowalski");
            assertEquals(25, user.getAge(), "Age should be 25");
            assertEquals("jan.kowalski@gmail.com", user.getEmail(), "Email should be jan.kowalski@gmail.com");
            assertEquals("male", user.getGender(), "gender should be male");
            assertEquals("783456789", user.getPhone(), "Phone should be 783456789");

        }


}