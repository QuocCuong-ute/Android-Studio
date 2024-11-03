package quoccuong.com.contentprovider;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.Telephony;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import quoccuong.com.contentprovider.model.Contact;
import quoccuong.com.contentprovider.model.Message;

public class TinNhan extends AppCompatActivity {

    private static final int REQUEST_CODE_ASK_PERMISSIONS = 1001;
    private static final int PERMISSIONS_REQUEST_READ_SMS = 200;

    ListView lvTinNhan;
    ArrayList<Message> dsTinNhan;
    ArrayAdapter<Message> adapterTinNhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tinnhan);

        addControls();
        readMessages();

    }

    private void readMessages() {

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Uri uri = Telephony.Sms.Inbox.CONTENT_URI;
        Cursor cursor = getContentResolver().query(uri, null, null, null, null);
      //  dsTinNhan.clear();

            while (cursor.moveToNext()) {

                int indexphoneNumber = cursor.getColumnIndex(Telephony.Sms.ADDRESS);
                int indexTimeStamp = cursor.getColumnIndex(Telephony.Sms.DATE);
                int indexBody = cursor.getColumnIndex(Telephony.Sms.BODY);

                String phoneNumber = cursor.getString(indexphoneNumber);
                String timeStamp = cursor.getString(indexTimeStamp);
                String body = cursor.getString(indexBody);

                dsTinNhan.add(new Message(phoneNumber, sdf.format(Long.parseLong(timeStamp)),body));
                adapterTinNhan.notifyDataSetChanged();
            }
        }
    private void addControls() {
        lvTinNhan = findViewById(R.id.lvTinNhan);
        dsTinNhan = new ArrayList<>();;
        adapterTinNhan = new ArrayAdapter<>(
                TinNhan.this, R.layout.item_tinnhan,dsTinNhan
        );
        lvTinNhan.setAdapter(adapterTinNhan);
    }
}