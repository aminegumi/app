package ma.projet.tp1_last;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ShowActivity extends AppCompatActivity {

    TextView fullname, email, phone, adress, city;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_show);

        fullname = findViewById(R.id.fullnameShow);
        phone = findViewById(R.id.phone);
        email = findViewById(R.id.email);
        adress = findViewById(R.id.adress);
        city = findViewById(R.id.city);

        Intent intent = getIntent();

        fullname.setText(intent.getStringExtra("fullName"));
        email.setText(intent.getStringExtra("email"));
        phone.setText(intent.getStringExtra("phone"));
        adress.setText(intent.getStringExtra("adress"));
        city.setText(intent.getStringExtra("city"));


    }
}