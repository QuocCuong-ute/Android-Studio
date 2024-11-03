package quoccuong.com.contentprovider;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CONTACTS_ASK_PERMISSIONS = 1001;
    private static final int REQUEST_SMS_ASK_PERMISSIONS = 1002;

    Button btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        addControl();
        addEvents();
    }

    private void addEvents() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyMoManHinhDanhBa();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyMoManHinhTinNhan();
            }
        });
    }

    private void xuLyMoManHinhTinNhan() {
            Intent intent = new Intent(MainActivity.this, TinNhan.class);
            intent.setClassName("quoccuong.com.contentprovider","quoccuong.com.contentprovider.TinNhan");
            startActivity(intent);
    }

    private void xuLyMoManHinhDanhBa() {
            Intent intent = new Intent(MainActivity.this, DanhBa.class);
            intent.setClassName("quoccuong.com.contentprovider", "quoccuong.com.contentprovider.DanhBa");
            startActivity(intent);
    }

    private void addControl() {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
    }
}