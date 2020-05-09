package test.singleton;

import com.company.singleton.Singleton;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingletonTest {
    @Test
    public void createTwoSingletonInstancesAndConfirmItsTheSameInstance(){
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        //
        assertThat(instance, is(instance2));

    }

}
