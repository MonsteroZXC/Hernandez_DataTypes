package mcm.edu.ph.hernandez_datatypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;

        display = findViewById(R.id.displayTxt);


        String firstName = "Gio Emmanuel";
        char middleInitial = 'J';
        String lastname = "Hernandez";
        int myAge = 18;
        float myDreamTVLGrade = 98.8f;
        String stringBuitNumber = "202.23";
        double myMoney = 99999.99;

        myMoney = Double.parseDouble(stringBuitNumber);

        display.setText("My Name is "+firstName+ " "
                +String.valueOf(middleInitial)+ ". "
                 +lastname+ "\nand my age is "
                +myAge+ ".\nI want my grade in TVL3 to be "
                + String.valueOf(myDreamTVLGrade));


        boolean amIMarried = false;

    }
}