package com.codecool.chess;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

class BlackKnightChampionFinder {

    private String playerOne = null, playerTwo = null;
    private final int[] results = new int[]{0, 0};

    public String calculateBlackKnightChampion(String fileName) {
        readGames(fileName);
        return whoWon();
    }

    private String whoWon() {
        if (results[0] == results[1]) return "draw";
        if (results[0] > results[1]) return playerOne;
        return playerTwo;
    }

    private void readGames(String fileName) {
        try {
            List<String> lines = Files.readAllLines(Path.of(fileName));

            for (int i = 0; i < lines.size() / 9; i++) {
                String playerName = lines.get(i * 9);

                if (playerOne == null) playerOne = playerName;
                else if (playerTwo == null && !playerOne.equals(playerName)) playerTwo = playerName;

                String[][] game = new String[8][8];
                for (int j = 0; j < 8; j++) {
                    game[j] = lines.get(j + 1 + (i * 9)).split(",");
                }

                if (isWin(game)) {
                    if (playerName.equals(playerOne)) results[0]++;
                    else results[1]++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean isWin(String[][] game) {
        int[] bk = new int[0];
        int[] bkTwo = new int[0];
        int[] wk = new int[0];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (game[i][j].equals("wK")) wk = new int[]{i, j};
                else if (game[i][j].equals("bk")) {
                    if (bk.length == 0) bk = new int[]{i, j};
                    else bkTwo = new int[]{i, j};
                }
            }
        }
        return checkmate(wk, bk) || (bkTwo.length != 0 && checkmate(wk, bkTwo));
    }

    private boolean checkmate(int[] wk, int[] bk) {
        String distance = String.format("%.2f", Math.sqrt(Math.pow(wk[0] - bk[0], 2) + Math.pow(wk[1] - bk[1], 2)));
        return distance.equals("2,24");
    }
}
