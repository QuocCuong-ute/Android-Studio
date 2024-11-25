package quoccuong.com.baikiemtra;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        BottomNavigationView botNavi = findViewById(R.id.bottomNavi);

        loadFragment(new HomeFrag());


    }


    private void loadFragment(HomeFrag homeFrag) {
        Fragment fragment = null;
        if (fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .commit();
        }
    }
}