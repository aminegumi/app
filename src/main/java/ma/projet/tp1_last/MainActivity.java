package ma.projet.tp1_last;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    EditText fullname, phone, email, adress;
    Spinner city;

    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        fullname = findViewById(R.id.fullname);
        phone = findViewById(R.id.phone);
        email = findViewById(R.id.email);
        adress = findViewById(R.id.adress);
        city = findViewById(R.id.city);
        send = findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShowActivity.class);
                intent.putExtra("fullName", fullname.getText().toString());
                intent.putExtra("email", email.getText().toString());
                intent.putExtra("phone", phone.getText().toString());
                intent.putExtra("adress", adress.getText().toString());
                intent.putExtra("city", city.getSelectedItem().toString());
                startActivity(intent);
            }
        });


    }
}