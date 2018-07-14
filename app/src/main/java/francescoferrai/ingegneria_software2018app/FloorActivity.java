package francescoferrai.ingegneria_software2018app;

import android.app.Activity;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import francescoferrai.ingegneria_software2018app.databinding.ActivityFloorBinding;
import francescoferrai.ingegneria_software2018app.model.Room;

/**
 * Created by Francesco on 14/07/2018.
 */

public class FloorActivity extends Activity {

//    public static FloorActivity newInstance() {
//        FloorActivity myFragment = new FloorActivity();
//        Bundle args = new Bundle();
//        myFragment.setArguments(args);
//        return myFragment;
//    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityFloorBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_floor);

        binding.setRoom1(new Room("001",121234,123123,324234,true));

        binding.setRoom2(new Room("001",121234,123123,324234,false));
    }

    @BindingAdapter("roomState")
    public static void handleStateRoom(TextView textView, Room room){
        if(textView != null){
            if(room != null){
                boolean open = room.isOpen();

                if(open){
                    textView.setCompoundDrawablesWithIntrinsicBounds(
                            R.drawable.pallino_verde,
                            0,
                            0,
                            0);
                }else {
                    textView.setCompoundDrawablesWithIntrinsicBounds(
                            R.drawable.pallino_rosso,
                            0,
                            0,
                            0);
                }

                textView.setText(open ? "aperto" : "chiuso");

                textView.setTextColor(open ? textView.getContext().getResources().getColor(R.color.colorAccent)
                        : textView.getContext().getResources().getColor(R.color.colorPrimaryDark) );
            }
        }
    }
}
