package pl.lan_wizard.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scoreTeamA = 0;
    private int faulTeamA = 0;
    private int outTeamA = 0;
    private int freeThrowTeamA = 0;
    private int scoreTeamB = 0;
    private int faulTeamB = 0;
    private int outTeamB = 0;
    private int freeThrowTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
// procedures for team A
    public void addScoreTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA,faulTeamA,outTeamA,freeThrowTeamA);
           }

    public void addFaulTeamA(View view){
        faulTeamA = faulTeamA + 1;
        displayForTeamA(scoreTeamA,faulTeamA,outTeamA,freeThrowTeamA);
    }
    public void addOutTeamA(View view){
        outTeamA = outTeamA + 1;
        displayForTeamA(scoreTeamA,faulTeamA,outTeamA,freeThrowTeamA);
    }
    public void addFreeTeamA(View view){
        freeThrowTeamA = freeThrowTeamA + 1;
        displayForTeamA(scoreTeamA,faulTeamA,outTeamA,freeThrowTeamA);
    }
//Procedures for Team B
public void addScoreTeamB(View view){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB,faulTeamB,outTeamB,freeThrowTeamB);
    }

    public void addFaulTeamB(View view){
        faulTeamB = faulTeamB + 1;
        displayForTeamB(scoreTeamB,faulTeamB,outTeamB,freeThrowTeamB);
    }
    public void addOutTeamB(View view){
        outTeamB = outTeamB + 1;
        displayForTeamB(scoreTeamB,faulTeamB,outTeamB,freeThrowTeamB);
    }
    public void addFreeTeamB(View view){
        freeThrowTeamB = freeThrowTeamB + 1;
        displayForTeamB(scoreTeamB,faulTeamB,outTeamB,freeThrowTeamB);
    }
    
    /**
     * Displays the given score for Team A.
     */
    private void displayForTeamA(int score, int faul, int out, int free) {
        TextView scoreView = (TextView) findViewById(R.id.scoreTeamA);
        scoreView.setText(String.valueOf(score));
        TextView faulView = (TextView) findViewById(R.id.faulsTeamA);
        scoreView.setText(String.valueOf(faul));
        TextView ouitView = (TextView) findViewById(R.id.outsTeamA);
        scoreView.setText(String.valueOf(out));
        TextView freeeView = (TextView) findViewById(R.id.freeThrowsTeamA);
        scoreView.setText(String.valueOf(free));
    }
    /**
     * Displays the given score for Team B.
     */
    private void displayForTeamB(int score, int faul, int out, int free) {
        TextView scoreView = (TextView) findViewById(R.id.scoreTeamB);
        scoreView.setText(String.valueOf(score));
        TextView faulView = (TextView) findViewById(R.id.faulsTeamB);
        scoreView.setText(String.valueOf(faul));
        TextView ouitView = (TextView) findViewById(R.id.outsTeamB);
        scoreView.setText(String.valueOf(out));
        TextView freeeView = (TextView) findViewById(R.id.freeThrowsTeamB);
        scoreView.setText(String.valueOf(free));
    }
}
