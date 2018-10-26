package profilestorymobileconcept.ondade.com.profilestorymobileconcept;

import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import java.util.Objects;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {

    // UI vars
    @BindView(R.id.act_Main_Toolbar)
    Toolbar toolbar;
    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Once everything related to the activity creation is done, we have to setup the UI
        setupUI();
    }

    @Override
    public void onBackPressed() {
        // This override is just to avoid finishing the activity when pressing the back button in the navbar
        // Instead, we fire the same action as if we press the back arrow button in the action bar
        onBackArrowClicked();
    }

    // Name: setupUI
    // Params: None
    // Function: It configures all the UI components of this activity
    // Returns: Nothing
    private void setupUI(){
        // Setup the action bar
        if(toolbar==null)
            toolbar = findViewById(R.id.act_Main_Toolbar);

        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new OnClickBackButtonOnActionBarListener());
        Objects.requireNonNull(getSupportActionBar()).setTitle(""); // We don't want a title on this action bar
        // The next line is used to remove the shadow on this action bar (since in the concept design the action bar has no shadow)
        // Note: I know, I know, I could change the elevation on the activity_main.xml file, but I wanted to do this here since
        // I want to do all the changes in the same place
        getSupportActionBar().setElevation(0);
    }

    // Name: onBackArrowClicked
    // Params: None
    // Function: It manages the event when the user press the back arrow or press the navbar back arrow
    // Returns: Nothing
    private void onBackArrowClicked(){
        Toast.makeText(MainActivity.this,"Clicked back button...",Toast.LENGTH_SHORT).show();
    }

    // Listeners
    // (Note: Here goes just private listeners, listeners used just in this activity)

    // Name: OnClickBackButtonOnActionBarListener
    // Type: OnClickListener
    // When fires: When the user clicks on the back arrow button on the action bar
    // Function: It calls the onBackPressed() function
    private class OnClickBackButtonOnActionBarListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            onBackArrowClicked();
        }
    }
}
