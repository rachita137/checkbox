package tatastrive.application.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


    }


    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkbox_meat:
                if (checked) {
                    Toast.makeText( this, "meat selected", Toast.LENGTH_SHORT ).show();
                    // Put some meat on the sandwich
                }
            else
                // Remove the meat
                break;
            case R.id.checkbox_cheese:
                if (checked) {// Cheese me
                    Toast.makeText( this, "cheese selected", Toast.LENGTH_SHORT ).show();
                }
            else
                // I'm lactose intolerant
                break;
            // TODO: Veggie sandwich
        }
    }
}
