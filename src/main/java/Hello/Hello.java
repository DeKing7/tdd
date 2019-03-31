package Hello;

public class Hello {
    public String sayHello(String name) {
        String przywitanie = "Hello, " + name + ".";

        if (name.isEmpty()) {
            return "You cannot provide an empty name.";
        } else if (name.contains("Jan") && !name.contains("ek")) {
            return przywitanie
                    .replace("Hello", "Witaj")
                    .toUpperCase()
                    .replace(".", "!");
        } else {
            if (name.matches("^[0-9]*$")) {
                return "Sorry, can't use numbers!";
            } else {
                return przywitanie;
            }
        }
    }

    public void sayHello() throws NullPointerException {
        // przypominam, ten przypadek nie ma sensu, jest tylko żeby pokazać throwa
        throw new NullPointerException("Null name...");
    }
}






