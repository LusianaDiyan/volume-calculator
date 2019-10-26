package applusiana.apkvolume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener*/ {

    EditText etPanjang, etLebar, etTinggi, etVolume;
    Button btnHitung, btnHapus, btnKeluar;

    /*private static final int TIME_DELAY = 2000;
    private static long back_pressed;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPanjang = findViewById(R.id.etPanjang);
        etLebar = findViewById(R.id.etLebar);
        etTinggi = findViewById(R.id.etTinggi);
        etVolume = findViewById(R.id.etVolume);

        btnHitung = findViewById(R.id.btnHitung);
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double panjang = Double.valueOf(etPanjang.getText().toString());
                double lebar = Double.valueOf(etLebar.getText().toString());
                double tinggi = Double.valueOf(etTinggi.getText().toString());

                double volume = panjang * lebar * tinggi;

                /*double volume = Double.valueOf(etVolume.getText().toString());*/

                etVolume.setText(String.valueOf(volume));
            }
        });

        btnHapus = findViewById(R.id.btnHapus);
        btnHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etPanjang.setText("");
                etTinggi.setText("");
                etLebar.setText("");
                etVolume.setText("");
            }
        });

        btnKeluar = findViewById(R.id.btnKeluar);
        btnKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }

           /* @Override
            public void onBackPressed(){
                if (back_pressed + TIME_DELAY > System.currentTimeMillis()){
                    super.onBackPressed();
                }else {
                    Toast.makeText(getBaseContext(), "Press once again to exit!",
                            Toast.LENGTH_SHORT).show();
                }
                back_pressed = System.currentTimeMillis();
            }*/
        });
    }

    /*@Override
    public void onClick(View v) {

    }*/
}
