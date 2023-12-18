package dev.brus.app;

import dev.brus.app.models.Person;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Person personOne= new Person("Luis", "Perez", "12345678R", 1950, "Italia", 'H');
        Person personTwo = new Person("Maria", "Silva", "23456789Q", 1985, "Portugal", 'M');





        personOne.printToScreen();
        personTwo.printToScreen();
    
    }

}
