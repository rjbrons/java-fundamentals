/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.FileNotFoundException;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) throws FileNotFoundException {
        Linter lint = new Linter();
        lint.lint("resources/gates.js");
        System.out.println(new App().getGreeting());
    }
}
