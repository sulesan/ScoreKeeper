package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreHomeTeam = 0;
    int scoreAwayTeam = 0;
    int foulHomeTeam = 0;
    int offsideHomeTeam = 0;
    int foulAwayTeam = 0;
    int offsideAwayTeam = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    public void addGoalForHomeTeam(View v) {
        scoreHomeTeam = scoreHomeTeam + 1;
        displayForHomeTeamScore(scoreHomeTeam);
    }

    public void addFoulForHomeTeam(View v) {
        foulHomeTeam = foulHomeTeam + 1;
        String foulHomeTeamMessage = "FOUL: " + foulHomeTeam;
        displayHomeTeamFoulMessage (foulHomeTeamMessage);
    }

    public void addOffsideForHomeTeam(View v) {
        offsideHomeTeam = offsideHomeTeam + 1;
        String offsideHomeTeamMessage = "OFFSIDE: " + offsideHomeTeam;
        displayHomeTeamOffsideMessage (offsideHomeTeamMessage);
    }



    public void addGoalForAwayTeam(View v) {
        scoreAwayTeam = scoreAwayTeam + 1;
        displayForAwayTeamScore(scoreAwayTeam);
    }

    public void addFoulForAwayTeam(View v) {
        foulAwayTeam = foulAwayTeam + 1;
        String foulAwayTeamMessage = "FOUL: " + foulAwayTeam;
        displayAwayTeamFoulMessage (foulAwayTeamMessage);
    }

    public void addOffsideForAwayTeam(View v) {
        offsideAwayTeam = offsideAwayTeam + 1;
        String offsideAwayTeamMessage = "OFFSIDE: " + offsideAwayTeam;
        displayAwayTeamOffsideMessage (offsideAwayTeamMessage);
    }

    public void resetScore (View v) {
        scoreHomeTeam = 0;
        scoreAwayTeam = 0;
        foulHomeTeam = 0;
        foulAwayTeam = 0;
        offsideHomeTeam = 0;
        offsideAwayTeam = 0;
        displayForHomeTeamScore(scoreHomeTeam);
        displayForAwayTeamScore(scoreAwayTeam);
        displayForHomeTeamFoul(foulHomeTeam);
        displayForAwayTeamFoul(foulAwayTeam);
        displayForHomeTeamOffside(offsideHomeTeam);
        displayForAwayTeamOffside(offsideAwayTeam);
    }

    /**
     * Displays the given score for Home Team.
     */

    public void displayForHomeTeamScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_team_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * This method displays the given foul for home team as message.
     */
    private void displayHomeTeamFoulMessage(String message) {
        TextView homeTeamFoul = (TextView) findViewById(R.id.home_team_foul);
        homeTeamFoul.setText(message);
    }

    public void displayForHomeTeamFoul(int foulHomeTeam) {
        TextView foulView = (TextView) findViewById(R.id.home_team_foul);
        foulView.setText(String.valueOf("FOUL"));
    }

    /**
     * This method displays the given offside for home team as message.
     */
    private void displayHomeTeamOffsideMessage(String message) {
        TextView homeTeamOffside = (TextView) findViewById(R.id.home_team_offside);
        homeTeamOffside.setText(message);
    }

    public void displayForHomeTeamOffside(int offsideHomeTeam) {
        TextView offsideView = (TextView) findViewById(R.id.home_team_offside);
        offsideView.setText(String.valueOf("OFFSIDE"));
    }

    /**
     * Displays the given score for Away Team.
     */
    public void displayForAwayTeamScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.away_team_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method displays the given foul for away team as message.
     */
    private void displayAwayTeamFoulMessage(String message) {
        TextView awayTeamFoul = (TextView) findViewById(R.id.away_team_foul);
        awayTeamFoul.setText(message);
    }

    public void displayForAwayTeamFoul(int foulAwayTeam) {
        TextView foulView = (TextView) findViewById(R.id.away_team_foul);
        foulView.setText(String.valueOf("FOUL"));
    }

    /**
     * This method displays the given offside for away team as message.
     */
    private void displayAwayTeamOffsideMessage(String message) {
        TextView awayTeamOffside = (TextView) findViewById(R.id.away_team_offside);
        awayTeamOffside.setText(message);
    }

    public void displayForAwayTeamOffside(int offsideAwayTeam) {
        TextView foulView = (TextView) findViewById(R.id.away_team_offside);
        foulView.setText(String.valueOf("OFFSIDE"));
    }
}
