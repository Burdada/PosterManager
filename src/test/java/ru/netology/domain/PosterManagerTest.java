package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    PosterManager manager = new PosterManager();

    @Test

    public void shouldGiveList() {

        manager.save("First");
        manager.save("Second");
        manager.save("Third");

        String[] expected = {"First", "Second", "Third"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGiveZero() {
        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGiveOne() {
        manager.save("First");
        String[] expected = {"First"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGiveLimit() {
        manager.save("First");
        manager.save("Second");
        manager.save("Third");
        manager.save("Fourth");
        manager.save("Fifth");
        manager.save("Sixth");
        manager.save("Seventh");
        manager.save("Eighth");
        manager.save("Ninth");
        manager.save("Tenth");

        String[] expected = {"Tenth", "Ninth", "Eighth", "Seventh", "Sixth", "Fifth", "Fourth", "Third", "Second", "First"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGiveOverLimit() {
        manager.save("First");
        manager.save("Second");
        manager.save("Third");
        manager.save("Fourth");
        manager.save("Fifth");
        manager.save("Sixth");
        manager.save("Seventh");
        manager.save("Eighth");
        manager.save("Ninth");
        manager.save("Tenth");
        manager.save("Eleventh");

        String[] expected = {"Eleventh", "Tenth", "Ninth", "Eighth", "Seventh", "Sixth", "Fifth", "Fourth", "Third", "Second"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGiveUnderLimit() {
        manager.save("First");
        manager.save("Second");
        manager.save("Third");
        manager.save("Fourth");
        manager.save("Fifth");
        manager.save("Sixth");
        manager.save("Seventh");
        manager.save("Eighth");
        manager.save("Ninth");


        String[] expected = {"Ninth", "Eighth", "Seventh", "Sixth", "Fifth", "Fourth", "Third", "Second", "First"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}




