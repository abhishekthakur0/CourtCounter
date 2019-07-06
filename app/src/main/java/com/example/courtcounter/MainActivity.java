package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreeforTeamA(View v)
    {
        scoreTeamA = scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoforTeamA(View v)
    {
        scoreTeamA = scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }
    public void addOneforTeamA(View v)
    {
        scoreTeamA = scoreTeamA+1;
        displayForTeamA(scoreTeamA);

    }
    public void addThreeforTeamB(View v)
    {
        scoreTeamB = scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }
    public void addTwoforTeamB(View v)
    {
        scoreTeamB = scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }
    public void addOneforTeamB(View v)
    {
        scoreTeamB = scoreTeamB+1;
        displayForTeamB(scoreTeamB);

    }
    public void reset(View v)
    {
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
    }
}
