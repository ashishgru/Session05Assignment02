package ashishrpa.session05assignment02;

import android.app.SearchManager;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {
    Button button;
    Intent intentContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.contact_button1);

        button.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
            try{
                intentContact = new Intent();
                intentContact.setAction(android.content.Intent.ACTION_VIEW);
                intentContact.setData(ContactsContract.Contacts.CONTENT_URI);
                startActivity(intentContact);
            }
            catch (Exception excp){
                Log.e("Contacts :","Error");
            }
            }

        });
    }
}
