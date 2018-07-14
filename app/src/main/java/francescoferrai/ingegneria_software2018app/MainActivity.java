package francescoferrai.ingegneria_software2018app;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v4.util.ArrayMap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import francescoferrai.ingegneria_software2018app.databinding.ActivityMainBinding;
import francescoferrai.ingegneria_software2018app.model.VerticalFloor;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    BindAdapterGeneral adapter;

    List<VerticalFloor> floorList;

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        recyclerView = binding.recyclerView;

        floorList = useMockList();

        FloorClickListener floorClickListener = new FloorClickListener(this);

        Map<Integer,Object> optionalVariable = new ArrayMap<>();
        optionalVariable.put(BR.v, floorClickListener);


        adapter = new BindAdapterGeneral(floorList,R.layout.item_floor,BR.floor,optionalVariable);

        linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    public List<VerticalFloor> useMockList(){
        List<VerticalFloor> floorList = new ArrayList<>();

        floorList.add(new VerticalFloor("001", "0","",4));
        floorList.add(new VerticalFloor("002", "1","",4));
        floorList.add(new VerticalFloor("003", "2","",4));
        floorList.add(new VerticalFloor("004", "3","",4));
        floorList.add(new VerticalFloor("005", "4","",4));
        floorList.add(new VerticalFloor("006", "5","",4));
        floorList.add(new VerticalFloor("007", "6","",4));
        floorList.add(new VerticalFloor("008", "7","",4));
        floorList.add(new VerticalFloor("009", "8","",4));

        return floorList;
    }


    public void goToActivity() {
        Intent intent = new Intent(this, FloorActivity.class);
        startActivity(intent);
    }

    public class FloorClickListener{
        WeakReference<MainActivity> mainActivity;

        public FloorClickListener(MainActivity mainActivity) {
            if(mainActivity != null){
                this.mainActivity = new WeakReference<>(mainActivity);
            }
        }

        public void onClickFloor(){
            MainActivity activity;
            if (mainActivity.get() != null){
                activity = mainActivity.get();

                activity.goToActivity();
            }
        }
    }

}
