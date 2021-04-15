package com.codecool.chess;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BlackKnightChampionFinderTest {
    @Test
    void test_calculateBlackKnightChampion_returnsDraw() {
        BlackKnightChampionFinder blackKnightChampionFinder = new BlackKnightChampionFinder();
        assertEquals("draw", blackKnightChampionFinder.calculateBlackKnightChampion("src/test/testfiles/test.csv"));
    }

    @Test
    void test_calculateBlackKnightChampion_returnsWinner() {
        BlackKnightChampionFinder blackKnightChampionFinder = new BlackKnightChampionFinder();
        assertEquals("Kasparov", blackKnightChampionFinder.calculateBlackKnightChampion("src/test/testfiles/test1.csv"));
    }
}