package quoccuong.com.baikiemtra;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ItemAdapter extends BaseAdapter {
    private Context context;
    private List<Item> itemList;

    public ItemAdapter(Context context, List<Item> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Object getItem(int position) {
        return itemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if (view == null){
            LayoutInflater.from(context).inflate(R.layout.list_item, viewGroup, false);
        }
        Item item = itemList.get(position);

        ImageView imageView = view.findViewById(R.id.imageView);
        TextView titleView = view.findViewById(R.id.Title);
        TextView descriptionView = view.findViewById(R.id.Description);
        Button button = view.findViewById(R.id.buyBtn);

        imageView.setImageResource(item.getImageResID());
        titleView.setText(item.getTitle());
        descriptionView.setText(item.getDescription());

        return view;
    }
}
