package pl.lan_wizard.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int faulTeamA = 0;
    int outTeamA = 0;
    int freeThrowTeamA = 0;
    int scoreTeamB = 0;
    int faulTeamB = 0;
    int outTeamB = 0;
    int freeThrowTeamB = 0;

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
    public void reset(View view){
        scoreTeamA = 0;
         faulTeamA = 0;
         outTeamA = 0;

        freeThrowTeamA = 0;
         scoreTeamB = 0;
         faulTeamB = 0;
         outTeamB = 0;
         freeThrowTeamB = 0;
        displayForTeamB(scoreTeamB,faulTeamB,outTeamB,freeThrowTeamB);
        displayForTeamA(scoreTeamA,faulTeamA,outTeamA,freeThrowTeamA);
        

    }
    
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score, int faul, int out, int free) {
        TextView scoreView = (TextView) findViewById(R.id.scoreTeamA);
        scoreView.setText(String.valueOf(score));
        TextView faulView = (TextView) findViewById(R.id.faulsTeamA);
        faulView.setText(String.valueOf(faul));
        TextView ouitView = (TextView) findViewById(R.id.outsTeamA);
        ouitView.setText(String.valueOf(out));
        TextView freeeView = (TextView) findViewById(R.id.freeThrowsTeamA);
        freeeView.setText(String.valueOf(free));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score, int faul, int out, int free) {
        TextView scoreView = (TextView) findViewById(R.id.scoreTeamB);
        scoreView.setText(String.valueOf(score));
        TextView faulView = (TextView) findViewById(R.id.faulsTeamB);
        faulView.setText(String.valueOf(faul));
        TextView ouitView = (TextView) findViewById(R.id.outsTeamB);
        ouitView.setText(String.valueOf(out));
        TextView freeeView = (TextView) findViewById(R.id.freeThrowsTeamB);
        freeeView.setText(String.valueOf(free));
    }
}
