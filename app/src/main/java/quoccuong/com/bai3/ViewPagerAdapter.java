package quoccuong.com.bai3;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import quoccuong.com.bai3.profiletab.Tab1Fragment;
import quoccuong.com.bai3.profiletab.Tab2Fragment;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new Tab1Fragment();
        } else {
            return new Tab2Fragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}

