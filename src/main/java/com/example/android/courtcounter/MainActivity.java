package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    boolean isGameOver = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playGame(View view) {
        isGameOver = false;
        scoreTeamA = 0;
        scoreTeamB = 0;
        ((TextView) findViewById(R.id.win)).setText("");
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeTeamA(View view) {
        if (!isGameOver) {
            scoreTeamA += 3;
            displayForTeamA(scoreTeamA);
        }
    }

    public void addTwoTeamA(View view) {
        if (!isGameOver) {
            scoreTeamA += 2;
            displayForTeamA(scoreTeamA);
        }
    }

    public void addOneTeamA(View view) {
        if (!isGameOver) {
            scoreTeamA += 1;
            displayForTeamA(scoreTeamA);
        }
    }

    public void addThreeTeamB(View view) {
        if (!isGameOver) {
            scoreTeamB += 3;
            displayForTeamB(scoreTeamB);
        }
    }

    public void addTwoTeamB(View view) {
        if (!isGameOver) {
            scoreTeamB += 2;
            displayForTeamB(scoreTeamB);
        }
    }

    public void addOneTeamB(View view) {
        if (!isGameOver) {
            scoreTeamB += 1;
            displayForTeamB(scoreTeamB);
        }
    }

    public void reset(View view) {
        isGameOver = true;
        TextView winner = (TextView) findViewById(R.id.win);
        if (scoreTeamB > scoreTeamA) {
            winner.setText(R.string.win_b);
        } else if (scoreTeamB < scoreTeamA) {
            winner.setText(R.string.win_a);
        } else {
            winner.setText(R.string.draw);
        }
    }

}
