package guru.springframework.controllers;
import guru.springframework.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


public class PropertyInjectedControllerTest {

    private guru.springframework.controllers.PropertyInjectedController PropertyInjectedController;

    @BeforeEach
    public void setUp() throws Exception{
        this.PropertyInjectedController = new PropertyInjectedController();
        this.PropertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws  Exception{
        assertEquals(GreetingServiceImpl.HELLO_GURUS, PropertyInjectedController.sayHello());
    }

}
