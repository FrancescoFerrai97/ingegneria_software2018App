package francescoferrai.ingegneria_software2018app;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import francescoferrai.ingegneria_software2018app.databinding.ActivityMainBinding;
import francescoferrai.ingegneria_software2018app.model.VerticalFloor;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    BindAdapterGeneral adapter;

    List<VerticalFloor> floorList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        recyclerView = binding.recyclerView;

        floorList = useMockList();


        adapter = new BindAdapterGeneral(floorList,R.layout.item_floor,BR.floor,null);
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
}
