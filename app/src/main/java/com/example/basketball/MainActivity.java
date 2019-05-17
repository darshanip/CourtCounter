package com.example.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreForTeamA = 0;
    int scoreForTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(11);
        displayForTeamB(22);
    }

    public void addThreeForTeamA(View v){
        scoreForTeamA+=3;
        displayForTeamA(scoreForTeamA);
    }

    public void addTwoForTeamA(View v){
        scoreForTeamA+=2;
        displayForTeamA(scoreForTeamA);
    }

    public void addOneForTeamA(View v){
        scoreForTeamA+=1;
        displayForTeamA(scoreForTeamA);
    }

    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamB(View v){
        scoreForTeamB+=3;
        displayForTeamB(scoreForTeamB);
    }

    public void addTwoForTeamB(View v){
        scoreForTeamB+=2;
        displayForTeamB(scoreForTeamB);
    }

    public void addOneForTeamB(View v){
        scoreForTeamB+=1;
        displayForTeamB(scoreForTeamB);
    }

    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View v){
        scoreForTeamA=0;
        scoreForTeamB=0;
        displayForTeamA(scoreForTeamA);
        displayForTeamB(scoreForTeamB);
    }
}
