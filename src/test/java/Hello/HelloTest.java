package Hello;

    import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


    public class HelloTest {



        Hello welcommer = new Hello();

        @Test
        public void shouldSayHello() {
            assertEquals(welcommer.sayHello("John"), String.format("Hello, %s.", "John"));
            // albo "Hello, John." -> nie ma znaczenia,
            // to tylko by pokazać, że można testować skomplikowane rzeczy
        }

        @Test
        public void shouldHandleEmpty() {

            assertEquals(welcommer.sayHello(""), "You cannot provide an empty name.");
        }

        @Test
        public void shouldNotGreetNumbers() {
            assertNotEquals(welcommer.sayHello("1"), "Hello, 1.");
            assertNotEquals(welcommer.sayHello("999"), "Hello, 999.");
            assertNotEquals(welcommer.sayHello("60"), "Hello, 60.");
            assertNotEquals(welcommer.sayHello("5"), "Hello, 5.");
        }

        @Test
        public void shouldHandleNull() {
            NullPointerException myThrowable = assertThrows(NullPointerException.class, welcommer::sayHello);
            assert(myThrowable.getMessage().equals("Null name..."));
        }

        @Test
        public void shouldGreetJanInPolishAndCapitalLetters() {
            assertTrue(welcommer.sayHello("Jan").contains("WITAJ, JAN!"));
        }

        @Test
        public void shouldNotUseShortPolishNames() {
            assertFalse(welcommer.sayHello("Janek").contains("WITAJ, JANEK!"));
        }
    }


