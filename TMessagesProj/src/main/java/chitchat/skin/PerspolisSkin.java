package chitchat.skin;

import com.tisad.chitchat2.R;

/**
 * Created by RaminBT on 26/01/2016.
 */
public class PerspolisSkin extends Skin {
    @Override
    public int id() {
        return 21;
    }

    @Override
    public int actionbarColor() {
        return 0xffED1B23;
    }

    @Override
    public int drawerNamesColor() {
        return 0xffB5161B;
    }

    @Override
    public int onlineStatusColor() {
        return 0;
    }

    @Override
    public int unreadEyeColor() {
        return 0xff16E19C;
    }

    @Override
    public int light() {
        return 0xffffffff;
    }

    @Override
    public int themePicture() {
        return R.drawable.persepolis_theme;
    }

    @Override
    public int actionPicture() {
        return R.drawable.perspolis_2;
    }

    @Override
    public int actionSmallPicture() {
        return R.drawable.perspolis_3;
    }

    @Override
    public int tileImage() {
        return R.drawable.barca_tile;
    }


    @Override
    public boolean hideDrawerProfile() {
        return true;
    }

    @Override
    public String drawerProfileTitle() {
        return "پرسپولیس";
    }

    @Override
    public String drawerProfileSubtitle() {
        return "ایران, تهران";
    }
}
